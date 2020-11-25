<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<%@page import="cg.ocrs.model.Questions"%>
<%@page import="cg.ocrs.model.Claim"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<title>Detailed Claim Report</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>

<center><h3>Detailed Report for the Claim</h3></center>
<br>
<br>

<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
</div>
<table class="table">
	
	<tr>
		<th>ClaimNumber</th>
		<th>ClaimReason</th>
		<th>Accident Location Street</th>
		<th>Accident City</th>
		<th>Accident State</th>
		<th>Accident ZIP</th>
		<th>Claim Type</th>
		<th>Policy Number</th>
	</tr>
	
	<%Claim claim = (Claim)session.getAttribute("claim"); %>
<tbody>
	<tr>
		<td><%=claim.getClaimNumber() %></td>
		<td><%=claim.getClaimReason() %></td>
		<td><%= claim.getAccidentLocationStreet() %></td>
		<td><%=claim.getAccidentCity() %></td>
		<td><%= claim.getAccidentState() %></td>
		<td><%= claim.getAccidentZip() %></td>
		<td><%= claim.getClaimType() %></td>
		<td><%= claim.getPolicyNumber() %></td>		
	</tr>
</tbody>		

		
	
	<tr>
		
	
		<th>Question</th>
		<th>Answer</th>
	</tr>
	
	
	
	


<tbody>


	
	<% 
		List<Questions> ques = (List)session.getAttribute("questions");
		List<String> ans = (List)session.getAttribute("ans");
		int length = ans.size();
		
		

	%>
	
	
			<% 
				int index = 0;
				for (Questions q : ques) { 
			%> 
			<tr> 
				<td><%=q.getQuestion()%></td>
				<td><%=ans.get(index) %></td>  
			<% 
				index++;
				} 
			%> 
			
			</tr> 
			 
			 <tr>
				<th>Overall Weightage</th>
				<td><%=session.getAttribute("total") %></td>
			</tr>
			
</tbody>
	
	
		
</table>
	
</div>
</div>
</div>


</body>
</html>