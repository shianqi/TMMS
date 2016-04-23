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
    <title>system—修改用户信息</title>
</head>
<body>
	<div style="margin:20px;">
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">公告详情</h3>
	      </div>
	      <div class="panel-body">
	      	<h3 style="margin-top:0; text-align:center;">${proclamation.getPTitle()}</h3>
	      	<h5 style="text-align:center;">发布者：${proclamation.getUsers().getUName()}
	      	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：${proclamation.getPTime()}</h5>
	      	<pre style=" word-wrap:break-word; word-break:normal;">${proclamation.getPText()}</pre>
	      </div>
		</div>
	</div>
</body>
</html>