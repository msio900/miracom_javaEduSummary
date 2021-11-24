<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Product Register Form.....</h2>
<form action="myProduct.do" method="post">
상품명 : <input type="text" name="name"><br><br>
제조사 : <input type="text" name="maker"><br><br>
가  격 : <input type="text" name="price"><br><br>
<input type="submit" value="상품등록">
</form>
++++++++++++++++++++++++++++++++++++++++++++++++
<br><br>
<h3>상품명, 제조사별 검색방법을 먼저 선택하세요.</h3>
<form action="myProductSearch.do">
<select name="command">
	<option value=""====아래에서 선택하세요 ====></option>
	<option value="findByProductName">상품명으로 검색하기</option>
	<option value="findByProductMaker">제조사로 검색하기</option>
	<option value="findByProductId">상품 아이디로 검색하기</option>
</select>
<input type="text" name="word"><br><br>
<input type="submit" value="상품찾기">
</form>
</body>
</html>