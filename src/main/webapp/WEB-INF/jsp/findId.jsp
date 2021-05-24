<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest-아이디 찾기</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../_vendor/font-awesome/css/font-awesome.min.css">
</head>
<body>
    
    <div class="container">
        <form action="findId" method="POST" name="findId">
            <legend class="form-label mt-5 mb-4 text-center"><h2>아이디 찾기</h2></legend>
            <div class="form-floating">
                <input type="text" class="form-control" name="id" id="user-id" placeholder="아이디">
                <label for="floatingInput">이메일</label>
                <small class="form-text">가입 시 입력한 이메일을 입력하세요.</small><br>
                <input type="button" onclick="" value="아이디 찾기" class="btn btn-primary btn-nm">
            </div>
            

        </form>
        
    </div>
    
</body>
<script>
    // 빈 값 체크 후 submit하는 함수만들기 -> 계정없으면 없다고 error 메세지! 있으면 아이디 출력
    // 모달로 띄울 지 새창으로 띄울 지 고민
</script>
</html>