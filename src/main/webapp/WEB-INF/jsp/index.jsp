<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>devTest</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../_vendor/font-awesome/css/font-awesome.min.css">
</head>
<body>
    <div class="text-center font1 mt-5">
        <a href="/">
            devTest
        </a>
    </div>

    <form action="login" method="POST" id="login-form" name="login">
        <fieldset>
            <div class="container text-center font2 mt-5">
                <legend><h2>Login</h2></legend>
                <div class="form-group">
                    <div class="form-floating mb-3">
                      <input type="id" class="form-control" id="id" placeholder="id" name="id">
                      <label for="floatingInput">아이디</label>
                    </div>
                    <div class="form-floating">
                      <input type="password" class="form-control" id="pw" placeholder="Password" name="pw">
                      <label for="floatingPassword">비밀번호</label>
                    </div>
                    <button type="button" class="btn btn-primary btn-nm" onclick="isNotnull()">로그인</button>
                    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='joinPage'">회원가입</button>
                    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='findIdPage'">아이디 찾기</button>
                    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='findPwPage'">비밀번호 찾기</button>
                </div>
            </div>
        </fieldset>
    </form>

</body>
<script type="text/javascript">
    
    // 로그인 빈 칸 체크
    var id = document.getElementById("id");
    var pw = document.getElementById("pw");

    function isNotnull() {
        if(id.value.trim() == '' || pw.value.trim() == '') { 
            alert("빈 칸을 채워주세요.(공백은 적용되지 않습니다.)");
            return false;
        }else {
            return document.login.submit();
        }
    }

</script>
</html>



