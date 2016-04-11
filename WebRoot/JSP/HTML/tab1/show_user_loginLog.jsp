<%@ page language="java" import="java.util.*" import="com.TMMS.Main.bean.Ul" pageEncoding="utf8"%>
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
	        <h3 class="panel-title">登陆记录</h3>
	      </div>
	      <div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>登陆IP</th>
		          <th>地点</th>
		          <th>时间</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Ul> list = (List<Ul>)request.getAttribute("list");
		      	
		      	for(int i=0;i<(10<list.size()?10:list.size());i++){
					Ul ul = (Ul)list.get(i);
			   %>
				<tr class="">
		          <th scope="row"><%=i+1%></th>
		          <td><%=ul.getUlIp()%></td>
		          <td><%=ul.getUlLocation()%></td>
		          <td><%=ul.getUlTime()%></td>
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