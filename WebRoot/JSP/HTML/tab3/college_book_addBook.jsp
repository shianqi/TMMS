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
    <form  action="<%=basePath%>collegeBookAddBook.action" method="post">
        <div class="page-header">
            <h1><small>Add a new Book</small></h1>
        </div>
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材名称</span>
            <input id="title" type="text" name="BName" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材作者</span>
            <input id="title" type="text" name="BAuthor" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材定价</span>
            <input id="title" type="text" name="BPrice" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">&nbsp;I S B N&nbsp;&nbsp;</span>
            <input id="title" type="text" name="BIsbn" class="form-control" placeholder="" aria-describedby="basic-addon1" >
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">版次信息</span>
            <input id="title" type="text" name="BOrder" class="form-control" placeholder="" aria-describedby="basic-addon1" >
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">&nbsp;出 版 社&nbsp;</span>
            <input id="title" type="text" name="BPress" class="form-control" placeholder="" aria-describedby="basic-addon1" >
        </div>
        <br>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">教材类别</h3>
            </div>
            <div class="panel-body">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="BPlan" value="true" aria-describedby="basic-addon1">
                        规划教材  &nbsp; &nbsp; &nbsp; &nbsp;
                    </label>
                    <label>
                        <input type="checkbox" name="BBorders" value="true" aria-describedby="basic-addon1">
                        境外原版教材   &nbsp; &nbsp; &nbsp; &nbsp;
                    </label>
                    <label>
                        <input type="checkbox" name="BGrand" value="true" aria-describedby="basic-addon1">
                        其他类型优秀教材
                    </label>

                </div>
            </div>
        </div>

        <div class="btn-group btn-group-justified" role="group" aria-label="...">
            <div class="btn-group" role="group">
                <button type="submit" class="btn btn-default">确认添加</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>