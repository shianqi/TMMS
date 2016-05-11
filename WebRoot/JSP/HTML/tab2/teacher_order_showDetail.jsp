<%@page import="com.TMMS.Main.bean.Bo"%>
<%@page import="com.TMMS.Main.bean.Ordercycle"%>
<%@page import="com.TMMS.Main.service.BooksService"%>
<%@page import="com.TMMS.Main.bean.Books"%>
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
	        <h3 class="panel-title">提交订单</h3>
	      </div>

	      <div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>教材名</th>
		          <th>ISBN</th>
		          <th>数量</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Bo> list = (List<Bo>)request.getAttribute("listDetail");
		      	if(list!=null){
		      		for(int i=0;i<list.size();i++){
						Bo bo = (Bo)list.get(i);
			   %>
				<tr class="">
		          <th scope="row"><%=i+1%></th>
		          <td><%=bo.getId().getBooks().getBName()%></td>
		          <td><%=bo.getId().getBooks().getBIsbn()%></td>
		          <td><%=bo.getBoNumber()%></td>
		        </tr>
			  <%
					}
				}
		      %>
		      
		      </tbody>
		    </table>
	      </div>
		</div>
	</div>
	
</body>
</html>