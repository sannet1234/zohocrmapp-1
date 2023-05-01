<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>login Here...</h2>
<form action="loginController" method= "post">
username <input type="email" name= "email"/>
password <input type="password" name= "password"/>
<input type="submit" value= "Login"/>
</form>
<br>
<%
if(request.getAttribute("error")!=null){
	out.println(request.getAttribute("error"));
}
%>

</body>
</html>