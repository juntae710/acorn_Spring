<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
}

.wrap {
	border: 5px solid black;
	padding-top: 20px;
	height: 800px;
	margin: 0 auto;
	width: 1200px;;
	overflow: scroll;
}

.item {
	display: inline-block;
	width: 80%;
}

.plusdiv {
	text-align: center;
}

.infodiv {
	margin: 0 auto;
	border: 1px solid gray;
	border-radius: 20px;
	padding: 20px;
	width: 80%;
	margin: 10px auto;
}
</style>
<script type="text/javascript">
	function insertview() {

		let result = '<input class="inputinsert" id="storename" type="text" placeholder="매장이름"><br><input class="inputinsert" id="address" type="text" placeholder="매장주소"><br>';
		result += '<input class="inputinsert" id="name" type="text" placeholder="사업자이름"><br><input class="inputinsert" id="tel" type="text" placeholder="사업자전화번호"><br>';
		result += '<input class="inputinsert" id="bnum" type="text" placeholder="사업자번호"><br><button onclick="insert()"> 추가하기</button>';
		$("#result").html(result);

	}

	function insert() {
		let storename = $("#storename").val();
		let address = $("#address").val();
		let name = $("#name").val();
		let tel = $("#tel").val();
		let bnum = $("#bnum").val();
		//alert(storename);
		let info = {
			storename : storename,
			address : address,
			name : name,
			tel : tel,
			bnum : bnum
		}; // 문자열로 바꿔줌
		let infos = JSON.stringify(info);
		//alert(storename);
		$.ajax({
			type : "post",
			url : "/prj4/ss",
			data : infos,
			contentType : "application/json", // 필수
			success : function(data) {
				window.location.reload();

			},
			error : function() {
				alert("error");
			}

		})
	}
	function storedelete() {
		//alert("asd");
		let storename = $("#item".this).val();
		alert(storename);
		
		$.ajax({
			type: "DELETE",
			url: "/prj4/ss/"+storename, //path Variable  ,
		
			success : function (data){
				alert(data);
			},
			error: function() {
				alert( "error");
			}
			
		});
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="wrap">
		<c:forEach var="item" items="${list}">
			<div class="infodiv itemwrap">
				<h2 id="item" class="item">${item.storename }</h2>
				<button>메뉴관리</button>
				<button>수정</button>
				<button id="storedelete" onclick="storedelete()">삭제</button>
			</div>
		</c:forEach>
		<div class="infodiv plusdiv" id="result">
			<button onclick="insertview()">매장생성</button>
		</div>
	</div>


</body>
</html>