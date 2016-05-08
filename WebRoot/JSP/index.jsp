<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="JSP/css/public.css" type="text/css" rel="stylesheet">
        <link href="JSP/css/houtai.css" type="text/css" rel="stylesheet">
        <link href="JSP/css/smartMenu.css" type="text/css" rel="stylesheet">
        <title>内蒙古大学教材管理系统</title>
    </head>
    <body>
    	<div id="admin">
    		<div class="ad-menu" id="ad-menu">
                <div class="ad-logo"><img src="JSP/image/m-logo.png" height="103" width="130"></div>
                <div class="ad-list">
                    <ul>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic1"></em>个人管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">个人信息<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>showUserInformation.action" data-index="1">查看基本信息</li>
                                        <li class="J_menuItem" href="<%=basePath%>fixUserInformation.action" data-index="1">修改基本信息</li>
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab1/fix_user_password.jsp" data-index="2">修改密码</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">账号安全<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>showUserLoginLog.action" data-index="1">近期登陆记录</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                    		if(request.getSession().getValue("U_P_T").equals("true")){
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic2"></em>教师功能<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">征订管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab2/teacher_submit_order.html" data-index="1">新建征订信息</li>
                                        <li class="J_menuItem" href="html/tab2/teacher_show_order.html" data-index="1">查看征订状态</li>
                                        <li class="J_menuItem" href="html/tab2/teacher_fix_order.html" data-index="2">修改征订信息</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">图书管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab2/teacher_book_addBook.jsp" data-index="1">申请添加教材</li>
                                        <li class="J_menuItem" href="<%=basePath%>teacherBookShowCheckState.action" data-index="1">查看教材申请状态</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                        	}if(request.getSession().getValue("U_P_C")=="true"){
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic3"></em>学院负责人<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">教材管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab3/college_book_addBook.jsp" data-index="1">申请添加教材</li>
                                        <li class="J_menuItem" href="<%=basePath%>collegeBookShowCheckState.action" data-index="1">查看教材申请状态</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">征订审核<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab3/college_order_verify.html" data-index="1">教师订单审核</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">征订信息查看<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab3/college_order_information.html" data-index="1">本学院征订信息</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                        	}if(request.getSession().getValue("U_P_B")=="true"){
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>教材管理员<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">征订周期管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab4/book_new_orderTime.html" data-index="1">发布新征订周期</li>
                                        <li class="J_menuItem" href="html/tab4/book_fix_orderTime.html" data-index="1">修改征订周期</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">教材管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab4/bookManager_book_addBook.jsp" data-index="1">添加教材</li>
                                        <li class="J_menuItem" href="html/tab4/book_fix_book_information.html" data-index="1">修改教材信息</li>
                                        <li class="J_menuItem" href="html/tab4/book_find_book.html" data-index="1">查找教材</li>
                                        <li class="J_menuItem" href="html/tab4/book_delete_book.html" data-index="1">删除教材</li>
                                        <li class="J_menuItem" href="<%=basePath%>bookManagerCheckNewBooks.action" data-index="1">审批新添加教材</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">征订管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab4/book_show_orderInformation.html" data-index="1">查看征订信息</li>
                                        <li class="J_menuItem" href="html/tab4/book_order_information.html" data-index="1">征订信息统计</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                        	}if(request.getSession().getValue("U_P_F")=="true"){
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic5"></em>财政报表员<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">财政报表信息<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab5/financial_bill.html" data-index="1">查看财政报表</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                        	}if(request.getSession().getValue("U_P_S")=="true"){
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic6"></em>系统管理员<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">公告管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab6/System_proclamation_add.jsp" data-index="1">发布公告</li>
                                        <li class="J_menuItem" href="<%=basePath%>System_proclamation_management.action" data-index="1">管理公告</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">用户管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab6/system_show_user.html" data-index="1">用户统计</li>
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab6/System_user_addUser.jsp" data-index="1">添加用户</li>      
                                        <li class="J_menuItem" href="<%=basePath%>System_User_SearchUser.action?userInformation=" data-index="1">查找/修改用户信息</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">征订管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab6/system_find_order.html" data-index="1">查询订单</li>
                                        <li class="J_menuItem" href="html/tab6/system_gather_order.html:8" data-index="1">汇总订单</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <% 
                        	}
                    	%>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic7"></em>关于<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">使用帮助<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="html/tab7/system_help.html" data-index="1">使用帮助</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">关于本系统<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="<%=basePath%>JSP/HTML/tab7/AboutSystem.jsp" data-index="1">关于本系统</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                    </ul>
                </div>
            </div>
    		<div class="ad-comment-box" id="ad-comment">
                <div class="ad-top-comment">
                    <div class="ad-message">
                        <div class="ad-top-left">
                            <div class="ad-change-btn"><a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a></div>
                        </div>
                        <div class="ad-top-right">
                        	<!-- 
                            <div class="ad-notice">
                                <ul>
                                    <li>
                                        <a href="javascript:;" class="scm nt1"><span class="scm nt-count dot">2</span></a>
                                    </li>
                                    <li>
                                        <a href="javascript:;" class="scm nt2"><span class="scm nt-count dot">12</span></a>
                                    </li>
                                    <li>
                                        <a href="javascript:;" class="scm nt3"><span class="scm nt-count dot">12</span></a>
                                    </li>
                                </ul>
                            </div>
                             -->
                            <div class="ad-welcom">
                                <div class="ad-wel-img"><img src="JSP/image/min_logo.png" height="36" width="36"></div>
                                <div class="ad-wel-text">
                                    <div class="font-wel">欢迎您！<strong>${U_Name}</strong></div>
                                    <div class="font-wel"><a href="${basePath}logout.action"><strong>【退出】</strong></a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="ad-main-nav-box">
                        <ul id="breadcrumbs-three">
                            <li title="首页"><a href="javascript:;" class="dot">首页</a></li>
                        </ul>
                        <a href="javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
                        <div class="ad-main-wraper .J_menuItems">
                            <ul class="ad-main-list" id="ad-main">
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a J_mainRight next"></a>
                    </div>
                    <div class="ad-sub-nav-box content-tabs">
                        <!-- <div class="ad-sub-record">历史记录</div> -->
                        <a href="javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
                        <div class="ad-sub-wraper page-tabs J_menuTabs">
                            <ul class="ad-sub-list page-tabs-content">
                                <li class="active J_menuTab" data-id="index_v0.html">首页</li>
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
                    </div>
                </div>
                <div class="ad-main-comment J_mainContent" id="ad-iframe">
                    <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="${basePath}showHomeInformation.action" frameborder="0" data-id="index_v0.html" seamless></iframe>
                </div>
    		</div>
    	</div>
        <script type="text/javascript" src="JSP/js/jquery.min.js"></script>
        <script type="text/javascript" src="JSP/js/contabs.js"></script>
        <script type="text/javascript" src="JSP/js/maintabs.js"></script>
        <script type="text/javascript" src="JSP/js/jquery-smartMenu-min.js"></script>
        <script type="text/javascript" src="JSP/js/jquery.nicescroll.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $(".ad-menu").niceScroll({cursorborder:"0 none",cursorcolor:"#1a1a19",cursoropacitymin:"0",boxzoom:false});
            })
        </script>
    </body>
</html>
