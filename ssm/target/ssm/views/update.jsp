<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script>
        function updatePassword() {

            ///todo 有问题
            //var data = $("#form").serialize().val();
            var obj = {};
            obj.oldPassword  = $("#oldPassword").val();
            obj.newPassword  = $("#newPassword").val();
            obj.checkNewPassword  = $("#checkNewPassword").val();
            JSON.stringify(obj);
            $.ajax({
                type: 'post',
                url: '/update',
                cache: false,
                data: obj,  //重点必须为一个变量如：data
                dataType: 'json',
                //contentType: "application/json",
                success: function (data) {
                    alert(JSON.stringify(data));
                    if (data.statusCode == '1001') {
                        window.location.href = "welcome.jsp";
                    } else {
                        window.location.href = "error.jsp";
                    }
                },
                error: function (data) {
                    alert(data)
                    // window.location.href = "/error.jsp";
                }
            })
        }
    </script>
</head>
<body>
<h1 align="center">欢迎${name}修改密码</h1>
<center>
    <%--<form id="form" action="/login" method="post">--%>
    <form id="form" >
        <table>
            <tr>
                <td align="center" colspan="2">表单提交</td>
            </tr>
            <tr>
                <td>旧密码：</td>
                <td><input id="oldPassword" type="password" name="oldPassword"></td>
            </tr>
            <tr>
                <td>新密&nbsp;&nbsp;码:</td>
                <td><input id="newPassword" type="password" name="newPassword"></td>
            </tr>
            <tr>
                <td>确认新密&nbsp;&nbsp;码:</td>
                <td><input id="checkNewPassword" type="password" name="checkNewPassword"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" id="commit" name="commit" value="提交" onclick="updatePassword()">
                    <input type="reset" name="重置">
            </tr>
        </table>
    </form>
</center>
</body>
<script>
</script>
</html>

