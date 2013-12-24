<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset='UTF-8'>
	
	<title>Medical Invoice</title>
	
	<link rel='stylesheet' href='../Stylesheets/invoice-style.css'>
	<link rel='stylesheet' href='../Stylesheets/print.css' media="print">
	<link rel='stylesheet' href='../Stylesheets/jquery-ui.css'>
	<script src='../Scripts/jquery.js'></script>
	<script src='../Scripts/example.js'></script>
	<script src='../Scripts/jquery-ui.min.js'></script>

	<script type="text/javascript">
	
		$(document).ready(function(){
			$(".textbox").autocomplete({
				
	// 				source:"${pageContext.request.contextPath}/get_country_list.do"
					minLength: 1,
			        delay: 500,
					source : function (request, response) {
						
						$.getJSON("${pageContext.request.contextPath}/get_country_list.do", request, function(result) {
							 response($.map(result, function(item){
								 var available = (item.available) > 0 ? item.available : "Out of stock";
								 return {
									 
									 label : item.name + " (total available = " + available + ")",
									 value : item.name,
									 description : item.description,
									 unitprice : item.unitprice
								 }
							 }));
							
						});
					},
					select : function(e ,ui) {
						var numbers = this.id.match(/\d+\.?\d*/g);
						var description = ui.item.description;
						var unitPrice = ui.item.unitprice;
						
						var descId = "desc"+numbers;
						var priceId = "price" + numbers;
						$("#"+descId).text(description);
						$("#"+priceId).text("Rs"+unitPrice);
						
					}
					
				});
			
			  $("#addrow").click(function(){
					  var rowCount = $('#items tr').length;
		
					  var idNo = rowCount - 5;
					  var textBoxId = "suggest" +idNo;
					  var descId = "desc" + idNo;
					  var unitPriceId = "price" + idNo;
		//			  alert(textBoxId);
				    $(".item-row:last").after('<tr class="item-row"><td class="item-name"><div class="delete-wpr"><input type="text" class="textbox" id="'+textBoxId+'" /><a class="delete" href="javascript:;" title="Remove row">X</a></div></td><td class="description"><div id="'+descId+'"></div></td><td><textarea class="cost" id="'+unitPriceId+'" readonly="readonly">Rs0</textarea></td><td><textarea class="qty">0</textarea></td><td><span class="price">Rs0</span></td></tr>');
				    $("#"+textBoxId).autocomplete({
						minLength: 1,
				        delay: 500,
						source : function (request, response) {
							
							$.getJSON("${pageContext.request.contextPath}/get_country_list.do", request, function(result) {
								 response($.map(result, function(item){
									 var available = (item.available) > 0 ? item.available : "Out of stock";
									 return {
										 
										 label : item.name + " (total available = " + available + ")",
										 value : item.name,
										 description : item.description,
										 unitprice : item.unitprice
									 }
								 }));
								
							});
						},
						select : function(e ,ui) {
							var numbers = this.id.match(/\d+\.?\d*/g);
							var description = ui.item.description;
							var unitPrice = ui.item.unitprice;
							
							var descId = "desc"+numbers;
							var priceId = "price" + numbers;
							$("#"+descId).text(description);
							$("#"+priceId).text("Rs"+unitPrice);
							
						}
				    });
				    if ($(".delete").length > 0) $(".delete").show();
				    bind();
			  });
		});

	</script>
</head>

<body>

	<div id="page-wrap">

		<textarea id="header">Medical Billing</textarea>
		
		<div id="identity">
		
            <textarea id="address">Dharmendra Mishra
M4A Capgemini India Pvt Ltd
Near RCity Mall, Vikroli (East).

Phone: (555) 555-5555</textarea>

            <div id="logo">
<!--
              <div id="logoctr">
                <a href="javascript:;" id="change-logo" title="Change logo">Change Logo</a>
                <a href="javascript:;" id="save-logo" title="Save changes">Save</a>
                |
                <a href="javascript:;" id="delete-logo" title="Delete logo">Delete Logo</a>
                <a href="javascript:;" id="cancel-logo" title="Cancel changes">Cancel</a>
              </div>

              <div id="logohelp">
                <input id="imageloc" type="text" size="50" value="" /><br />
                (max width: 540px, max height: 100px)
              </div>
-->			  
              <img id="image" src="../images/logo.png" alt="logo" noresize="noresize"/>
            </div>
		
		</div>
		
		<div style="clear:both"></div>
		
		<div id="customer">

            <textarea id="customer-title">Widget Corp.
c/o Steve Widget</textarea>

            <table id="meta">
                <tr>
                    <td class="meta-head">Invoice #</td>
                    <td><textarea>000123</textarea></td>
                </tr>
                <tr>

                    <td class="meta-head">Date</td>
                    <td><textarea id="date">December 15, 2009</textarea></td>
                </tr>
                <tr>
                    <td class="meta-head">Amount Due</td>
                    <td><div class="due">Rs0.00</div></td>
                </tr>

            </table>
		
		</div>
		
		<table id="items">
		
		  <tr>
		      <th>Item</th>
		      <th>Description</th>
		      <th>Unit Cost</th>
		      <th>Quantity</th>
		      <th>Price</th>
		  </tr>
		  
		  <tr class="item-row">
		      <td class="item-name"><div class="delete-wpr"><input type="text" class="textbox" id="suggest1" /><a class="delete" href="javascript:;" title="Remove row">X</a></div></td>
		      <td class="description"><div id="desc1"></div></td>
		      <td><textarea class="cost" id="price1" readonly="readonly"></textarea></td>
		      <td><textarea class="qty">0</textarea></td>
		      <td><span class="price">Rs0</span></td>
		  </tr>
		  
	  
		  <tr id="hiderow">
		    <td colspan="5"><a id="addrow" href="javascript:;" title="Add a row">Add a row</a></td>
		  </tr>
		  
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Subtotal</td>
		      <td class="total-value"><div id="subtotal">Rs0</div></td>
		  </tr>
		  <tr>

		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Total</td>
		      <td class="total-value"><div id="total">Rs0</div></td>
		  </tr>
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Amount Paid</td>

		      <td class="total-value"><textarea id="paid">Rs0.00</textarea></td>
		  </tr>
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line balance">Balance Due</td>
		      <td class="total-value balance"><div class="due">Rs0</div></td>
		  </tr>
		
		</table>
		
		<div id="terms">
		  <h5>Terms</h5>
		  <textarea>This is right protected all right reserved by @dharmedra </textarea>
		</div>
	
	</div>
	
</body>

</html>