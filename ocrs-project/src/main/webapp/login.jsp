<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div align="center">
<h1>User Login</h1>
<table>
<form action="login" method="post">
<tr><td>Login ID </tr></td> <tr><td><input type="text" placeholder="Enter user name" name="userName"></tr></td>
<tr><td>Password </tr></td> <tr><td><input type="password" placeholder="Enter pasword" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{,6}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 characters" required></tr></td>
<tr><td>Role Code </tr></td> <tr><td><select name="roleCode">
<option>Insured</option>
<option>Claim Handler</option>
<option>Claim Adjuster</option>
</select>
</tr></td>

 <tr><td></tr><td><input type="submit" value="create"></td></tr>

</form>
</table>
</div>
</body>
</html>