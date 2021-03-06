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
        <h2><a href="board">게시판</a></h2>
        <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col" class="no">번호</th>
                <th scope="col" class="title">제목</th>
                <th scope="col" class="writer">작성자</th>
                <th scope="col" class="time">작성일</th>
              </tr>
            </thead>
            <tbody>
                <c:forEach items="${boardList}" var="item">
                    <tr>
                        <td class="no">${item.no}</td>
                        <td class="title">
                            <a href="/${item.no}">
                                ${item.title}
                            </a>
                        </td>
                        <td class="writer">${item.id.id}</td>
                        <td class="time">${item.date}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <button type="button" onclick="location.href='writePage'">글쓰기</button>

    </div>



</body>
</html>