//console.log("signup. js loaded.");

//유효성 검사 객체
const checkobj = {
    "inputId" : false, //아이디
    "inputPw" : false, //비밀번호
    "inputPwConfirm" : false, //비밀번호 확인
    "inputName" : false //닉네임
};

console.log("signup. js loaded.");

//아이디 유효성 검사
const inputId = document.getElementById("inputId");

inputId.addEventListener("change", function(){ //keyup은 누룰때 마다 검사 / change는 벗어나면 검사함
    const regExp = /^[a-z][\w!@#$%^&*_-]{5,13}$/;  //[A-Z]:대문자  /  [\w] : 나머지 모든 워드
    //소문자 시작(1) + 나머지(5~13) = 6 ~14글자

    if(regExp.test(this.value)){//this ->이벤트 걸린 inputId 가리킴
        console.log("asd");
    this.style.backgroundColor = "green";
    this.style.color = "white";
    checkobj.inputId = true;
    } else{
        this.style.backgroundColor = "blue";
        this.style.color = "white";
        checkobj.inputId = false;
    }

}); 

//비밀번호 검사
    const inputPw = document.getElementById("inputPw");
    const inputPwConfirm = document.getElementById("inputPw2");

    inputPwConfirm.addEventListener("keyup", function() {

        if(inputPw.value.length == 0){
            this.value = "";
            alert("비밀번호를 먼저 입력해주세요");
            inputPw.focus();  //focus : input창에 커서 가는거
            checkobj.inputPw = false;
        }
    });

    const pwMessage = document.getElementById("pwMessage");

    inputPw.addEventListener("keyup",function() {

        if( (inputPw.value == inputPwConfirm.value ) && inputPw.value.length != 0 ){
            pwMessage.innerText = "비밀번호 일치";
            pwMessage.classList.add("confirm");
            pwMessage.classList.remove("error");
            checkobj.inputPw = true;
            checkobj.inputPwConfirm = true;
        }else{
            pwMessage.innerText = "비밀번호 불일치";
            pwMessage.classList.add("error");
            pwMessage.classList.remove("confirm");
            checkobj.inputPwConfirm = false;
        }

    });


    inputPwConfirm.addEventListener("keyup",function() {

        if( (inputPw.value == inputPwConfirm.value ) && inputPw.value.length != 0 ){
            pwMessage.innerText = "비밀번호 일치";
            pwMessage.classList.add("confirm");
            pwMessage.classList.remove("error");
            checkobj.inputPw = true;
            checkobj.inputPwConfirm = true;
        }else{
            pwMessage.innerText = "비밀번호 불일치";
            pwMessage.classList.add("error");
            pwMessage.classList.remove("confirm");
            checkobj.inputPwConfirm = false;
        }

    });

   //닉네임 유효성 검사
   //2-5 한글만
   const inputName = document.getElementById("inputName");

   inputName.addEventListener("change", function() {
       const regExp = /^[가-힣]{2,5}$/; 
       
       const nameMessage = document.getElementById("nameMessage");

       if(regExp.test(this.value)){
            nameMessage.innerText = "정상입력";
            nameMessage.classList.add("confirm");
            nameMessage.classList.remove("error");
            checkobj.inputName = true;
       }else{
        nameMessage.innerText = "2글자에서 5글자 사이 한글만 입력해주세요";
        nameMessage.classList.add("error");
        nameMessage.classList.remove("confirm");
        checkobj.inputName = false;
       }
      


   });







//최종적으로 유효성 검사 객체인 checkobj안에 있는 모든 value가 
//true 인지 확인해주는 함수
//만약 모두가 true다 -> 서버로 submit
//만약 하나라도 false다 -> 유효성검사가 완료되지 않았습니다.
function validate() {

    for(let key in checkobj){
        if( !checkobj[key] ){ //만약에 value값들이 false라면
            alert("유효성 검사가 완료되지 않았습니다.");
            return false;
        }
    }
    return true;
}




