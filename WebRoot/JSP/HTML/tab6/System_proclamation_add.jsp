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
		<form method="post" action="http://183.175.12.155:8080/TMMS/SystemProclamationAdd.action">
			<div class="input-group">
		  		<span class="input-group-addon" id="basic-addon1">标题</span>
		  		<input id="title" type="text" name="uid" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
			</div>
			<br>
			<div class="input-group">
		  		<span class="input-group-addon" id="basic-addon1">正文</span>
		  		<textarea class="form-control" rows="10" placeholder="" aria-describedby="basic-addon1" required="required"></textarea>
			</div>
			<br>
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
			  <div class="btn-group" role="group">
			  	<button type="submit" class="btn btn-default">发布</button>
			  </div>
			</div>
		</form>
	</div>
</body>
</html>