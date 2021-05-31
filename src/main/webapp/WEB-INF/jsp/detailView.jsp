<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-detailView</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body class="font2">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/board">devTest</a>
            <div class="collapse navbar-collapse" id="navbarColor03">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">${sessionScope.id}님 반갑습니다^0^*</li>
                    <li class="nav-item"><a href="/logout">로그아웃</a></li>
                </ul>
            </div>
        </div>
    </nav>
    
	<div class="container mt-5">
        <table style="border: solid #7b8ab8 1px; width: 100%;">
            <tr style="border: solid 1px #7b8ab8;">
                <th class="no" style="padding:10px; border: solid 1px #7b8ab8;">No.</th>
                <td style="padding:10px; background-color: #fff;">${post.no}</td>
            </tr>
            <tr style="border: solid 1px #7b8ab8;">
                <th class="id" style="padding:10px; border: solid 1px #7b8ab8;">작성자</th>
                <td style="padding:10px; background-color: #fff;">${post.id.id}</td>
            </tr>
            <tr style="border: solid 1px #7b8ab8;">
                <th class="id" style="padding:10px; border: solid 1px #7b8ab8;">작성일</th>
                <td style="padding:10px; background-color: #fff;">${post.date}</td>
            </tr>
            <tr style="border: solid 1px #7b8ab8;">
                <th class="title" style="padding:10px; border: solid 1px #7b8ab8;">제목</th>
                <td style="padding:10px; background-color: #fff;">${post.title}</td>
            </tr>
            <tr style="border: solid 1px #7b8ab8; height: 300px;">
                <th class="content" style="padding:10px; border: solid 1px #7b8ab8;">내용</th>
                <td style="padding:10px; background-color: #fff;">${post.content}</td>
            </tr>
        </table>
        <button type="button" class="btn btn-primary btn-nm" onclick="location.href='/board'">목록</button>
        <button type="button" class="btn btn-primary btn-nm" onclick="location.href='/update/${post.no}'">수정</button>
	    
    </div>
	
    

	
</body>
</html>