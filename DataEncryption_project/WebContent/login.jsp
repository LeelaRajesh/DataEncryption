<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

body  {
    background-color: #cccccc;
    background-image: url("background_linen.png");
}
#primary {
background-color:black;
line-height:25px;
color:white;
padding:4px;
}
</style>
</head>
<body>
<div id="header">
		<h1>Data Encryption</h1>
</div>

<h1 align="center">Admin Login page</h1>
<%
String message="";
if(request.getAttribute("message")!=null)
{
message=request.getAttribute("message").toString();
}
%>
<%-- <center><h4 align="center" style="color:red"><%=message%></h4></center> --%>
<h4 align="center"><font color="red"><%=message %></font></h4>
<form action="LoginController" method="post">
	<table align="center" cellspacing="20" cellpadding="10">
	<tr><td><font size=5>USERNAME:</font></td><td><input type="text" name="user"></td></tr>
	<tr><td><font size=5>PASSWORD:</font></td><td><input type="password" name="pass"></td></tr>

<tr></tr>
<tr><td align="center"><input size=5 type="submit" value="SUBMIT" ></td><td align="center"><input size=5 type="reset" value="RESET" ></td></tr>
</table>

</form>

</body>
</html>