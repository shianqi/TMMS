<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	int userAll = Integer.parseInt(String.valueOf(request.getAttribute("UserAll")));
	int userLogin = Integer.parseInt(String.valueOf(request.getAttribute("UserLogin")));
	int userToday = Integer.parseInt(String.valueOf(request.getAttribute("UserToday")));
 %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title>system—用户信息统计</title>
</head>
<body>
	<div style="margin:20px">
		<div class="row">
		  <div class="col-sm-4">
		    <div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">总用户人数</h3>
	      </div>
	      <div class="panel-body">
			<h1 style="font-size:50px; margin:0; text-align:center;"><span class="glyphicon glyphicon-user" style="font-size:25px; opacity:0.70;" aria-hidden="true"></span><%=userAll%></h1>
		  </div>
	    </div>
		  </div><!-- /.col-lg-4 -->
		  <div class="col-sm-4"> 
		    <div class="panel panel-default">
		      <div class="panel-heading">
		        <h3 class="panel-title">今日登陆人次</h3>
		      </div>
		      <div class="panel-body">
		      	<h1 style="font-size:50px; margin:0; text-align:center;"><span class="glyphicon glyphicon-user" style="font-size:25px; opacity:0.70;" aria-hidden="true"></span><%=userLogin%></h1>
			  </div>
		    </div>
		  </div><!-- /.col-lg-4 -->
		  <div class="col-sm-4">
		    <div class="panel panel-default">
		      <div class="panel-heading">
		        <h3 class="panel-title">今日登陆用户</h3>
		      </div>
		      <div class="panel-body">
		      	<h1 style="font-size:50px; margin:0; text-align:center;"><span class="glyphicon glyphicon-user" style="font-size:25px; opacity:0.70;" aria-hidden="true"></span><%=userToday%></h1>
			  </div>
		    </div>
		  </div><!-- /.col-lg-4 -->
		</div><!-- /.row -->
	</div>
</body>
</html>
