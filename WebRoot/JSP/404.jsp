<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '404.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="custard"><h1>404 Not found</h1></div>
  </body>
  <style type="text/css">
	.custard {
	margin-top: 120px;
	width: 100%;
	text-align: center;
}

.custard::after {
  content: "\1F36E";
	/* CSS Pseudo-elements escape some characters that's why the unicode 'U+1F36E' is converted to '\1F36E' */
  font-size: 100px;
	/*As @LukyVj added in the comment section, Chrome limits the emoji size in 256px, Safari and Firefox doesn't restrcit sizes*/
	display: block;
}

/* For contrast */
body {
	background-color: #ffffff;
	color: brown;
}
  </style>
</html>
