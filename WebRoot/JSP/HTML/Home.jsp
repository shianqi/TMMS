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
		<div class="jumbotron" style="padding:50px;">
	      <h1>Hello</h1>
	      <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
	      <p><a class="btn btn-primary btn-lg" href="" role="button">Learn more</a></p>
	    </div>
	    <div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">最新公告</h3>
	      </div>
	      <div class="panel-body">
	      	<h3 style="margin-top:0; text-align:center;">${proclamation.getPTitle()}</h3>
	      	<h5 style="text-align:center;">发布者：${proclamation.getUsers().getUName()}
	      	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：${proclamation.getPTime()}</h5>
	      	<pre style="word-wrap:break-word; word-break:normal; white-space: pre-wrap;">${proclamation.getPText()}</pre>
	      </div>
		</div>
	</div>
</body>
</html>