<%@page import="java.util.List"%>
<%@page import="cg.ocrs.model.Claim"%>
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
		<th>ClaimNumber</th>
		<th>ClaimReason</th>
		<th>Accident Location Street</th>
		<th>Accident City</th>
		<th>Accident State</th>
		<th>Accident ZIP</th>
		<th>Claim Type</th>
		<th>Policy Number</th>
	</tr>
	
	
<% Claim claim = (Claim)session.getAttribute("claim"); %>

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
	
	
		
</table>
	

</div>


</body>
</html>