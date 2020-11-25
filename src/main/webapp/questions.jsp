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

<form action="claimreport-ques" method = "post">


<table class="table">


			<% String claimType = (String)session.getAttribute("claimType");
			%>
 			<tr>
				ClaimType: <td><input type="text" name="claimType" value="<%=claimType%>"></td>	
				ClaimNumber:<td><input type="text" name="claimNumber" value="<%=session.getAttribute("claimNumber")%>"></td>				
				<br>	
			</tr>
			
	
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
				<input type="radio" value="answer1"  name="<%=ques.getQuestion()%>">
				<td><%=ques.getA1weightage()%>
				<td><%=ques.getAnswer2()%>
				<input type="radio" value="answer2" name="<%=ques.getQuestion()%>">
				<td><%=ques.getA2weightage()%>
				<td><%=ques.getAnswer3()%>
				<input type="radio" value="answer3"  name="<%=ques.getQuestion()%>">
				<td><%=ques.getA1weightage()%>
				</td>
				
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