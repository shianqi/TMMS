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
		          <th>操作</th>
		        </tr>
		      </thead>
		      <tbody>
		      <% 
		      	List<Books> list = (List<Books>)request.getAttribute("myOrderList");
		      	List<BooksService.OrderBook> numberlist = (List<BooksService.OrderBook>)request.getAttribute("myOrderListNumber");
		      	if(list!=null){
		      		for(int i=0;i<list.size();i++){
						Books book = (Books)list.get(i);
						BooksService.OrderBook number = (BooksService.OrderBook)numberlist.get(i);
			   %>
				<tr class="">
		          <th scope="row"><%=i+1%></th>
		          <td><%=book.getBName()%></td>
		          <td><%=book.getBIsbn()%></td>
		          <td><%=number.number%></td>
		          <td><a href="${basePath}teacher_order_orderDelBook.action?bookId=<%=book.getBId()%>">删除</a></td>
		        </tr>
			  <%
					}
				}
		      %>
		      
		      </tbody>
		    </table>
	      </div>
		</div>
		<form action="<%=basePath%>teacher_order_submitOrder.action" method="post">
			<select class="form-control" name="orderId">
			<%
		      	List<Ordercycle> orderList = (List<Ordercycle>)request.getAttribute("OrderCycleList");
		      	if(orderList!=null){
                	for(int i=0;i<orderList.size();i++){
                   		Ordercycle ordercycle = (Ordercycle)orderList.get(i);
            %>
				<option value="<%=ordercycle.getOcId()%>"><%=ordercycle.getOcCh()%></option>
			<%
					}
				}
		      %>
		    </select>
		    <br>
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
	            <div class="btn-group" role="group">
	                <button type="submit" class="btn btn-default">确认提交</button>
	            </div>
	        </div>
        </form>
	</div>
	
</body>
</html>