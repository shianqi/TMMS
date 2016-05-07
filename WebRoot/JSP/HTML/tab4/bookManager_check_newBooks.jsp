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
    <title>修改用户密码</title>
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
                    <th>教材名称</th>
                    <th>时间</th>
                    <th>审核状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                //List<Proclamation> list = (List<Proclamation>)request.getAttribute("proclamationList");
                    //for(int i=0;i<list.size();i++){
                    //Proclamation proclamation = (Proclamation)list.get(i);
                    %>
                    <tr class="">
                        <th scope="row"><%=1%></th>
                        <td><%%></td>
                        <td><%%></td>
                        <td><%%></td>
                        <td>
                            <a href="${basePath}System_proclamation_showDetail.action?proclamationId=">查看</a>&nbsp;
                            <a href="${basePath}System_proclamation_fixDetail.action?proclamationId=">修改</a>&nbsp;
                            <script>
                                function del(value){
                                    var like = window.confirm("警告！此操作无法恢复。确定删除吗？");
                                    if(like){
                                        window.location.href="<%=basePath%>System_proclamation_Del.action?proclamationId="+value;
                                    }
                                }
                            </script>
                            <a href="javascript:del(<%%>)">删除</a>
                        </td>
                    </tr>
                    <%
                    //}
                    %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>