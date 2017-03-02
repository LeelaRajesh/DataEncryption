<%@page import="com.dataencryption.TO.Registration_details"%>
<%@page import="java.util.ArrayList"%>
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

<h1 ><font color="red">Unauthorized Access<br />You are not allowed to view this Page</font></h1>
<%} else {%>

<body>
<div id="header">
		<h1>Employees details</h1>
</div>
<div id="primary">
<table align="center">
<tr>
<td width="20%">
		<div><strong><a href="home.jsp" class="top_parent">
<font size=5 color="white">Home</font>
</a></strong></div>
</td>
<td width="20%">
		<div><strong>
<a href="Register.jsp" class="top_parent">
<font size=5 color="white">Register Employees</font>
</a></strong></div>
</td>
<td width="20%">
		<div><strong>
<a href="logout.jsp" class="top_parent">
<font size=5 color="white">Sign out</font>
</a></strong></div>
</td>
</tr>
</table>
</div>
<h5>
<table cellpadding="5"  align="center" cellspacing="8" border="1">
<tr><td><font size=5 color="maroon">First Name</font></td><td><font size=5 color="maroon">Last Name</font></td>
<td><font size=5 color="maroon">Mail ID</font></td><td><font size=5 color="maroon">SSN</font></td>
<td><font size=5 color="maroon">Income</font></td><td><font size=5 color="maroon">Address Line 1</font></td>
<td><font size=5 color="maroon">Address Line 2</font></td><td><font size=5 color="maroon">City</font></td>
<td><font size=5 color="maroon">State</font></td><td><font size=5 color="maroon">Zip Code</font></td>
<td><font size=5 color="maroon">Phone Number</font></td>
</tr>
<% 
ArrayList<Registration_details> list = (ArrayList<Registration_details>)request.getAttribute("list");
 for(Registration_details d: list){
 %>
<!-- <c:forEach items="${list}" var="d">-->
<tr>
<td><font size=4><%=d.getFname()%></font></td>
<td><font size=4><%= d.getLname()%></font></td>
<td><font size=4><%= d.getMail_id()%></font></td>
<td><font size=4><%= d.getSsn()%></font></td>
<td><font size=4><%= d.getIncome()%></font></td>
<td><font size=4><%=d.getAddress_l1()%></font></td>
<td><font size=4><%=d.getAddress_l2()%></font></td>
<td><font size=4><%=d.getCity()%></font></td>
<td><font size=4><%=d.getState()%></font></td>
<td><font size=4><%=d.getZipcode()%></font></td>
<td><font size=4><%=d.getPnum()%></font></td>
</tr>
<%} %>
<!--</c:forEach>-->
</table>
</h5>
</body>
<%} %>
</html>