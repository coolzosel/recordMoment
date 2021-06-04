/*
로그인 검증
*/

// 빈칸 체크
function chkAll() {

    var re = /^[0-9a-zA-Z]{10,}$/;
    var re2 = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z]+)(\.[0-9a-zA-Z]+){1,2}$/;

    var id = document.getElementById('user-id');
    var pw = document.getElementById('user-password');
    var pw2 = document.getElementById('user-passwordchk');
    var name = document.getElementById('user-name');
    var email = document.getElementById('user-email');
    var addrcode = document.getElementById('postcode');
    var addr1 = document.getElementById('address');
    var addr2 = document.getElementById('detailAddress');
    var agree = document.join.agree.checked;

    if (id.value.trim() == '' || id.value == null){
        alert("아이디를 입력하세요.");     
        return false;

    } else if(id.value.length < 4){    	
    	alert("아이디를 4자 이상 입력하세요.");
    	return false;

    } else if(pw.value.trim() == '' || pw.value == null){
        alert("비밀번호를 입력하세요.");
        return false;

    }else if(!re.test(pw.value)){
        alert("비밀번호를 영문과 숫자를 조합해 10글자 이상 입력하세요.");
        return false;

    } else if(pw.value != pw2.value){
        alert("비밀번호가 일치하지 않습니다.");
        return false;

    } else if(name.value.trim() == '' || name.value == null){
        alert("이름을 입력하세요.");
        return false;

    } else if(email.value.trim() == '' || email.value == null){
        alert("이메일을 입력하세요.");
        return false;

    } else if(!re2.test(email.value)){
        alert("이메일 양식에 맞게 올바르게 입력하세요.");
        return false;

    } else if(addrcode.value.trim() == '' || addrcode.value == null 
    || addr1.value.trim() == '' || addr1.value == null
    || addr2.value.trim() == '' || addr2.value == null){        
        alert("주소를 입력하세요.");        
        return false;

    } else if(!agree){
        alert("개인정보 이용약관에 동의하십시오.");
        return false;

    } else {
        // alert("가입성공!");
        return document.join.submit();

    }  
}


// 비밀번호 확인
var pw = $('#user-password');
var pw2 = $('#user-passwordchk');
var msg = $('#pwHelp');

pw,pw2.on('keyup', function() {
    
    if(pw.val() != null || pw2.val() != null) {

            if (pw.val() == pw2.val() && pw2.val() == pw.val()) {
                msg.html('비밀번호가 일치합니다.').css('color','#43cc29');
            }else {
                msg.html('비밀번호가 일치하지 않습니다.').css('color','#e52527');
            }
    }
});

// 아이디 중복 체크

function idChk() {
    id = $("#user-id").val();

    $.ajax({
        url: 'idCheck',
        type: 'POST',
        dataType: 'text', // 서버로부터 내가 받는 데이터 타입
        contentType: 'text/plain; charset=utf-8;', // 내가 서보로 보내는 데이터 타입
        data: id,

        success: function(data){
            if(data == "0"){
                console.log("아이디 없음");
                alert('사용 가능한 아이디입니다.');
            }else{
                console.log("아이디 있음");                
                alert("이미 존재하는 아이디입니다!"+typeof(data));
            }
        },
        error:function(){            
            alert("아이디를 입력하세요.");
        }

    });
}

