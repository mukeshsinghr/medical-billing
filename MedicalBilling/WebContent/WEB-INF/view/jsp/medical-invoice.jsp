<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset='UTF-8'>
	
	<title>Medical Invoice</title>
	
	<link rel='stylesheet' href='../Stylesheets/invoice-style.css'>
	<link rel='stylesheet' href='../Stylesheets/print.css' media="print">
	<link rel='stylesheet' href='../Stylesheets/jquery.autocomplete.css'>
	<script src='../Scripts/jquery.js'></script>
	<script src='../Scripts/example.js'></script>
	<script src='../Scripts/jquery.autocomplete.js'></script>
	<script src='../Scripts/localdata.js'></script>

	<script type="text/javascript">
			$().ready(function() {
			
				function log(event, data, formatted) {
					$("<li>").html( !data ? "No match!" : "Selected: " + formatted).appendTo("#result");
				}
				
				function formatItem(row) {
					return row[0] + " (<strong>id: " + row[1] + "</strong>)";
				}
				function formatResult(row) {
					return row[0].replace(/(<.+?>)/gi, '');
				}
				
			
				$("#suggest13").autocomplete(medicenes, {
					minChars: 0,
					width: 310,
					matchContains: "word",
					autoFill: false,
					formatItem: function(row, i, max) {
						return i + "/" + max + ": \"" + row.name + "\" [" + row.stock + "]";
					},
					formatMatch: function(row, i, max) {
						return row.name + " " + row.stock;
					},
					formatResult: function(row) {
						return row.name;
					}
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
                    <td><div class="due">Rs875.00</div></td>
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
		      <td class="item-name"><div class="delete-wpr"><input type="text" class="textbox" id="suggest13" /><a class="delete" href="javascript:;" title="Remove row">X</a></div></td>
		      <td class="description"><div>Monthly web updates for http://widgetcorp.com (Nov. 1 - Nov. 30, 2009)</div></td>
		      <td><textarea class="cost">Rs650.00</textarea></td>
		      <td><textarea class="qty">1</textarea></td>
		      <td><span class="price">Rs650.00</span></td>
		  </tr>
		  
		  <tr class="item-row">
		      <td class="item-name"><div class="delete-wpr"><textarea>SSL Renewals</textarea><a class="delete" href="javascript:;" title="Remove row">X</a></div></td>

		      <td class="description"><div>Yearly renewals of SSL certificates on main domain and several subdomains</div></td>
		      <td><textarea class="cost">Rs75.00</textarea></td>
		      <td><textarea class="qty">3</textarea></td>
		      <td><span class="price">Rs225.00</span></td>
		  </tr>
		  
		  <tr id="hiderow">
		    <td colspan="5"><a id="addrow" href="javascript:;" title="Add a row">Add a row</a></td>
		  </tr>
		  
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Subtotal</td>
		      <td class="total-value"><div id="subtotal">Rs875.00</div></td>
		  </tr>
		  <tr>

		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Total</td>
		      <td class="total-value"><div id="total">Rs875.00</div></td>
		  </tr>
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line">Amount Paid</td>

		      <td class="total-value"><textarea id="paid">Rs0.00</textarea></td>
		  </tr>
		  <tr>
		      <td colspan="2" class="blank"> </td>
		      <td colspan="2" class="total-line balance">Balance Due</td>
		      <td class="total-value balance"><div class="due">Rs875.00</div></td>
		  </tr>
		
		</table>
		
		<div id="terms">
		  <h5>Terms</h5>
		  <textarea>This is right protected all right reserved by @dharmedra </textarea>
		</div>
	
	</div>
	
</body>

</html>