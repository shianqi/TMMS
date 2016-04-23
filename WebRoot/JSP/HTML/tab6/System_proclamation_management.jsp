<%@ page import="com.TMMS.Main.bean.Proclamation"%>
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
	        <h3 class="panel-title">公告管理</h3>
	      </div>
	      <div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>公告标题</th>
		          <th>发布者</th>
		          <th>时间</th>
		          <th>操作</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Proclamation> list = (List<Proclamation>)request.getAttribute("proclamationList");
		      	for(int i=0;i<list.size();i++){
					Proclamation proclamation = (Proclamation)list.get(i);
			   %>
				<tr class="">
		          <th scope="row"><%=i+1%></th>
		          <td><%=proclamation.getPTitle()%></td>
		          <td><%=proclamation.getUsers().getUName()%></td>
		          <td><%=proclamation.getPTime()%></td>
		          <td>
		          	<a href="${basePath}System_proclamation_showDetail.action?proclamationId=<%=proclamation.getPId()%>">查看</a>&nbsp;
		          	<a href="${basePath}System_proclamation_fixDetail.action?proclamationId=<%=proclamation.getPId()%>">修改</a>&nbsp;
		          	<a href="${basePath}logout.action">删除</a>
		          </td>
		        </tr>
			  <%
				}
		      %>
		      </tbody>
		    </table>
	      </div>
		</div>
	</div>
</body>
</html>