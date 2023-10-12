<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div{
border: 2px solid black;
border-radius: 20px;
}
img{
width: 200px;
height: 200px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="a">
환경 정보
<c:forEach var="item" items="${list}" >
<div>
<h2>${item.informData}</h2>
<div>
<img alt="" src="${item.imageUrl1}">
<img alt="" src="${item.imageUrl2}">
<img alt="" src="${item.imageUrl3}">
<img alt="" src="${item.imageUrl4}">
<img alt="" src="${item.imageUrl5}">
<img alt="" src="${item.imageUrl6}">
</div>
${item.informCause}
${item.informOverall}
${item.dataTime}
</div>
</c:forEach>
</div>
</body>
</html>