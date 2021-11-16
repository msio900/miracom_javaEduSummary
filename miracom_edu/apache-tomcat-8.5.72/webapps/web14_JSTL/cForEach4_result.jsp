<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>우리 Shop에서 가지고 있는 과일 품목들 입니다.</h2>
<c:forEach var="item" items="${list}">
	<li>${item}</li>
</c:forEach>
</body>
</html>