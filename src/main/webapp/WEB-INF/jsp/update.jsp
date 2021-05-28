<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-update</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">devTest(logo)</a>
            <div class="collapse navbar-collapse" id="navbarColor03">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">${sessionScope.id}님 반갑습니다^0^*</li>
                    <li class="nav-item"><a href="logout">로그아웃</a></li>
                </ul>
            </div>
        </div>
    </nav>
	<div class="container">

		<form action="postWrite" method="POST" id="write-form" class="mt-5" name="postWrite">
			<ul>
				<li>
					<label for="post-title">제목</label> 
					<input type="text" name="title" id="title" class="input--text" value="${post.title}">
				</li>
				<li>
					<label for="post-content">내용</label> 
					<input type="text" name="content" id="content" class="input--text" value="${post.content}">
				</li>
			</ul>
		</form>
		<button type="button" class="btn" onclick="">수정</button>

	</div>
	
</body>
</html>