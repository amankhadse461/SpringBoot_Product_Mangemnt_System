<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddProduct</title>
</head>
<body>
<form action="addproducts">
Product-id: <input type="number" name="pid">
Product-Name: <input type="text" name="pname">
Product-Description: <input type="text" name="pdescription">
Product-Price: <input type="number" name="pprice">
Supplier-Id: <input type="number" name="s.sid">
Supplier-Name: <input type="text" name="s.sname">
Supplier-Contact: <input type="text" name="s.scontact">
<input type="submit" value="addproduct">
<input>
</form>
</body>
</html>