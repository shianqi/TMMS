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
	<form style="margin:20px;" method="post" action="fixUserInformationDown.action">
		<div class="page-header">
		  <h1><small>Fix my user information</small></h1>
		</div>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">用户姓名</span>
		  <input type="text" name="name" class="form-control" placeholder="${users.getUName()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">手机号码</span>
		  <input type="tel" name="phone" class="form-control" placeholder="${users.getUPhone()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">电子邮箱</span>
		  <input type="email" name="email" class="form-control" placeholder="${users.getUEmail()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="btn-group btn-group-justified" role="group" aria-label="...">
		  <div class="btn-group" role="group">
		  	<button type="submit" class="btn btn-default">确认修改</button>
		  </div>
		</div>
	</form>
</body>
</html>
