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
	<div style="margin:20px;">
		<form method="post" action="<%=basePath%>System_User_SearchUser.action">
			<div class="row">
			  <div class="col-lg-12">
			    <div class="input-group">
			      <input name="userInformation" type="text" class="form-control" placeholder="Search for...">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查&nbsp;询&nbsp;&nbsp;&nbsp;&nbsp;</button>
			      </span>
			    </div><!-- /input-group -->
			  </div><!-- /.col-lg-12 -->
			</div><!-- /.row -->
		</form>
		<br>
		<div class="panel panel-default">
	      <div class="panel-heading">
	        <h3 class="panel-title">用户</h3>
	      </div>
		</div>
		<div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>账号</th>
		          <th>姓名</th>
		          <th>电子邮箱</th>
		          <th>手机号</th>
		          <th>身份</th>
		          <th>操作</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Users> list = (List<Users>)request.getAttribute("keywordList");
		      	if(list!=null){
		      		for(int i=0;i<(10<list.size()?10:list.size());i++){
						Users user = (Users)list.get(i);
		      	
		      	
			   %>
				<tr class="">
		          <th scope="row"><%=i+1%></th>
		          <td><%=user.getUId()%></td>
		          <td><%=user.getUName()%></td>
		          <td><%=user.getUEmail()%></td>
		          <td><%=user.getUPhone()%></td>
		          <td>
		          <%
		           	if(user.getUPT()){
		          %>
		          <span class="label label-default">教师</span>
		          <% 		
		           	}
		           	if(user.getUPC()){
		          %>
		          <span class="label label-primary">学院</span>
		          <% 
		          	}
		          	if(user.getUPB()){
		          %>
		          <span class="label label-success">图书</span>
		          <% 
		          	}
		          	if(user.getUPF()){
		          %>
		          <span class="label label-info">财政</span>
		          <% 
		          	}
		          	if(user.getUPS()){
		          %>
		          <span class="label label-warning">系统</span>
		          <% 
		          	}
		          %>
		          </td>
		          <td>
		          	<a href="${basePath}System_User_fixUserInformaion.action?UId=<%=user.getUId()%>">修改</a>
		          	<script>
						function del(value){
							var like = window.confirm("警告！此操作会删除该账号的所有记录，并且不可恢复。确定删除吗？");
							if(like){
								window.location.href="<%=basePath%>System_User_delUser.action?userId="+value;
							}
						}
					</script>
		          	<a href="javascript:del(<%=user.getUId()%>)">删除</a>
		          </td>
		        </tr>
			  <%
					}
				}
		      %>
		      </tbody>
		    </table>
	      </div>
	</div>
</body>
</html>