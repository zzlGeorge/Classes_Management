<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/6/29
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stu_M</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <style>
        * {
            color: #ffffff;
            font-family: Arial, Helvetica, sans-serif;
            padding: 0;
            margin: 0;
        }

        iframe {
            border: hidden;
            display: block;
            width: 100%;
            height: 100%;
        }

        #mynav {
            position: absolute;
            width: 100%;
            background-color: rgba(0, 200, 0, 0.2);
        }

    </style>
</head>
<body>
<audio id="bgm" controls="controls" autoplay loop hidden>
    <source src="${pageContext.request.contextPath}/audio/clark.mp3">
    <source src="${pageContext.request.contextPath}/audio/sweden.mp3">
    Your browser does not support the audio tag.
</audio>
<nav id="mynav" class="navbar" role="navigation">
    <div class="container-fluid" style="text-align: center">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span> 软件工程14</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-off"></span> 退出</a></li>
            <li id="music"><a href="#"><span class="glyphicon glyphicon-pause"></span> BGM</a></li>
        </ul>
        <div>
            <p class="navbar-text">Runoob 用户登录</p>
        </div>
    </div>
</nav>
<iframe src="${pageContext.request.contextPath}/pages/login.jsp">
    您的浏览器不支持iframe!
</iframe>

<script>
    var media = $("#bgm")[0];

    $("#music").bind('click', function () {
        playAudio();
    });

    //播放暂停切换
    function playAudio() {
        if (media.paused) {
            media.play();
            $("#music span").removeClass('glyphicon glyphicon-music');
            $("#music span").addClass('glyphicon glyphicon-pause');
        } else {
            media.pause();
            $("#music span").removeClass('glyphicon glyphicon-pause');
            $("#music span").addClass('glyphicon glyphicon-music');
        }
    }
</script>
</body>
</html>
