<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-Board</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
    <!-- 네비 바 -->
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


    <div class="container mt-5">
        <h2>게시판</h2>
        <ul class="postlist">
            <li class="postlist_item" id="head">
                <span class="no">번호</span>
                <span class="title">제목</span>
                <span class="writer">작성자</span>
                <span class="time">작성일</span>
            </li>
            <c:forEach items="${boardList}" var="item">
                <li class="postlist_item">
                    <span class="no">${item.no}</span>
                    <span class="title">${item.title}</span>
                    <span class="writer">${item.id.id}</span>
                    <span class="time">${item.date}</span>
                </li>
            </c:forEach>
        </ul>

        <button type="button" onclick="location.href='writePage'">글쓰기</button>

    </div>



</body>
</html>