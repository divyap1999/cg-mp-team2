<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
</div>
<table class="table">
	<tr>
		<th>User Name</th>
		<th>Agent</th>
		</tr>
	
	<tbody> 			
 			<% List<Insure> user_list = (List)session.getAttribute("users"); %>
			<% 
				for (Insured user : user_list) { 
			%> 
			<tr> 
				<td><%=user.getUserName()%></td> 
				<td><%=user.getAgent()%></td> 
			</tr> 
			<% 
				} 
			%> 
			
	</tbody> 
</table>
</div>
</div>
</div>
</body>
</html>