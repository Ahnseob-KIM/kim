<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>타이틀 변경 김안섭 브렌치 설정</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<h1>게시판 등록</h1>
	
	<div class="container">
		<div class="row">
			<form action="/board/create" method="post">
				<div class="form-group">
					<label for="title">제목</label>
					<input id="title" name="title" class="form-control">
				</div>
				<div class="form-group">
					<label for="writer">작성자</label>
					<input id="writer" name="writer" class="form-control">
				</div>
				<div class="form-group">
					<label for="content">내용</label>
					<textarea id="content" name="content" class="form-control" rows="3"></textarea>
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="등록">
				</div>
			</form>
		</div>
	</div>
</body>
</html>