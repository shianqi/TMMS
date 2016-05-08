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
        <input style="display:none;" type="text" name="BId" class="form-control" placeholder="" value="${book.getBId()}" aria-describedby="basic-addon1" required="required">
        <input style="display:none;" type="text" name="state" class="form-control" placeholder="" value="1" aria-describedby="basic-addon1" required="required">
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材名称</span>
            <input id="title" readonly type="text" name="BName" class="form-control" placeholder="" value="${book.getBName()}" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材作者</span>
            <input id="title" readonly type="text" name="BAuthor" class="form-control" placeholder="" value="${book.getBAuthor()}" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">教材定价</span>
            <input id="title" readonly type="text" name="BPrice" class="form-control" placeholder="" value="${book.getBPrice()}" aria-describedby="basic-addon1" required="required">
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">&nbsp;I S B N&nbsp;&nbsp;</span>
            <input id="title" readonly type="text" name="BIsbn" class="form-control" placeholder="" value="${book.getBIsbn()}" aria-describedby="basic-addon1" >
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">版次信息</span>
            <input id="title" readonly type="text" name="BOrder" class="form-control" placeholder="" value="${book.getBOrder()}" aria-describedby="basic-addon1" >
        </div>
        <br>

        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">&nbsp;出 版 社&nbsp;</span>
            <input id="title" readonly type="text" name="BPress" class="form-control" placeholder="" value="${book.getBPress()}" aria-describedby="basic-addon1" >
        </div>
        <br>

		<%
			Books book = (Books)request.getAttribute("bookManagerSeeNewBookDetillBook");
		 %>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">教材类别</h3>
            </div>
            <div class="panel-body">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" disabled="true"  readonly name="BPlan" <% if(book.getBPlan().equals("true")){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
                        规划教材  &nbsp; &nbsp; &nbsp; &nbsp;
                    </label>
                    <label>
                        <input type="checkbox" disabled="true"  readonly name="BBorders" <% if(book.getBBorders().equals("true")){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
                        境外原版教材   &nbsp; &nbsp; &nbsp; &nbsp;
                    </label>
                    <label>
                        <input type="checkbox" disabled="true"  readonly name="BGrand" <% if(book.getBGrand().equals("true")){ %>checked<%} %> value="true" aria-describedby="basic-addon1">
                        其他类型优秀教材
                    </label>
                </div>
            </div>
        </div>
    <br>
</div>
</body>
</html>