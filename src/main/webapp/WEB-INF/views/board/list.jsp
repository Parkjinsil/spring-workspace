<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html data-bs-theme="dark">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
      crossorigin="anonymous"
    />
</head>

<style>
	.header{
		display : flex;
		justify-content: space-between;
		align-items: flex-end;
	}
	h1{
		margin-top: 70px;
	}
	.pagination{
		display: flex;
		justify-content:center;
	}

</style>

<body> 
	<div class="container">
		<div class="header">
			<h1>List Page</h1>
			<a href="/board/insert" class="btn btn-outline-warning">게시글 등록</a>
		</div>
	
		<table class="table">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="board">
					<tr>
						<td>${board.num}</td>
						<td>${board.title}</td>
						<td>${board.writer}</td>
						<td><fmt:formatDate value="${board.regdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<nav aria-label="Page navigation">
			<ul class="pagination">
				<c:if test="${paging.prev}">
					<li class="page-item">
						<a class="page-link" href="/board/list?page=${paging.startPage -1}">Prev</a>
				</c:if>
				<li class="page-item">
					<a class="page-link" href="/board/list?page=1">1</a>
				</li>
				<li class="page-item">
					<a class="page-link" href="/board/list?page=2">2</a>
				</li>
				<li class="page-item">
					<a class="page-link" href="/board/list?page=3">3</a>
				</li>
				<li class="page-item">
					<a class="page-link" href="/board/list?page=4">4</a>
				</li>
				<li class="page-item">
					<a class="page-link" href="/board/list?page=5">5</a>
				</li>
			</ul>
		</nav>
	</div>
</body>
</html>
	