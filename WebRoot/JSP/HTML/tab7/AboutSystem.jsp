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
		  <h1><small>About System</small></h1>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">Developer</h3>
	      </div>
	      <div class="panel-body">
	        	Inner Mongolia University of Computer Science, Software Engineering Class 2:<br>
	        	Anqi Shi & Shuang Zhang & Zhuo Zhang & Yu Liang.
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">Instructor</h3>
	      </div>
	      <div class="panel-body">
	        	Inner Mongolia University of Computer Science, teacher:<br>
	        	Rong Yan & Yuli Liu.
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">Contact information</h3>
	      </div>
	      <div class="panel-body">
	        	Email-Address:<address>shianqi@imudges.com</address>
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">System version</h3>
	      </div>
	      <div class="panel-body">
	        	v1.0.0
	      </div>
		</div>
	</div>
</body>
</html>
