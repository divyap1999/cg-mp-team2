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
		<th>Weightage</th>
		<th>Answer 2</th>
		<th>Weightage</th>
		<th>Answer 3</th>
		<th>Weightage</th>
		
	</tr>

<tbody> 
	
			
 			<% List<Questions> ques_list = (List)session.getAttribute("questions"); %>
 
			<% 
 				int index = 0;
				for (Questions ques : ques_list) { 
			%> 
	
			<tr>  
				<td><%=ques.getQuestion()%></td>
				<td><%=ques.getAnswer1()%>
				<input type="radio" value="answer1"  name=<%=index%>>
				<td><%=ques.getA1weightage()%>
				<td><%=ques.getAnswer2()%>
				<input type="radio" value="answer2" name=<%=index%>>
				<td><%=ques.getA2weightage()%>
				<td><%=ques.getAnswer3()%>
				<input type="radio" value="answer3"  name=<%=index%>>
				<td><%=ques.getA3weightage()%>
				
				</td>
				
			</tr>  
			
			<% 
				index = index+1;
				} 
			%> 
	</tbody> 


</table>
	
	 	<button type="submit" action="/claimreport-ques" method = "post">Get Report</button>
	
</form>
</div>
</div>
</div>
</body>
</html>