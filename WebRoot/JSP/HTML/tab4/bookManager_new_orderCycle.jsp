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
    <link href="../../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
    <title>新建征订周期</title>
</head>
<body>
<div style="margin:20px;">
    <form  action="<%=basePath%>bookManagerNewOrderCycle.action" method="post">
        <div class="page-header">
            <h1><small>Add a new order cycle</small></h1>
        </div>

		<div class="input-group">
            <span class="input-group-addon" id="basic-addon1">标题</span>
            <input id="title" type="text" name="title" class="form-control" placeholder="" aria-describedby="basic-addon1" required="required">
        </div>
        <br><br>
        
			<div class="form-group">
                <label for="dtp_input1" class="col-md-2 control-label">开始时间</label>
                <div class="input-group date form_datetime1 col-md-5" data-date="2016-01-01T05:25:07Z" data-date-format="yyyy年 mm月 dd日 - HH:ii p" data-link-field="dtp_input1">
                    <input class="form-control" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
				<input name="timeStart" type="hidden" id="dtp_input1" value="" required="required"/><br/>
            </div>
            
            <div class="form-group">
                <label for="dtp_input2" class="col-md-2 control-label">开始时间</label>
                <div class="input-group date form_datetime2 col-md-5" data-date="2016-01-01T05:25:07Z" data-date-format="yyyy年 mm月 dd日 - HH:ii p" data-link-field="dtp_input2">
                    <input class="form-control" size="16" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
				<input name="timeEnd" type="hidden" id="dtp_input2" value="" required="required"/><br/>
            </div>

        
        

        <div class="btn-group btn-group-justified" role="group" aria-label="...">
            <div class="btn-group" role="group">
                <button type="submit" class="btn btn-default">确认添加</button>
            </div>
        </div>
    </form>
</div>

</body>
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
	<script type="text/javascript" src="../../js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<script type="text/javascript">
	    $('.form_datetime1').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			forceParse: 0,
	        showMeridian: 1
	    });
	    
	    $('.form_datetime2').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			forceParse: 0,
	        showMeridian: 1
	    });
	</script>
</html>