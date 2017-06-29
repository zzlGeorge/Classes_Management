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

        #mdiv {
            position: absolute;
            left: -100px;
            margin-left: 100%;
            margin-top: 30px;
        }

        #music {
            width: 56px;
            height: 35px;
            cursor: hand;
        }

        .blur {
            -webkit-filter: blur(4px);
            filter: blur(4px);
        }
    </style>
</head>
<body>
<audio id="bgm" controls="controls" autoplay loop hidden>
    <source src="${pageContext.request.contextPath}/audio/sweden.mp3">
    <source src="${pageContext.request.contextPath}/audio/clark.mp3">
    Your browser does not support the audio tag.
</audio>
<div id="mdiv" align="center">
    <img id="music" src="${pageContext.request.contextPath}/images/on.png"/><br>
    <span><b style="color: #ffffff">MUSIC</b></span>
</div>

<div class="lgContainer">
    <div id="title"><h3>学生登陆</h3></div>
    <table id="lgTable">
        <tr>
            <td class="qtd">学号：</td>
            <td><input class="form-control" type="text" id="sno"/></td>
        </tr>
        <tr>
            <td class="qtd">手机长号：</td>
            <td><input class="form-control" type="password" id="longTel"/></td>
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
    var media = $("#bgm")[0];

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

        $("#music").bind('click', function () {
            playAudio();
        });

    });

    //播放暂停切换
    function playAudio() {
        if (media.paused) {
            media.play();
            $("#music").attr({src: "${pageContext.request.contextPath}/images/on.png"});
        } else {
            media.pause();
            $("#music").attr({src: "${pageContext.request.contextPath}/images/mute.png"});
        }
    }

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
                window.location.href='${pageContext.request.contextPath}/pages/insert.jsp';
            },
            error: function () {
                window.alert('something error!');
            }
        });
    }

</script>
</body>
</html>
