<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 
Authentification(인증)
서비스를 사용하기 위한 인증 절차 ...로그인
무조건적인 서비스 권한
		- 회원검색

로그인 안하고 들어온 사용자
	서비스 권한(Authorization)
		- 회원가입
		- 로그인
		
로그인 하고 들어온 사용자
	서비스 권한(Authorization)
		- 회원정보 수정
		- 로그아웃
		- 전체회원보기
		::::::::::::::
			JSTL
c:choose
	c:when test="로그인 여부"
	
	c:otherwise
	
 -->
<style type="text/css">
	#wrap{  
			text-align: center;
			border: 2px dotted green;
	}
	
</style>
</head>
<body>
<div id="wrap">
	<h2>Cafe Member...Using...EL+JSTL</h2><p>
	
	<a href="search_member.html">회원 검색 하기</a><p></p>
	<c:choose>
		<c:when test="${!empty vo}"> <!--${vo != null}  -->
		<!-- 로그인 후 -->
			<a href="showAll.do">전체 회원 명단 보기</a><p></p>
			<a href="update.jsp">회원정보 수정하기</a><p></p>
			<a href="logout.do">로그아웃 하기</a><p></p>
		</c:when>
		<c:otherwise>
		<!-- 로그인 전 -->
			<a href="register.html">회원 가입 하기</a><p></p>
			<a href="login.html">로그인 하기</a><p></p>
		</c:otherwise>
	</c:choose>



</div>
</body>
</html>