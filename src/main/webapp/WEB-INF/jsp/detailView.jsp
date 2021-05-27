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
<body>
	<div class="container mt-5">
        글번호 :  ${post.no} <br>
        좋아요 수 : ${post.liked} <br>
        제목 : ${post.title} <br>
        내용 : ${post.content} <br>
    </div>
	
    <button type="button" class="btn btn-primary btn-nm" onclick="">목록</button>
    <button type="button" class="btn btn-primary btn-nm" onclick="">수정</button>
    <button type="button" class="btn btn-primary btn-nm" onclick="">삭제</button>
    

	
</body>
</html>