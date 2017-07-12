<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>软工14信息填表处</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
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
            border-radius: 15px;
        }

        #ctn input, textarea {
            background: rgba(0, 0, 0, 0);
            border-radius: 4px;
            height: 30px;
        }

        #ctn button {
            background: rgba(0, 0, 0, 0);
            border-radius: 6px;
            width: 100px;
        }

        #ctn table {
            margin-top: 20px;
        }

        .ctn_size {
            width: 500px;
            height: auto;
            margin-top: 80px;
            background-color: rgba(255, 255, 255, 0.2);
            text-align: center;
        }
    </style>
</head>
<body>
<div id="ctn" class="container ctn_size">
    <form id="formSunmit" action="${pageContext.request.contextPath}/activity/addmsg" method="post">
        <table class="table">
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
                <td><input type="radio" name="sex" value="男" checked>男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
                <td>楼室号</td>
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
                    <div><input type="text" name="durTime"></div>
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
                    <div><input type="text" name="teacher" value="胡炀"></div>
                </td>
            </tr>
            <tr>
                <td>联系电话</td>
                <td>
                    <div><input type="text" name="teacherTel" value="667000"></div>
                </td>
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

    <a style="cursor: hand" onclick="listinfo()">查看班级报名情况</a>
    <div id="showMsg"></div>
</div>
<script>

    /*判断用户是否登陆状态*/
    var loginUser = '${pageContext.session.getAttribute("loginUser")}';

    $(document).ready(function () {
        if (loginUser == '') {
            window.location.href = "${pageContext.request.contextPath}/pages/login.jsp";
        }
    });

    var successMsg;
    var submitStr;
    submitStr = $("#formSunmit").html();
    submitStr += '<a style="cursor: hand" onclick="listinfo()">查看班级报名情况</a>';

    function listinfo() {
        $.ajax({
            type: "GET",
            async: false,
            url: "${pageContext.request.contextPath}/activity/getInfos",
            success: function (data) {
                successMsg = data;
                $("#formSunmit").hide();
                showAllMsg(data);
            }
        });
    }

    function showAllMsg(data) {
        var htmlstr = "<table class='table table-bordered' id='allMsg'>";
        htmlstr += "<caption><h2>软工14信息报名信息详情表</h2></caption>";

        htmlstr += "<tr>";
        for (var o in data[0]) {
            htmlstr += "<th>" + o + "</th>";
        }
        htmlstr += "</tr>";

        for (var i = 0; i < data.length; i++) {
            htmlstr += "<tr>";
            for (var o in data[i]) {
                htmlstr += "<td>" + data[i][o] + "</td>";
            }
            htmlstr += "</tr>";
        }
        htmlstr += "</table>";
        htmlstr += "<a style='cursor: hand' onclick='backTo()'>返回</a><br>";

        /*htmlstr += "<a style='cursor: hand' onclick='exportExl()'>导出数据</a>";*/

        $("#ctn").html(htmlstr);
    }

    function backTo() {
        $("#allMsg").hide();
        $("#ctn").html(submitStr);
    }

    function exportExl() {
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/activity/exportExl",
            dataType: "text",
            success: function (data) {
                window.alert(data);
            },
            error: function (e) {
                console.log(e)
            }
        });
    }

</script>
</body>
</html>
