<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

	<%
	 
	    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Expires","0");
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("/login");
		}
	%>
	
	<h3>Welcome ${username}</h3>
	
	<br>
	
	<form action="/logout1" method="POST">
	<input type="submit" value="Logout">
	</form> 

</body>
</html>