<%@page import="com.TMMS.Main.bean.Orders"%>
<%@page import="com.TMMS.Main.bean.Ordercycle"%>
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
            <h1 class="panel-title">申请结果</h1>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>用户</th>
                    <th>订单时间</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Orders> list = (List<Orders>)request.getAttribute("UserOrderList");
                for(int i=0;i<list.size();i++){
                    Orders order = (Orders)list.get(i);
                    %>
                    <tr class="">
                        <th scope="row"><%=i+1%></th>
                        <td><%=order.getUsers().getUName()%></td>
                        <td><%=order.getOTime()%></td>
                        <td>
                        <%
                        if(order.getOState()==0){
                        %>
                        <span class="label label-default">未审核</span>
                        <%
                        }
                        %>
                        <%
                        if(order.getOState()==1){
                        %>
                        <span class="label label-warning">未通过</span>
                        <%
                        }
                        %>
                        <%
                        if(order.getOState()==2){
                        %>
                        <span class="label label-success">通过</span>
                        <%
                        }
                        %>
                        </td>
                        
                        <td>
                            <a href="${basePath}teacher_order_showDetail.action?orderId=<%=order.getOId()%>">查看</a>&nbsp;
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