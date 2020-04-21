<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script>
        function toupdate() {
            window.location.href = 'update.jsp';
        }

    </script>

</head>
<body>
<h1 align="center">欢迎${name}登录本系统</h1>
<center>
    <%--<form id="form">--%>
    <table>
        <tr>
            <td align="center" colspan="2" onclick="toupdate()">修改密码</td>
        </tr>
    </table>
    <table>
        <tr>
            <td align="center" colspan="2">进行猜谜</td>
        </tr>
    </table>
    <%--</form>--%>
</center>
</body>
<script>
</script>
</html>

