<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%
	String path=request.getContextPath();
	String basePath= request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath  %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源后台管理系统</title>

<link rel="stylesheet" type="text/css" href="easyui/css/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/css/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/css/demo.css">
<script type="text/javascript" src="easyui/js/jquery.min.js"></script>
<script type="text/javascript" src="easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/js/index.js"></script>
<script type="text/javascript" src="easyui/js/easyui-lang-zh_CN.js"></script>

<!--  <script type="text/javascript" src="../js/ajaxfileupload.js"></script> -->
<script type="text/javascript" src="js/showpic.js"></script>

</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height: 60px; background: #B3DFDA; padding: 10px">
		<h1>欢迎使用人力资源后台管理系统</h1>

	</div>
	<div data-options="region:'west',split:true,title:'信息管理' " style="width: 200px; padding: 10px;">
		<ul id="foods_menu" class="easyui-tree">
			<li><span>商品信息管理</span>
				<ul>
					<li id="manager_foods">管理商品</li>
				</ul>
			</li>

			<li><span>客户信息管理</span>
				<ul>
					<li id="alluser_login">所有客户信息</li>
					<li id="rank_info">积分排行榜</li>
					<li id="login_info">登录信息</li>
				</ul>
			</li>

			<li><span>销售情况</span>
				<ul>
					<li id="sales_info">销售情况</li>
					<li id="list_info">排行榜</li>
				</ul>
			</li>
		</ul>
		
	</div>
	
	<div data-options="region:'east',split:true,collapsed:true,title:'隐藏分区'" style="width: 100px; padding: 10px;">敬请期待</div>
	
	<div data-options="region:'south',border:false" style="height: 50px; background: #A9FACD; padding: 10px;">版权</div>
	
	<div data-options="region:'center',title:'人力资源后台管理系统' ,tools:[{
		iconCls:'icon-unfull',
		handler:function(){
			unFull();
		}
	},{
		iconCls:'icon-full',
		handler:function(){
			full();
		}
	}] ">

		<div id="index_content_info" class="easyui-tabs" data-options="fit:true"></div>
	</div>
</body>
</html>