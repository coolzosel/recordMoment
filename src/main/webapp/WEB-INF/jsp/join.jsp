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
    <link rel="stylesheet" href="../_vendor/font-awesome/css/font-awesome.min.css">
</head>
<body>
    <div class="container">
        <form action="join" method="POST" id="join-form">
            <fieldset>

                <legend class="form-label mt-5 mb-4 text-center"><h2>회원가입</h2></legend>
                <div class="form-floating" style="width: 60%;">
                    <input type="text" class="form-control" name="id" id="user-id" placeholder="아이디">
                    <label for="floatingInput">아이디</label>
                    <small class="form-text">4자 이상 입력하세요.</small><br>
                    <input type="button" onclick="" value="아이디확인" class="btn btn-primary btn-nm">
                </div>
                <br>

                <div class="form-floating mb-3">
                    <input type="password" class="form-control" name="pw" id="user-password" placeholder="비밀번호">
                    <label for="floatingPassword">비밀번호</label>
                    <small class="form-text">10자 이상 영문, 숫자를 사용하세요.</small>
                </div>
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" name="pwchk" id="user-passwordchk" placeholder="비밀번호 확인">
                    <label for="floatingPassword">비밀번호 확인</label>
                    <small id="pwHelp"></small>
                </div>
                <br>

                <div class="form-floating mb-3">
                    <input type="name" class="form-control" name="name" id="user-name" placeholder="이름">
                    <label for="floatingPassword">이름</label>
                </div>
                <br>

                <div class="form-floating mb-3">
                    <input type="email" class="form-control" name="email" id="user-email" placeholder="user@example.com">
                    <label for="floatingInput">이메일</label>
                </div>
                <br>

                <div class="mb-3 form-post">
                    <div class="form-floating" style="width: 60%;">
                        <input type="text" id="postcode" placeholder="우편번호" class="form-control" name="addr1">
                        <label for="floatingInput">우편번호</label>
                        <input type="button" onclick="execDaumPostcode()" value="우편번호 찾기" class="btn btn-primary btn-nm">
                    </div>
                    <div class="form-floating">
                        <input type="text" id="address" placeholder="주소" class="form-control" name="addr2">
                        <label for="floatingInput">주소</label>
                    </div>
                    <div class="form-floating">
                        <input type="text" id="detailAddress" placeholder="상세주소" class="form-control" name="addr3">
                        <label for="floatingInput">상세주소</label>
                    </div>
                    <div class="form-floating"">
                        <input type="text" id="extraAddress" placeholder="참고항목"  class="form-control">
                        <label for="floatingInput">참고항목</label>
                    </div>
                </div>
                <br>
                
                <div class="form-group">
                    <div id="privacy-agree" style="overflow: scroll;" class="form-control">
                        <h5>이용약관 및 개인정보 처리방침</h5>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa ea illo deserunt totam aliquam, itaque ut autem commodi ducimus assumenda nihil architecto officiis sunt eos aspernatur. Dolor non molestias quasi.
                        Ut eius, sint ea consequatur blanditiis quaerat officia sit ipsam fugiat reiciendis? Commodi fugiat dolorum nesciunt iusto repellat velit tempora sit, tenetur exercitationem cumque necessitatibus facilis quis totam sed eum?
                        Vero perspiciatis quia nisi facere! Aperiam ratione odio enim itaque nihil quod accusantium adipisci tempore totam dignissimos laborum beatae incidunt, magni est nam eveniet pariatur quibusdam odit asperiores nulla eaque?
                        A soluta, cumque, harum hic totam voluptatem vitae eveniet expedita, nihil consectetur minima magni qui mollitia voluptas explicabo? Iste provident in veniam exercitationem enim laudantium porro quod ipsam commodi veritatis?
                        Obcaecati minus vero minima voluptatibus voluptatem repudiandae saepe sint, placeat fugiat delectus hic et, deleniti autem numquam labore blanditiis magnam! Voluptatem debitis ea eveniet et blanditiis sed! Voluptatum, debitis vitae.
                        Asperiores numquam omnis, reprehenderit magnam recusandae quidem placeat quod ratione minima iusto ducimus officiis sunt nihil quam quasi similique inventore ipsum reiciendis suscipit et neque laboriosam. Harum repellendus dolorem explicabo!
                        Temporibus quae quia consequuntur et, corrupti saepe numquam vel veritatis quasi deserunt quod doloribus obcaecati dignissimos quisquam perferendis mollitia culpa fuga inventore sint, dolorem, nobis consectetur vitae! Debitis, illum autem?
                        Molestias distinctio hic iure culpa necessitatibus unde voluptas, animi odio! Ratione et delectus recusandae provident porro natus dolorem, sit facilis deleniti vero quis perferendis minima tempore, accusamus asperiores! Ullam, provident.
                        Porro minus ut voluptatibus quae earum repellendus delectus. Harum asperiores quod sapiente inventore illum ratione odio beatae eos, placeat eaque quasi corrupti mollitia doloremque laborum nam laudantium! Quidem, vero! Veritatis?
                        Reiciendis, inventore culpa repellendus excepturi atque fugit, laudantium molestiae corrupti aliquam incidunt nulla quod illum nisi laboriosam, nostrum mollitia. Obcaecati corporis doloribus illo ab, sint quaerat et facere dignissimos deserunt!
                    </div>
                    <label for="privacy-agree" class="form-label" style="float: right;">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault" id="agree">
                        이용약관 및 개인정보 처리방침에 동의합니다.
                    </label>
                </div>
                <br>
                <div class="form-group">
                    <button type="button" class="btn btn-primary btn-nm" onclick="chkAll()">가입하기</button>
                    <button type="button" class="btn btn-primary btn-nm" onclick="location.href='/'">뒤로가기</button>

                </div>


                
            </fieldset>

        
        </form>

    </div>
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="../../js/addr.js"></script>
<script src="../../js/login.js"></script>

</html>