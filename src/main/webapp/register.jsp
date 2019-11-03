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
<form action="./register" method="post">
<table>
	<tr>
		<td>Emp Id : </td>
		<td><input type="number" name="id" required></td>
		
	</tr>
	<tr>
		<td>Emp name : </td>
		<td><input type="string" name="name" required></td>
		
	</tr>
	<tr>
		<td>Emp age : </td>
		<td><input type="number" name="age" required></td>
		
	</tr>
	<tr>
		<td>Emp salary : </td>
		<td><input type="number" name="salary" required></td>
		
	</tr>
	<tr>
		<td>Emp password : </td>
		<td><input type="" name="password" required></td>
		
	</tr>
	<tr>
		<td>Emp Designation : </td>
		<td><input type="string" name="designation" required></td>
		
	</tr>
	<tr>
		<td><input type="reset"></td>
			<td><input type="submit"></td>

	</tr>
</table>
</form>
</body>
</html>