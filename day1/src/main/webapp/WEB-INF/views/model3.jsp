<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="item" items="${list}">
<!--  item 객체의 getId()호출하는것 getter없으면 호출 안됨-->
${item.id}
${item.pw} <br>
</c:forEach>

</body>
</html>