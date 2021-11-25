<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#first{ background-color: threedlightshadow;}
	*{ color:  navy;}
</style>
</head>
<body>
<h1 align="center"><b>${item.name}</b></h1>
<table align="center" width="600" id="first">
	<tr>	
		<td align="center">
			조회수 : ${item.count} &nbsp;&nbsp; &nbsp;&nbsp;<button>장바구니 담기</button>&nbsp;&nbsp;<button>장바구니 확인</button>
		</td>
	</tr>
</table>

<table align="center" width="600">
	<tr>	
		<td rowspan="3">
			<img alt="" src="${item.url}">
		</td>
		<td>종 류 : ${item.name}</td>
	</tr>
	<tr>			
		<td>가 격 : ${item.price}</td>
	</tr>
	<tr>		
		<td>설  명: ${item.description}</td>
	</tr>
	<tr>		
		<td colspan="2" align="center"><a href="list.do">상품 목록 보기</a></td>
	</tr>
</table>
</body>
</html>










