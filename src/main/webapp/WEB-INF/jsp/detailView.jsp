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
        <table>
            
        </table>
		글번호 :  ${post.no} <br>	    
		작성자 : ${post.id.id} <br>
	   	제목 : ${post.title} <br>
	   	내용 : ${post.content} <br>
	    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='/board'">목록</button>
	    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='/update/${post.no}'">수정</button>
	    <!-- <button type="button" class="btn btn-primary btn-nm" onclick="">삭제</button> -->
    </div>
	
    

	
</body>
</html>