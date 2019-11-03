<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login" method="post">
	<table>
			<tr>
			<td>Employee id</td>
			<td> : </td>
			<td><input type="number" name="id" required>
			</tr>
			
			<tr>
			<td>Password</td>
			<td> : </td>
			<td><input type="password" name="password" required></td>
			</tr>
			
			<tr>
			<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
	<a href="./register">Sign Up</a>
</body>
</html>