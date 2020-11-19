<%@page import="java.util.List"%>
<%@page import="com.cg.claim.model.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</div>
<table class="table">
	<tr>
		<th>Username</th>
		<th>Password</th>
		<th>Rolecode</th>
	</tr>
	
<% Login login = (Login)session.getAttribute("Login"); %>

	<tr>
		<td><%=login.getUsername() %></td>
		<td><%=login.getPassword() %></td>
		<td><%=login.getRolecode() %></td>
		
	</tr>
</table>
	

</div>


</body>
</html>