<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title>查看用户信息</title>
</head>
<body>
<div style="margin:20px;">
    <div class="page-header">
        <h1><small>帮助</small></h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">最低配置的浏览器及界面分辨率？</h3>
        </div>
        <div class="panel-body">
            本站建议使用IE7.0及以上浏览器，1024×768分辨率进行浏览。
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">如何收藏本网站？</h3>
        </div>
        <div class="panel-body">
            您只需要在网页浏览器中点击“收藏—添加到收藏夹”，可以修改网页的保存名称后，点击“确定”。<br>
            本站提供收藏服务，每个页面上方“加入收藏”按钮可以将您正在浏览的页面保存进浏览器的收藏夹。
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">如何与我们联系？</h3>
        </div>
        <div class="panel-body">
            您如果在浏览本站的过程中遇到问题或有任何建议，发送邮件给:<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<address>shianqi@imudges.com</address>
        </div>
    </div>

</div>
</body>
</html>
