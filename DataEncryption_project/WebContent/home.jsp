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
<% if(session.getAttribute("role") ==null)
{ %>

<h1 align="center"><font color="red">Unauthorized Access<br />You are not allowed to view this Page</font></h1>
<%} else {%>
<body>
<div id="header">
<h1 align="center">Employee Registration System home page</h1></div>
<div id="primary">
<table id="alter" width="800px" border="0" cellpadding="0"  align="center" cellspacing="0">
<tr>
<td width="20%">
		<div><strong><a href="Register.jsp" class="top_parent">
		<font size=5 color="white">Register employees</font></a></strong></div>
</td>
					<td width="20%">
						<div><strong><a href="ViewEmpListController" class="top_parent">
						<font size=5 color="white">View employees data</font>
						</a></strong></div>
					</td>
					<td width="20%">
				<div><strong><a href="logout.jsp" class="top_parent">
					<font size=5 color="white">Sign out</font>
					</a></strong></div>
				</td>
</tr>
</table>
</div>
<div id="content" align="center">
<img src="shutterstock_120371968-encryption-in-Windows.jpg" width="800" height="600"/> 
</div>
</body>
<%} %>
</html>