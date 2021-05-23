/*
로그인 검증
*/

// 빈칸 체크
function chkAll() {
    var id = document.getElementById('user-id');
    var pw = document.getElementById('user-password');
    var pw2 = document.getElementById('user-passwordchk');
    var name = document.getElementById('user-name');
    var email = document.getElementById('user-email');
    var addrcode = document.getElementById('postcode');
    var addr1 = document.getElementById('address');
    var addr2 = document.getElementById('detailAddress');
    var agree = document.getElementById('agree');

    if (id.value.trim() == '' || id.value == null){
        alert("아이디를 입력하세요.");        
        return false;
    }
    
    if(id.value.length < 4){    	
    	alert("아이디를 4자 이상 입력하세요.");
    	return false;
    } 
    
    // ? 특이점.. if 로직이 한꺼번에 합쳐지면 .. 실행이 안됨 
    // 아이디 중복체크 로직짜보기.

    if(pw.value.trim() == '' || pw.value == null){
        alert("비밀번호를 입력하세요.");
        return false;
    }
    
    if(pw.value != pw2.value){
        alert("비밀번호가 일치하지 않습니다.");
        return false;
    }

    if(name.value.trim() == '' || name.value == null){
        alert("이름을 입력하세요.");
        return false;
    }
    
    if(email.value.trim() == '' || email.value == null){
        alert("이메일을 입력하세요.");
        return false;
    }

    if(addrcode.value.trim() == '' || addrcode.value == null 
    || addr1.value.trim() == '' || addr1.value == null
    || addr2.value.trim() == '' || addr2.value == null){        
        alert("주소를 입력하세요.");        
        return false;
    }
    
//    if(pw.value == ''){
//        alert("이용약관에 동의하십시오.");
//        return false; // 이건 더 찾아보고 밸류값 유효성체크 알아보기
//
//    }

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

