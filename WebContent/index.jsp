<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login Page</title>
<style type="text/css">
@import url(Stylesheets/style.css);
</style>
<script src="Scripts/jquery.js" type="text/javascript"></script>
<script src="Scripts/javascript.js" type="text/javascript"></script>
</head>
<body>
<div id="header">
  <h1>Login Page</h1>
  <br />
  <h2>Powered by Medical Store billing</h2>
</div>

  <hr id="header_stripe"/>
  <div id="page_container">
  <div id="toppanel">
    <div id="panel">
      <div id="panel_contents"> </div>
      <h1>Login Screen</h1>
      <h2> By Dharmendra and Comp</h2>
      <img class="border_pic" src="images/tutsplus.jpg" alt="Screenshot" />
      <div class="border" id="login">
        <p>Username:
          <input type="text" size="15" name="username" id="username" />
          <br />
          Password:
          <input type="password" size="15" name="password" id="password" />
          <br />
          <input type="button" accesskey="l" id="login_btn" name="login" value="Login" />
        </p>
      </div>
    </div>
    <div class="panel_button" style="display: visible;"><img src="images/expand.png"  alt="expand"/> <a href="#">Login Here</a> </div>
    <div class="panel_button" id="hide_button" style="display: none;"><img src="images/collapse.png" alt="collapse" /> <a href="#">Hide</a> </div>
  </div>
  <!--<div id="content">
  </div>-->
  <div id="footer">
    <p>Website created by Dharmendra</p>
  </div>
</div>
</body>
</html>