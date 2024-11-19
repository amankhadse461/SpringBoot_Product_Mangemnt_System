<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products Details</title>
</head>
<body>
<table border="2px ">
<tr>
<th>Product-Id</th>
<th>Product-Name</th>
<th>Product-Description</th>
<th>Product-Price</th>
<th>Supplier-Id</th>
<th>Supplier-Name</th>
<th>Supplier-Contact</th>
</tr>
<c:forEach items="${data}" var="pro">
<tr>
<td>${pro.pid}</td>
<td>${pro.pname}</td>
<td>${pro.pdescription}</td>
<td>${pro.pprice}</td>
<td>${pro.s.sid}</td>
<td>${pro.s.sname}</td>
<td>${pro.s.scontact}</td>

</tr>
</c:forEach>
</table>
</body>
</html>