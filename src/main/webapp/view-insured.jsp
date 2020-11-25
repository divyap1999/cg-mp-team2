<%@page import="java.util.List"%>
<%@page import="cg.ocrs.model.Insured"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>


<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<html><jsp:include page="navbar.jsp"></jsp:include>

</head>
<body>

<div class="container">

<div class="row">

<div class="col-12">

<div class="col-12">

</div>
	

<table class="table">
	<tr>
		<th>UserName</th>
	</tr>


	
		
			
 			<% List<Insured> insured_list = (List)session.getAttribute("insured_list"); %>
 
			<% 
				for (Insured insured : insured_list) { 
			%> 
			<tr>  
				<td><%=insured.getUserName()%></td> 
			</tr> 
			<% 
				} 
			%> 
			
		


</table>

</div>
</div>
</div>
</body>
</html>