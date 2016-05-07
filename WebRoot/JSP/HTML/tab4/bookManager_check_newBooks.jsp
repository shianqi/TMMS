<%@page import="com.TMMS.Main.bean.Books"%>
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
                    <th>出版社</th>
                    <th>ISBN</th>
                    <th>版次</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Books> list = (List<Books>)request.getAttribute("bookManagerSeeNewBooksList");
                    for(int i=0;i<list.size();i++){
                    Books book = (Books)list.get(i);
                    %>
                    <tr class="">
                        <th scope="row"><%=i+1%></th>
                        <td><%=book.getBName()%></td>
                        <td><%=book.getBPress()%></td>
                        <td><%=book.getBIsbn()%></td>
                        <td><%=book.getBOrder()%></td>
                        <td>
                            <a href="${basePath}bookManager_see_newBookDetail.action?bookId=<%=book.getBId()%>">查看</a>&nbsp;
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