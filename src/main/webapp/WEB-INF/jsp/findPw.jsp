<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
    <div class="container">
        <form action="findPw" method="POST" name="findId">
            <legend class="form-label mt-5 mb-4 text-center"><h2>비밀번호 찾기</h2></legend>
            <div class="form-floating">
                <input type="text" class="form-control" name="email" id="email" placeholder="이메일">
                <label for="floatingInput">이메일</label>
                <small class="form-text">가입 시 입력한 이메일을 입력하세요.</small><br>
                <button type="button" onclick="location.href='/'" class="btn btn-primary btn-nm">로그인 화면으로</button>
                <button type="button" onclick="" class="btn btn-primary btn-nm">비밀번호 찾기</button>
            </div>
            

        </form>
        
    </div>
</body>