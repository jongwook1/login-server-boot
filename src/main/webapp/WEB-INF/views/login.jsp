<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2021-12-30
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/login.css">
    <title>Login</title>
</head>
<body>
    <div class="wrap">
        <header><c:import url="header.jsp"></c:import></header>
        <main>
            <H1>LOGIN</H1>
            <form method="get" action="loginAction" id="loignForm">
                <table>
                    <tr>
                        <td>아이디</td>
                        <td><input type="text" name="userid" size="20"></td>
                    </tr>
                    <tr>
                        <td>비밀번호</td>
                        <td><input type="password" name="pw" size="20"></td>
                    </tr>

                </table>
                <div id="wrapBtn">
                <input type="submit" value="확인" id="login">
                </div>
        </main>
        <nav></nav>
        <aside></aside>
        <footer><c:import url="footer.jsp"></c:import></footer>
    </div>

</body>
</html>
