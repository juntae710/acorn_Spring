<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div{
padding : 20px;
border: 2px solid black;
border-radius: 20px;
}
img{
width: 200px;
height: 200px;
}
.a{
width: 700px;
display: inline-block;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
<c:forEach var="item" items="${list}" >
<c:if test="${item.informCode eq 'PM25'}">
<div class="a">
<h2>${item.informData}</h2>
${item.informGrade} <br>
${item.informCode} <br>
${item.informCause} <br>
${item.informOverall} <br>
${item.dataTime}
</div></c:if>

</c:forEach>
</div>
</body>
</html>