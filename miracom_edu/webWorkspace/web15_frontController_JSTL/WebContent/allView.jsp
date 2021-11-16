<%@page import="servlet.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.home{
		text-align :center;
		margin-left: 400px;
	}
	table {
		margin-top: 30px;
}
</style>
</head>
<body>
<h3 align="center">회원 전체 명단 보기</h3><p>

<table border="2" width="350" bgcolor="yellow" align="center">
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.id}</td>
			<td>${vo.name}</td>
			<td>${vo.address}</td>
		</tr>
	</c:forEach>
	<HR>
	<b><a href="index.jsp">Home</a></b>
</table>
</body>
</html>








