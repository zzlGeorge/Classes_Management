<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/6/21
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <style>

        * {
            color: #000000;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background-image: url("${pageContext.request.contextPath}/images/mc.jpg");
            background-size: 100% 100%;
        }

        .lgContainer {
            position: absolute;
            left: 50%;
            top: 50%;
            /*border: 3px solid #2b542c;*/
            width: 500px;
            height: 350px;
            margin-left: -250px;
            margin-top: -175px;

            border-radius: 35px;
            background-color: rgba(255, 255, 255, 0.3);
        }

        #title {
            /*border: solid 2px #2b542c;*/
            width: 200px;
            margin-left: 150px;
            margin-top: 30px;
            text-align: center;
        }

        #lgTable {
            width: 300px;
            margin-top: 20px;
            margin-left: 100px;
            border-collapse: separate;
            border-spacing: 0px 40px;
        }

        #lgTable .qtd {
            width: 100px;
        }

        .blur {
            -webkit-filter: blur(4px);
            filter: blur(4px);
        }
    </style>
</head>
<body>

<div class="lgContainer">
    <div id="title"><h3>学生登陆</h3></div>
    <table id="lgTable">
        <tr>
            <td class="qtd">学号：</td>
            <td><input class="form-control" type="text" id="sno" placeholder="请输入您的学号"/></td>
        </tr>
        <tr>
            <td class="qtd">手机长号：</td>
            <td><input class="form-control" type="password" id="longTel" placeholder="请输入您的手机长号"/></td>
        </tr>
        <tr>
            <td class="qtd"></td>
            <td align="center">
                <button class="btn btn-primary btn-block" onclick="loginS()">登陆</button>
            </td>
        </tr>
    </table>
</div>


<script>

    $(document).ready(function () {
        $(".lgContainer").hover(
            function () {
                $(this).css({
                    backgroundColor: "rgba(255,255,255,0.45)"
                });
            },
            function () {
                $(this).css({
                    backgroundColor: "rgba(255,255,255,0.3)"
                });
            }
        );


    });


    function loginS() {
        var username = $("#sno").val();
        var password = $("#longTel").val();

        console.log(username + " " + password);

        $.ajax({
            url: '${pageContext.request.contextPath}/user/login',
            type: 'post',
            async: true,
            data: {'sno': username, 'longTel': password},
            dataType: 'json',
            success: function (data) {
                window.alert(data.description);
                if (data.result > 0)
                    window.location.href = '${pageContext.request.contextPath}/pages/insert.jsp';
                console.info(data);
            },
            error: function (e) {
                window.alert('something error!');
                console.info(e);
            }
        });
    }

</script>
</body>
</html>
