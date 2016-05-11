<%@page import="com.TMMS.Main.bean.Books"%>
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
		<form method="post" action="<%=basePath%>teacher_order_searchBook.action">
			<div class="row">
			  <div class="col-lg-12">
			    <div class="input-group">
			      <input name="bookInformation" type="text" class="form-control" placeholder="Search for...">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查&nbsp;询&nbsp;&nbsp;&nbsp;&nbsp;</button>
			      </span>
			    </div><!-- /input-group -->
			  </div><!-- /.col-lg-12 -->
			</div><!-- /.row -->
		</form>
		<br>
		<div class="panel-body">
	      	<table class="table table-striped">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>教材名</th>
		          <th>ISBN</th>
		          <th>版次信息</th>
		          <th>教材定价</th>
		          <th>数量</th>
		          <th>操作</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Books> list = (List<Books>)request.getAttribute("keywordBooksList");
		      	if(list!=null){
		      		for(int i=0;i<(10<list.size()?10:list.size());i++){
						Books book = (Books)list.get(i);
			   %>
				<tr class="">
					<form method="post" action="<%=basePath%>teacher_order_addBook.action">
			          <th scope="row"><%=i+1%></th>
			          <td><%=book.getBName()%></td>
			          <td><%=book.getBIsbn()%></td>
			          <td><%=book.getBPress()%></td>
			          <td><%=book.getBPrice()%></td>
		          
			          <td id="bookNumber"><input type="text" name="number" value="" required="required"></td>
			          <td>
	                    <input style="display:none" type="text" value="<%=book.getBId()%>" name="bookId">
	                    <input type="submit" value="添加">
			          </td>
		           </form>
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