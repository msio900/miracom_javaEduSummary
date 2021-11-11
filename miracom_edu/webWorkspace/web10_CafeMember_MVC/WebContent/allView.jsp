<%@page import="servlet.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> list=(ArrayList)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">회원 전체 명단 보기</h3><p>
<table border="2" width="350" bgcolor="yellow" align="center">
	<%
		for(int i=0; i<list.size(); i++){
	%>
	<tr>
		<td><%= list.get(i).getId() %></td>
		<td><%= list.get(i).getName()%></td>
		<td><%= list.get(i).getAddress() %></td>
	</tr>	
	<%
		}
	%>
</table>
</body>
</html>








