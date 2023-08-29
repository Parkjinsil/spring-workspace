<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty vo}">
			<h2>로그인 정보</h2>
			<ul>
				<li>아이디 : ${vo.id}</li>
				<li>이름 : ${vo.name}</li>
				<li>주소 : ${vo.addr}</li>
			</ul>
			<a href="index.jsp">돌아가기</a>
		</c:when>
		<c:otherwise>
			<h3>로그인 실패.. </h3>
			<a href="login.jsp">로그인 하러 가기</a>
		</c:otherwise>
	</c:choose>
</body>
</html>