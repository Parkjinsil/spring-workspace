<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.min.js">
function list(){
	$.ajax({
		url : ,
		type : ,
		success : function(){
			
		},
		error: function(){
			
		}
	})
}
list();
</script>
</head>
<body>
	<h1>휴대전화 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>모델번호</th>
				<th>모델이름</th>
				<th>가격</th>
				<th>제조사명</th>
			</tr>
		</thead>
		<tbody id="list">
			<tr>
				
			</tr>
		</tbody>
	</table>
</body>
</html>