function checkVal(form) {
    console.log("checkVal")
    if (!checkName(form)) {
        return false;
    }
    else if (!checkId(form)) {
        return false;
    }
    else if (!checkPw(form)) {
        return false;
    }

    else if (!checkMail(form)) {
        return false;
    }
    else if (!checkPhonnumber(form)) {
        return false;
    }
    form.submit();
}

//공백체크함수
function checknull(value) {
    if (value == "") {
        return false;
    }
    return true;
}

//아이디 유효성검사
function checkId(inputValue) {
    if (!checknull(inputValue.userid.value)) {
        alert("아이디가 공백입니다")

        inputValue.userid.focus();

        return false;
    }
    let valTest = /^[a-zA-Z0-9]{4,12}$/

    if (!valTest.test(inputValue.id.value)) {
        alert("아이디는 (영문or대소문자or숫자)4~12자리로 입력")


        const form = document.info;
        form.id.value = "";      //input태그 name=id 인곳 공백만듬
        form.id.focus();        //포커스잡아줌
        return false;
    }
    return true;

}

//비밀번호 유효성검사
function checkPw(form) {
    // alert("checkPw")
    if (!checknull(form.pw.value)) {
        alert("비밀번호가 공백입니다");
        form.pw.focus();
        return false;
    }
    let valTest = /^[a-zA-Z0-9]{4,12}$/

    if (!valTest.test(form.pw.value)) {
        alert("비번은 영문(대문자 OR 소문자 OR 숫자)4~12자리로 입력");

        const form = document.info;
        form.pw.value = "";      //input태그 name=id 인곳 공백만듬
        form.pw.focus();        //포커스잡아줌
        return false;
    }

    if (form.pw.value == form.id.value) {
        alert("아디와 비번이 같으면 안됩니다");
        form.pw.value = "";
        form.pw.focus();
        return false;
    }

    if (!checknull(form.pwd_check.value)) {
        alert("재확인비밀번호가 공백입니다")
        form.pw2.focus();
        return false;
    }

    if (form.pwd_check.value != form.pw.value) {
        alert("처음입력한 비밀번호와 맞지않습니다");
        form.pwd_check.value = "";
        form.pwd_check.focus();
        return false;
    }

    return true;
}

//이름 검사
function checkName(form) {
    // alert("여들어오냐")
    if (!checknull(form.name.value)) {
        alert("이름이 공백입니다")
        const form = document.info;
        form.name.value = "";
        form.name.focus();
        return false;
    }

    let valTest = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|$]/;       //한글영어만 입력받기
    if (!valTest.test(form.name.value)) {
        alert("이름은 한글or영문or대소문자로 입력");

        const form = document.info;
        form.name.value = "";      //input태그 name이 name 인곳 공백만듬
        form.name.focus();        //포커스잡아줌
        return false;
    }
    // alert("이름검사끝")
    return true;
}

//메일 검사
function checkMail(form) {
    if (!checknull(form.email.value)) {
        alert("메일이 공백입니다")
        const form = document.info;
        form.email.value = "";      //input태그 email이 email 인곳 공백만듬
        form.email.focus();
        return false;
    }

    let valTest = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

    if (!valTest.test(form.email.value)) {
        alert("이메일주소를 확인해주세요");
        const form = document.info;
        form.email.value = "";      //input태그 name이 email 인곳 공백만듬
        form.email.focus();        //포커스잡아줌
        return false;
    }

    return true;
}

//전화번호검사
function checkPhonnumber(form){
    if(!checknull(form.phone.value)){
        alert("전화번호가 공백입니다")
        return false;
    }

    return true;
}