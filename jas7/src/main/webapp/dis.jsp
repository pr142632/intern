<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="reg.jsp" %>
<h1> Register Details </h1>
<table style="border: 1px solid black">
	<%
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile_number=request.getParameter("phone");
		String hobby=request.getParameter("hobby");
		application.setAttribute("name", name);
		application.setAttribute("email", email);
		application.setAttribute("number", mobile_number);
		application.setAttribute("hobby",hobby); 
	%>
	<tr>
		<td>Name</td>
		<td>Email</td>
		<td>Hobby</td>
		<td>Phone_Number</td>
		<td>Update_details</td>
	</tr>
	<tr>
		<td><%= request.getParameter("name") %></td>
		<td><%= request.getParameter("email") %></td>
		<td><%= request.getParameter("phone") %></td>
		<td><%=request.getParameter("hobby")  %></td>
		
		<td><form action="abc" method="post">
			<input type="submit"  name="submit" value="edit"/>
		</form></td>
	</tr>
</table>
</body>
</html>