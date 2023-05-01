<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter the Details to Update</h2>
<hr>
<form action="update" method="post">
<table>
<tr>
<td>Email</td>
<td><input type="text" name="email" value="<%=request.getAttribute("email") %>" readonly/></td>
</tr>
<tr>
<td>New Mobile Number</td> 
<td> <input type="text" name="mobile" value="<%=request.getAttribute("mobile") %>"/></td> 
</tr>
<tr>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
</form>
</body>
</html>