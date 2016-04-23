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
    <title>修改用户密码</title>
</head>
<body>
<form style="margin:20px;" method="post" action="<%=basePath%>fixUserPassword.action">
		<div class="page-header">
		  <h1><small>Fix my user password</small></h1>
		</div>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">原始密码</span>
		  <input type="password" name="password_old" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">新建密码</span>
		  <input type="password" name="password_new1" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">再次输入</span>
		  <input type="password" name="password_new2" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
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