<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@   taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact list - Spring boot Web application</title>
</head>
<body>


<h1 align="center">My Contact Lists</h1>

<table border="1" cellpadding="10">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
</tr>
<c:forEach items="${contacts}" var="contact">
<tr>
     <td>${contact.name}</td>
     <td>${contact.email}</td>
     <td>${contact.country}</td>
        
</tr>

</c:forEach>
</table>
</body>
</html>