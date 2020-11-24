<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>After a valid Login</title>
</head>
<body>
<%
if(session.getAttribute("login")==null){
	response.sendRedirect("login.jsp");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>
<a href="logout">Logout</a>

<button name="action" id="btnInsured" disabled>Insured</button>
<button name="action" id="btnClaimHandler" disabled>Claim Handler</button>
<button name="action" id="btnClaimAdjuster" disabled>Claim Adjuster</button>

</body>

<script type="text/javascript">
var roleCode='${roleCode}';
switch(roleCode){
	case 'Insured':
		document.getElementById('btnInsured').disabled=false;
		break;
	case 'Claim Handler':
		document.getElementById('btnClaimHandler').disabled=false;
		break;
	case 'Claim Adjuster':
		document.getElementById('btnClaimAdjuster').disabled=false;
		break;
}

</script>
</body>
</html>