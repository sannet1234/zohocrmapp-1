<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New registration</title>
</head>
<body>
<h2>Create new Registration</h2>
<hr>
<form action="savereg" method="post">
<table> <!--Form tag used to take user input and save to the database -->
<tr>
<td>Name</td>
<td><input type="text" name="name" /></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" /></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobile"/></td>
</tr>
<tr>
<td><input type="submit" value="Save" /></td>
</tr>
</table>
</form>
<br>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>