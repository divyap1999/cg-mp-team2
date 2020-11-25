<%@page import="cg.ocrs.model.UserRole"%>
<%@page import="java.util.List"%>
<%@page import="cg.ocrs.model.Insured"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Handler</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<center>
<h2>Get the Insured Persons Under You!</h2>


<form action="viewinsured" method="get">

 		<% String userName = (String)session.getAttribute("userName"); %>

		<tr>
				UserName: <td><input type="text" name="userName" value="<%=userName%>"></td>	
				<br>	
		</tr> 		
 <button type="submit">View Insured</button>

</form>
</center>

</body>
</html>