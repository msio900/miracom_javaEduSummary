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
<h2>c:choose 사용하기</h2>
<c:choose>
	<c:when test="${param.num=='1'}">
		<b>안녕하세요...반갑습니다.</b>
	</c:when>
	<c:when test="${param.num=='2'}">
		<b>그럭저럭 잘 지내고 있습니다.</b>
	</c:when>
	<c:otherwise>
		<b>여기는 여의도 사무실이 아닙니다. 다시 문의 하세요.</b>
	</c:otherwise>
</c:choose>

</body>
</html>