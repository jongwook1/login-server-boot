<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page language="java" pageEncoding="utf-8" contentType="text/html; ISO-8859-1" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script type="text/javascript" src="script/validation.js"></script>
    <link rel="stylesheet" href="css/join.css">

    <title>Join</title>
</head>
<body>
    <div class="wrap">
    <header><c:import url="header.jsp"></c:import></header>

        <main>
            <h1>JOIN</h1>
            <form method="get" action="joinAction" id="joinform">
                <table>
                    <tr>
                        <td>이름</td>
                        <td><input type="text" name="name" size="20">*</td>
                    </tr>

                    <tr>
                        <td>아이디</td>
                        <td><input type="text" name="userid" size="20" id="userid">*
                        </td>
                        <td><input type="hidden" name="reid" size="20"> <input
                                type="button" id="re_check" value="중복 체크" onclick="idCheck()"
                                class="w3-button w3-round w3-padding-small w3-dark-grey"></td>
                    </tr>
                    <tr>
                        <td>암 호</td>
                        <td><input type="password" name="pw" size="20">*</td>
                    </tr>
                    <tr height="30">
                        <td width="80">암호 확인</td>
                        <td><input type="password" name="pwd_check" size="20">*</td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td><input type="text" name="email" size="20"></td>
                    </tr>
                    <tr>
                        <td>전화번호</td>
                        <td><input type="text" name="phone" size="20"></td>
                    </tr>

                </table>
                <div id="wrapBtn">
                <input type="button" value="확인" id="btn" onclick="checkVal(form)">
                </div>
            </form>
        </main>
        <nav></nav>
        <aside></aside>
        <footer><c:import url="footer.jsp"></c:import></footer>

    </div>

</body>


</html>