<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function editdata() {
	document.fn.action="edit";
	document.fn.submit();
}

function deletedata() {
	document.fn.action="delete";
	document.fn.submit();
}
</script>
<meta charset="UTF-8">
<title>Products Details</title>
</head>
<body>
<form name="fn">
<table border="2px ">
<tr>
<th>SR-No</th>
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
<td><input type="radio" name="pid" value="${pro.pid}"></td>
<td>${pro.pid}</td>
<td>${pro.pname}</td>
<td>${pro.pdescription}</td>
<td>${pro.pprice}</td>
<td>${pro.s.sid}</td>
<td>${pro.s.sname}</td>
<td>${pro.s.scontact}</td>
</tr>
</c:forEach>
</table><br>
<table>
<tr><button type="button" onclick="editdata()">edit</button></tr>
<tr><button type="button" onclick="deletedata()">delete</button></tr>
</table>
</form>
</body>
</html>