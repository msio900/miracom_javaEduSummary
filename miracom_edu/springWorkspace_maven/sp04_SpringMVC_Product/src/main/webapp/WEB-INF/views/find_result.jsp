<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- JSTL 사용해야함. : forEach 1)jar 2개	2) taglib -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td, h2{
		text-align: center
	}

</style>
</head>
<body>
<h2>=== 상품정보를 출력합니다 ===</h2>
<table border="2" align="center" width="50%">
	<thead>
		<th>번호</th><th>상품명</th><th>제조사</th><th>가격</th>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="vo">
		<tr>
			<td>${vo.id}</td>
			<td>${vo.name}</td>
			<td>${vo.maker}</td>
			<td>${vo.price}</td>
		</tr>
		</c:forEach>
	
	</tbody>

</table>
<center><a href="productRegister.jsp">Home...</a></center>
</body>
</html>