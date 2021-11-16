<!-- 
JSTL 사용하기 위한 방법
1. ~jar파일 (2개)을 반드시 추가...lib 안에
2. taglib를 선언부에 지정...
 -->
 <!-- 이 부분은 tomcat에 포함되어 있지 않다. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- prefix는 코어를 의미하는 c로 uri를 포함시켜야함. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${param.num=='100'}">
	<h1>오늘 100만원 입급하셨습니다.</h1>
</c:if>
<c:if test="${param.num=='200'}">
	<h1>오늘 200만원 입급하셨습니다.</h1>
</c:if>
</body>
</html>