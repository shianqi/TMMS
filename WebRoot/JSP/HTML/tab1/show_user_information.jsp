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
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">用户名</h3>
	      </div>
	      <div class="panel-body">
	        	${users.getUName()}(${users.getUId()})
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">身份</h3>
	      </div>
	      <div class="panel-body">
	      		<%
	            	if(request.getSession().getValue("U_P_T").equals("true")){
	            %>
	        	<span class="label label-default">普通教师</span>
	        	<%
	            	}if(request.getSession().getValue("U_P_C").equals("true")){
	            %>
				<span class="label label-primary">学院管理员</span>
				<%
	            	}if(request.getSession().getValue("U_P_B").equals("true")){
	            %>
				<span class="label label-success">图书管理员</span>
				<%
	            	}if(request.getSession().getValue("U_P_F").equals("true")){
	            %>
				<span class="label label-info">系统报表员</span>
				<%
	            	}if(request.getSession().getValue("U_P_S").equals("true")){
	            %>
				<span class="label label-warning">系统管理员</span>
				<%
	            	}
	            %>
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">电话号</h3>
	      </div>
	      <div class="panel-body">
	        	${users.getUPhone()}
	      </div>
		</div>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">邮箱</h3>
	      </div>
	      <div class="panel-body">
	        	${users.getUEmail()}
	      </div>
		</div>
	</div>
</body>
</html>
