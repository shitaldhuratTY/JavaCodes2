<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="bean" class="com.tyss.mywebapp.dto.EmployeeInfoBean" scope="session"></jsp:useBean>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5 align="right">
<a href="./delete?id=<%=bean.getEmpId() %>">Delete Profile</a>
<h5 align="right">
<a href="./logout">Logout</a>
	<h2>Welcome <%=bean.getEmpName() %></h2>
</body>
</html>