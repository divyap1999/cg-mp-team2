<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession Session =request.getSession();
String roleCode=(String) session.getAttribute("roleCode");

%>

<a href="logout">Logout</a>
<button id="btnCreateClaim" disabled>create Claim</button>
<button id="btnViewClaim" disabled>View Claim </button>
<button id="btnCreateUser" disabled>Create User</button>
<button id="btnGenerateReport" disabled>Generate Report</button>
</body>
<script type="text/javascript">
var roleCode='${roleCode}';
switch(roleCode){
	case 'Insured':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'Claim Handler':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'Claim Adjuster':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		document.getElementById('btnCreateUser').disabled=false;
		document.getElementById('btnGenerateReport').disabled=false;
		break;
}
</script>
</body>
</html>