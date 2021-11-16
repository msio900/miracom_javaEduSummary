<%@page import="java.util.ArrayList"%>
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
<h2>c:forEach 사용법</h2>
<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("사과");
	list.add("바나나");
	list.add("복숭아");
	list.add("포도");
	
	request.setAttribute("list", list);
%>

<jsp:forward page="cForEach4_result.jsp" />
</body>
</html>