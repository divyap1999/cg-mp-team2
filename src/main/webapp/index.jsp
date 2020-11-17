

<html>
<head>
<%@page import="com.cg.claim.model.Login"%>

</head>
<body>
<% Login login = (Login)session.getAttribute("Login"); %>

<h3>Username : <%=login.getUsername() %></h3>
<h3>Password : <%=login.getPassword() %></h3>


</body>
</html>
