<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <link rel="stylesheet" href="/my/resources/css/signup.css">
</head>
<body>
    <jsp:include page="../include/header.jsp" />
    <div name="sign">
        <h1 style="text-align: center ">회원가입</h1>
        <form id="form1">
            <div class="form-group" id="id">
                <label for="userid">아이디 :</label>
                <input type="text" id="userid" required placeholder="최대 10글자" maxlength="10"/>
            </div>

            <div class="form-group" id="pwd">
                <label for="password">비밀번호 :</label>
                <input type="password" id="password" required placeholder="최대 20글자" maxlength="20" />
            </div>

            <div class="form-group" id="checkPwd">
                <label for="passwordCheck">비밀번호 확인 :</label>
                <input type="password" id="passwordCheck" required placeholder="최대 20글자" maxlength="20" />
            </div>

            <div class="form-group" id="name">
                <label for="username">이름 :</label> 
                <input type="text" id="username" required />
            </div>

            <div class="form-group" id="email">
                <label for="emailInput">이메일 :</label>
                <input type="email" id="emailInput" required placeholder="예) Musical@kh.com"/>
            </div>

            <div id="signupbtn">
                <input type="submit" value="회원가입" />
            </div>
        </form>
    </div>
    <jsp:include page="../include/footer.jsp" />
</body>
</html>
    