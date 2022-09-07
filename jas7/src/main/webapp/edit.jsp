<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1> Update page</h1>
<form action="abc" method="post">
		Name:<br>
		
		<input type="text"  name="name" value="<%=application.getAttribute("name").toString()%>"><br>
		Email:<br>
		<input type="email" name="email" value=<%= application.getAttribute("email") %>><br>
		Phone_Number:<br>
		<input type="tel" name="phone" value=<%= application.getAttribute("number") %>><br>
		Hobby:<br>
		<input type="text" name="hobby" value="<%= application.getAttribute("hobby") %>"><br><br>
		<input type="submit" name="submit" value=update>
	</form>
	 <center>
</body>
</html>