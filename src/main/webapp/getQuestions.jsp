<%@page import="java.util.List"%>
<%@page import="cg.ocrs.model.Questions"%>
<%@page import="cg.ocrs.model.Claim"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Questions</title>
     <div class="footer">Online Claim Registration System</div>

</head>
<jsp:include page="navbar.jsp"></jsp:include>

<body>
  <%Claim claim = (Claim)session.getAttribute("claim"); %>
    <center>
	<h3>Your Claim is under Process</h3>
	<h4>Please Click below to Answer the Questions</h4>
	
	<form action="view-questions" method="get">
	
		Enter ClaimType : <td><input type="text" name="claimType" value="<%=claim.getClaimType() %>"></td>
		ClaimNumber: <td><input type="text" name="claimNumber" value="<%=claim.getClaimNumber()%>"></td>	
		 <br><br>		
		

 		<button type="submit">Get Questions</button>

	</form>

	</center>
	<br><br><br><br>	<br><br><br><br>
	<br><br><br><br>	<br><br><br><br>
	
	
	<div class="footer">
		<marquee behavior="scroll" direction="left" scrollamount="15"><h4>Answer the Given Questions...</h4></marquee>
	</div>
    
</body>

</body>
</html>