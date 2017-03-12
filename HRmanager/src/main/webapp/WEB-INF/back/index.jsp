<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源后台管理系统</title>
<link rel="stylesheet" type="text/css" href="easyui/jquery-easyui-themes-metro/metro-orange/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/css/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/css/demo.css">
<script type="text/javascript" src="easyui/js/jquery.min.js"></script>
<script type="text/javascript" src="easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/js/index.js"></script>
<script type="text/javascript" src="easyui/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="easyui/js/datagrid-detailview.js"></script>

<!--  <script type="text/javascript" src="../js/ajaxfileupload.js"></script> -->
<script type="text/javascript" src="js/showpic.js"></script>

</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #1AB2E8; padding: 10px">
		<h1>欢迎使用人力资源后台管理系统</h1>
	</div>
	<div data-options="region:'west',split:true,title:'信息管理' "style="width: 200px;">
	
		<div class="easyui-accordion" data-options="fit:true,border:false,selected:false" style="">
			<div title="系统管理" style="overflow: auto; padding: 10px;">
				<ul id="systemManager" class="easyui-tree">
					<li id=""><span>人力资源档案管理设置</span></li>
					<li><span>薪酬管理设置</span></li>
					<li><span>题库管理设置</span></li>
					<li><span>其他设置</span></li>
				</ul>
			</div>
			<div title="人力资源档案管理" style="overflow: auto; padding: 10px;">
				<ul id="humanResourceFileManage" class="easyui-tree">
					<li id="humanResourceFileLoad"><span>人力资源档案登记</span></li>
					<li id="humanResourceFileCheck"><span>人力资源档案登记复核</span></li>
					<li><span>人力资源档案查询</span></li>
					<li><span>人力资源档案变更</span></li>
					<li><span>人力资源档案删除</span></li>
				</ul>
			</div>
			<div title="薪酬管理" style="overflow: auto; padding: 10px;">
				<ul id="salaryManage" class="easyui-tree">
					<li><span>薪酬标准管理</span></li>
					<li><span>薪酬发放管理</span></li>
				</ul>
			</div>
			<div title="moveManage" style="overflow: auto; padding: 10px;">
				<ul id="humanResource" class="easyui-tree">
					<li><span>修改机构和职位</span></li>
				</ul>
			</div>
			<div title="培训管理" style="overflow: auto; padding: 10px;">
				<ul id="trainManage" class="easyui-tree"></ul>
			</div>
			<div title="激励管理" style="overflow: auto; padding: 10px;">
				<ul id="encourageManage" class="easyui-tree"></ul>
			</div>
			<div title="招聘管理" style="overflow: auto; padding: 10px;">
				<ul id="recruitManage" class="easyui-tree">
					<li id="position"><span>职位发布管理</span></li>
					<li><span>简历管理</span></li>
					<li><span>面试管理</span></li>
					
					<li id="undo"><span>招聘考试题库管理</span>
						<ul id="engage" class="easyui-tree">
							<li id="SubjectsManager"><span>试题管理</span></li>
						</ul>
					</li>
					<li id="undo"><span>招聘考试管理</span>
						<ul id="engage_exam" class="easyui-tree">
							<li id="EngageExamManager"><span>试卷管理</span></li>
						</ul>
					</li>
					
					<li><span>录用管理</span></li>
				</ul>
			</div>
			<div title="标准化数据报表" style="overflow: auto; padding: 10px;"></div>
		</div>
	</div>




	<div
		data-options="region:'east',split:true,collapsed:true,title:'隐藏分区'"
		style="width: 100px; padding: 10px;">敬请期待</div>

	<div data-options="region:'south',border:false"
		style="height: 50px; background: #1AB2E8; padding: 10px; display:table-cell;text-align:center;vertical-align:middle;">
		<p>
			版权所有 &copy; CopyRight 2016
			<a href="http://www.hyycinfo.com/" target="_blank" title="源辰科技">源辰信息科技有限公司</a>&nbsp;地址：衡阳市解放西路丽天名园905室
		</p>	
	</div>

	<div
		data-options="region:'center',title:'人力资源后台管理系统' ,tools:[{
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

		<div id="index_content_info" class="easyui-tabs"
			data-options="fit:true"></div>
	</div>
</body>
</html>