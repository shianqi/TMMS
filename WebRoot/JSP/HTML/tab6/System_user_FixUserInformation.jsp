<%@page import="com.TMMS.Main.bean.Users"%>
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
	<form style="margin:20px;" method="post" action="<%=basePath%>System_User_fixUserInformaionDown.action">
		<div class="page-header">
		  <h1><small>Fix User Information</small></h1>
		</div>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">用户编号</span>
		  <input type="tel" readOnly name="uid" class="form-control" value="${user.getUId()}" placeholder="" aria-describedby="basic-addon1" required="required">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">用户密码</span>
		  <input type="password" name="upw" class="form-control" placeholder="******" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">用户姓名</span>
		  <input type="text" name="uname" class="form-control" placeholder="${user.getUName()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">手机号码</span>
		  <input type="tel" name="uphone" class="form-control" placeholder="${user.getUPhone()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon1">电子邮箱</span>
		  <input type="email" name="uemail" class="form-control" placeholder="${user.getUEmail()}" aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">用户类别</h3>
	      </div>
	      <% Users user = (Users)request.getAttribute("System_user"); %>
	      <div class="panel-body">
	      	<div class="checkbox">
				<label>
					<input type="checkbox" name="upt" <% if(user.getUPT()){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
				    	教师 &nbsp; &nbsp;&nbsp;
				</label>
				<label>
					<input type="checkbox" name="upc" <% if(user.getUPC()){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
				    	学院管理员 &nbsp; &nbsp; &nbsp;
				</label>
				<label>
					<input type="checkbox" name="upb" <% if(user.getUPB()){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
				    	图书管理员 &nbsp; &nbsp; &nbsp;
				</label>
				<label>
					<input type="checkbox" name="upf" <% if(user.getUPF()){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
				    	财政报表员 &nbsp; &nbsp; &nbsp;
				</label>
				<label>
					<input type="checkbox" name="ups" <% if(user.getUPS()){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
				    	系统管理员 
				</label>
			</div>
		  </div>
	    </div>

		<div class="btn-group btn-group-justified" role="group" aria-label="...">
		  <div class="btn-group" role="group">
		  	<button type="submit" class="btn btn-default">确认修改</button>
		  </div>
		</div>
	</form>
</body>
</html>
