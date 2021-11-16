<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="front.do" method="post">
<input type="hidden" name="command" value="update">
	<h1>Update Member Form</h1><br><br>
	ID : <input type="text" name="id" value="${vo.id}" readonly="readonly"><br>
	PASSWORD : <input type="password" name="password" required="required" value="${vo.password}"><br>
	NAME : <input type="text" name="name" required="required" value="${vo.name}"><br>
	ADDRESS : <input type="text" name="address" required="required" value="${vo.address}"><br>
	<input type="submit" value="Member Update" >
</form>
</body>
</html>