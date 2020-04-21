<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script>
        function login() {
            // var obj = {};
            // obj.name = $("input[name='name']").val();
            // obj.password = $("input[name='password']").val();

            var name = $("#name").val();
            var password = $("#password").val();

            var Param1 = JSON.stringify({ "name": name, "password": password }); //必须转换为Json对象

            // alert(obj.name );
            // alert(obj.password );
            //var data = $("#form").serialize().val();
            $.ajax({
                type: 'post',
                url: '/login',
                cache: false,
                data: Param1,  //重点必须为一个变量如：data
                //dataType: 'json',
                contentType: "application/json",
                success: function (data) {
                    //alert(data);
                    if (data) {
                        window.location.href = "views/welcome.jsp";
                    } else {
                        window.location.href = "views/error.jsp";
                    }
                },
                error: function (data) {
                    alert(data)
                    // window.location.href = "/error.jsp";
                }
            })
        }
    </script>
    <title>提交表单</title>
</head>

<body>
<center>
    <%--<form id="form" action="/login" method="post">--%>
    <form id="form" action="/login" method="post">
        <table>
            <tr>
                <td align="center" colspan="2">表单提交</td>
            </tr>
            <tr>
                <td>用户名：</td>
                <td><input id="name" type="text" name="name"></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码:</td>
                <td><input id="password" type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" id="commit" name="commit" value="提交" onclick="login()">
                    <input type="reset" name="重置">
            </tr>
        </table>
    </form>
</center>
</body>
<script>

</script>

</html>

