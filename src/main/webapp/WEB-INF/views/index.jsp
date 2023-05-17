<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>INDEX</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width" , initial-scale="1"> <!--뷰포트 설정(브라우저 자동크기조절 중단)-->
    <link rel="stylesheet" href="../static/css.bootstrap.min.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
        #header {
            background-color:lightgrey;
            height:100px;
        }
        #nav {
            background-color:#339999;
            color:white;
            width:200px;
            height:300px;
            float:left;
        }
        #section {
            width:200px;
            text-align:left;
            float:left;
            padding:10px;
        }
        #footer {
            background-color:#FFCC00;
            height:100px;
            clear:both;
        }
        #header, #nav, #section, #footer { text-align:center; }
        #header, #footer { line-height:100px; }
        #nav, #section { line-height:240px; }
    </style>
</head>
<body>
    <div id="header">
        <h2>HEADER 영역</h2>
    </div>
    <div id="nav">
        <h2>NAV 영역</h2>
    </div>
    <div id="section">
        <h2>SECTION 영역</h2>
    </div>
    <div id="footer">
        <h2>FOOTER 영역</h2>
    </div>
</body>
</html>