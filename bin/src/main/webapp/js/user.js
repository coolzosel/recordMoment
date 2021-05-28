var title = document.getElementById("title");
	var content = document.getElementById("content");

	window.onload = function writeChk(){
		if(title.value.trim() == '' || title.value == null || 
		content.value.trim() == '' || content.value == null) {
			alert("내용을 입력하세요.");
			return false;
		}else {
			return document.postWrite.submit();
		}
	}
