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
Product-id: <input type="number" name="pid"><br>
Product-Name: <input type="text" name="pname"><br>
Product-Description: <input type="text" name="pdescription"><br>
Product-Price: <input type="number" name="pprice"><br>
Supplier-Id: <input type="number" name="s.sid"><br>
Supplier-Name: <input type="text" name="s.sname"><br>
Supplier-Contact: <input type="text" name="s.scontact"><br>
<input type="submit" value="addproduct">
</form>
</body>
</html>