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
		<div class="row">
		  <div class="col-lg-4">
		    <div class="input-group">
		      <span class="input-group-addon" id="basic-addon1">用户编号</span>
		      <input type="text" class="form-control" aria-label="...">
		    </div><!-- /input-group -->
		  </div><!-- /.col-lg-4 -->
		  <div class="col-lg-4">
		    <div class="input-group">
		      <span class="input-group-addon" id="basic-addon1">真实姓名</span>
		      <input type="text" class="form-control" aria-label="...">
		    </div><!-- /input-group -->
		  </div><!-- /.col-lg-4 -->
		  <div class="col-lg-4">
		    <div class="input-group">
		      <span class="input-group-addon" id="basic-addon1">关键词</span>
		      <input type="text" class="form-control" placeholder="任意关键词" aria-label="...">
		    </div><!-- /input-group -->
		  </div><!-- /.col-lg-4 -->
		</div><!-- /.row -->
		<br>
		<div class="btn-group btn-group-justified" role="group" aria-label="...">
		  <div class="btn-group" role="group">
		  	<button type="submit" class="btn btn-default">查找</button>
		  </div>
		</div>
		<br>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">登陆记录</h3>
	      </div>
		</div>
		<div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>编号</th>
		          <th>登陆IP</th>
		          <th>地点</th>
		          <th>地点</th>
		          <th>时间</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	
			   %>
				<tr class="">
		          <th scope="row"><%%></th>
		          <td><%%></td>
		          <td><%%></td>
		          <td><%%></td>
		        </tr>
			  <%
				
		      %>
		      </tbody>
		    </table>
	      </div>
	</div>
</body>
</html>