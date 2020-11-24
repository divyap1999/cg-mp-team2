<%@page import="java.util.List"%>
 <%@page import="cg.ocrs.model.Questions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
 
<html>
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
<form>
<table class="table">
	<tr>
		<th>Question</th>
		<th>Answer 1</th>
		<th>Answer 2</th>
	</tr>

<tbody> 
			
			
 			<% List<Questions> ques_list = (List)session.getAttribute("questions"); %>
 
			<% 
 				for (Questions ques : ques_list) { 
			%> 
	
			<tr>  
				<td><%=ques.getQuestion()%></td>  
			</tr>  
			<% 
				} 
			%> 
	</tbody> 


</table>
	
	 		<button type="submit">Get Report</button>
	
</form>
</div>
</div>
</div>
</body>
</html>