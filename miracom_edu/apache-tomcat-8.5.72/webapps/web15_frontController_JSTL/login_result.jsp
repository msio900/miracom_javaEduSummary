<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Information...</h2>
LOGIN ID :  <B>${vo.id}</B> <BR><BR>
LOGIN NAME : <B>${vo.name}</B> <BR><BR>
LOGIN ADDRESS :  <B>${vo.address}</B> <BR><BR>
LOGIN JSESSIONID :  <B><%= session.getId()%></B> <BR><BR>
<hr>
<a href="front.do?command=logout">LOG OUT</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="index.jsp">HOME...INDEX PAGE</a>
</body>
</html>