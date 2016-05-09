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
                    <th>标题</th>
                    <th>开始时间</th>
                    <th>截止时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Ordercycle> list = (List<Ordercycle>)request.getAttribute("OrderCycleList");
                for(int i=0;i<list.size();i++){
                    Ordercycle ordercycle = (Ordercycle)list.get(i);
                    %>
                    <tr class="">
                        <th scope="row"><%=i+1%></th>
                        <td><%=ordercycle.getOcCh()%></td>
                        <td><%=ordercycle.getOcSt()%></td>
                        <td><%=ordercycle.getOcEt()%></td>
                        
                        <td>
                            <script>
                                function del(value){
                                    var like = window.confirm("警告！此操作无法恢复。确定删除吗？");
                                    if(like){
                                        window.location.href="<%=basePath%>bookManagerDelOrderCycle.action?orderCycleId="+value;
                                    }
                                }
                            </script>
                            <a href="javascript:del(<%=ordercycle.getOcId()%>)">删除</a>
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