<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
*{
margin: 0px;
padding: 0px;
}
img {
	width: 300px;
	height: 300px;
}

div {
	border: 2px solid black;
	display: inline-block;
	width: 500px;
	height: 500px;
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="item" items="${list }">
		<div>
			<h2>${item.title }</h2>

			<img alt="" src="${item.image }"><br>
			 <a
				href="${item.link }">보러가기</a><br>
				 ${item.lprice }
		</div>

	</c:forEach>
</body>
</html>