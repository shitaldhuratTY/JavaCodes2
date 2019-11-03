<%-- <%@page session="false" %> --%>
<html>

<body>
<h2>${msg}</h2>
<h2>*****************</h2>
<h2><%=request.getAttribute("msg") %></h2>

<%=session.getAttribute("emp") %>
</body>
</html>