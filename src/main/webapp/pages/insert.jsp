<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>软工14信息填表处</title>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

    <style>
        * {
            color: #ffffff;
        }

        body {
            background-image: url("${pageContext.request.contextPath}/images/blur.jpg");
            background-size: 100% 100%;
        }

        #ctn {
            border-radius: 25px;
        }

        #ctn input, textarea {
            background: rgba(0, 0, 0, 0);
            border-radius: 4px;
            height: 30px;
        }

        #ctn td div {
            width: 200px;
            height: 15px;
            border: 2px #ffffff;
            border-radius: 10px;
        }

        #ctn button {
            background: rgba(0, 0, 0, 0);
            border-radius: 6px;
            width: 100px;
        }
    </style>
</head>
<body>
<div id="ctn" align="center">
    <form action="${pageContext.request.contextPath}/addmsg" method="post">
        <table cellpadding="8">
            <caption><h2>软工14信息填表处</h2></caption>
            <tbody>
            <tr>
                <td>学院</td>
                <td>
                    <div><input type="text" name="college" value="电子与计算机学院"></div>
                </td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                    <div><input type="text" name="name"></div>
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="sex" value="男" checked>男&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="sex" value="女">女
                </td>
            </tr>
            <tr>
                <td>学号</td>
                <td>
                    <div><input type="text" name="snum"></div>
                </td>
            </tr>
            <tr>
                <td>班级</td>
                <td>
                    <div><input type="text" name="classes"></div>
                </td>
            </tr>
            <tr>
                <td>搂室号</td>
                <td>
                    <div><input type="text" name="address"></div>
                </td>
            </tr>
            <tr>
                <td>联系号码（或短号）</td>
                <td>
                    <div><input type="text" name="tel"></div>
                </td>
            </tr>
            <tr>
                <td>留校时间</td>
                <td>
                    <div><input type="text" name="dur_Time"></div>
                </td>
            </tr>
            <tr>
                <td>留校原因</td>
                <td>
                    <div><textarea name="reason" rows="2" cols="22"></textarea>
                    </div>
                </td>
            </tr>
            <tr>
                <td>负责老师</td>
                <td>
                    <div><input type="text" name="teacher" value="胡杨"></div>
                </td>
            </tr>
            <tr>
                <td>联系电话</td>
                <td>
                    <div><input type="text" name="teacher_tel" value="667000"></div>
                </td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td align="center">
                    <button type="submit">提交</button>
                </td>
                <td align="center">
                    <button type="reset">重置</button>
                </td>
            </tr>
            </tbody>
        </table>
    </form>

    <button onclick="listinfo()">asdhgarhasg</button>
</div>
<script>
    var flag = "${flag}";
    console.log(flag);
    if (flag != null && flag != "") {
        window.alert(flag);
    }


    function listinfo() {
        $.ajax({
            type: "POST",

            async: false,
            url: "${pageContext.request.contextPath}/activity/getInfos",
            data: {
                flag: 1
            },
            success: function (data) {
                alert(data);
            }
        });
    }

</script>
</body>
</html>
