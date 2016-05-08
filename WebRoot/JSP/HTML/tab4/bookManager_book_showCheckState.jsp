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
                    <th>教材名称</th>
                    <th>时间</th>
                    <th>审核状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Books> list = (List<Books>)request.getAttribute("teacherOwnBooks");
                    for(int i=0;i<list.size();i++){
                    Books book = (Books)list.get(i);
                    %>
                    <tr class="">
                        <th scope="row"><%=i+1%></th>
                        <td><%=book.getBName()%></td>
                        <td><%=book.getBPress()%></td>
                        <td>
                        <%
                        	if(book.getBState()==1){
                        %>
                        	<span class="label label-success">通过</span>
                        <%
                        	}else if(book.getBState()==2){
                         %>
                         	<span class="label label-warning">未通过</span>
                         <%
                         	}else if(book.getBState()==0){
                          %>
                          <span class="label label-default">未审核</span>
                          <%
                          	}
                           %>
                        </td>
                        
                        <td>
                            <a href="${basePath}teacher_book_showBookInformation.action?bookId=<%=book.getBId()%>">查看</a>&nbsp;
                            
                            <a href="${basePath}teacher_book_fixBookInformation.action?bookId=<%=book.getBId()%>">修改</a>&nbsp;
                            <script>
                                function del(value){
                                    var like = window.confirm("警告！此操作无法恢复。确定删除吗？");
                                    if(like){
                                        window.location.href="<%=basePath%>teacher_book_delBookInformation.action?bookId="+value;
                                    }
                                }
                            </script>
                            <a href="javascript:del(<%=book.getBId()%>)">删除</a>
                            
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