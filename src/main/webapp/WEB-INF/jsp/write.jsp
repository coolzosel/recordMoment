<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-게시글작성</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
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
					<input type="text" name="title" id="title" class="input--text">
				</li>
				<li>
					<label for="post-content">내용</label> 
					<textarea name="content" id="content" class="input--text"></textarea>
				</li>
			</ul>
		</form>
		<button type="button" class="btn" onclick="writeChk()">작성</button>

	</div>
	
</body>
<script type="text/javascript">

	// 빈 칸 체크
	var title = document.getElementById("title");
	var content = document.getElementById("content");

	function writeChk(){
		if(title.value.trim() == ''  || content.value.trim() == '' ) {
			alert("내용을 입력하세요.");
			return false;
		}else {
			return document.postWrite.submit();
		}
	}

</script>
</html>