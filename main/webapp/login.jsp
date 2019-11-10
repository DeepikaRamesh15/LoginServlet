<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Cache-Control" content="no-store" />
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	response.setHeader("Pragma","no-cache");
	response.setHeader("Expires","0");
	
	if(session.getAttribute("username")!=null){
		response.sendRedirect("/dashboard");
	}
%>
	
	<h2>${invalid}</h2>

	<h1>Please enter the login details</h1>
	<form action="/login1" method="POST" required>
		<h4>Username : </h4><input type="text" name="username"><br><br>
		<h4>Password : </h4><input type="password" name="password"><br><br>
		<input type="submit">
	</form>
</body>
</html>