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
<div id="primary">
<table align="center">
<tr>
<td width="20%">
		<div><strong><a href="home.jsp" class="top_parent">
<font color="white" size=5>Home</font>
</a></strong></div>
</td>
<td width="20%">
		<div><strong>
<a href="ViewEmpListController" class="top_parent">
<font size=5 color="white">View employees data</font>
</a></strong></div>
</td>
<td width="20%">
		<div><strong><a href="logout.jsp" class="top_parent">
<font size=5  color="white">Sign out</font>
</a></strong></div>
</td>
</tr>
</table>
</div>
<form method="post" action="./RegistrationController">
	<h1 align="center">Registration</h1>
	<table cellpadding="5"  align="center" cellspacing="8" >
		<tr>
			<th><font size=5>First name: </font></th>
			<td><input type="text" name="fname"></input></td>
		</tr>
		<tr>
			<th><font size=5>Last name:</font> </th>
			<td><input type="text" name="lname"></input></td>
		</tr>
		<tr>
			<th><font size=5>Mail ID:</font> </th>
			<td><input type="text" name="mail_id"></input></td>
		</tr>
		<tr>
			<th><font size=5>SSN:</font> </th>
			<td><input type="text" name="ssn"></input></td>
		</tr>
		<tr>
			<th><font size=5>Income:</font> </th>
			<td><input type="text" name="income"></input></td>
		</tr>
		<tr>
			<th><font size=5>Address Line 1:</font> </th>
			<td><input type="text" name="address_l1"></input></td>
		</tr>
		<tr>
			<th><font size=5>Address Line 2:</font> </th>
			<td><input type="text" name="address_l2"></input></td>
		</tr>
		<tr>
			<th><font size=5>City: </font></th>
			<td><input type="text" name="city"></input></td>
		</tr>
		<tr>
			<th><font size=5>State: </font></th>
			<td><input type="text" name="state"></input></td>
		</tr>
		<tr>
			<th><font size=5>Zip Code: </font></th>
			<td><input type="text" name="zipcode"></input></td>
		</tr>
		<tr>
			<th><font size=5>Phone number: </font></th>
			<td><input type="text" name="pnum"></input></td>
		</tr>
	</table>
	<h3 align="center"><input size=6 type="submit" name="submit" value="submit"></input></h3>
</form>
</body>
</html>