<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">=== Spring MVC Framework Module ===</h2>
	<!-- main.do 라는 요청을 DispatcherServlet한테 맏아서...
		그걸 HandlerMapping(ControllerFactory)한테 줄거다...
		그럼 HandlerMapping 그 요청에 해당하는 컴포넌트를 생성...
		MainController를 우리는 직접 작성해놓으면 된다.
		
		index페이지 다음에 ...controller기반의 Component작성을 하면 된다.
	 -->
	<center><a href="main.do">DispatcherServletMoving</a></center>
</body>
</html>