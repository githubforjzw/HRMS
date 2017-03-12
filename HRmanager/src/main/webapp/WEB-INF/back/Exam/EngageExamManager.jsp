<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷管理</title>
</head>
<body>
	<table id="engageExamAngDetails" title="试卷及其详情" class="easyui-datagrid"
		style="width:2000px; height: 1000px" url="selectExam"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="exam_number" width="50">试卷编号</th>
				<th field="config_major.config_major_kind.major_kind_id" width="50">职位分类编号</th>
				<th field="config_major.config_major_kind.major_kind_name" width="50">职位分类名称</th>
				<th field="config_major.major_id" width="50">职位编号</th>
				<th field="config_major.major_name" width="50">职位名称</th>
				<th field="register" width="50">职位编号</th>
				<th field="regist_time" width="50">登记时间</th>
				<th field="limite_time" width="50">答题限时</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newExam()">添加新的试卷</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editExam()">编辑修改</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyExam()">删除试卷</a>
    	<label>一级分类</label>
		<select id="byFirstKind_Search">
			<option value="-1">--所有--</option>
		</select>
		<label>二级分类</label>
		<select id="bySecond_Search">
			<option value="-1">--所有--</option>
		</select>
		<label>登记人:</label><input type="text" name="registerName" id="search_ByRegisterName"/>
		<a href="javascript:exams_search()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
    </div>
    <div id="dlg" class='easyui-dialog' style='width:400px' closed='true' buttons='#dlg-buttons'>
        <form id="myForm" method="post" novalidate style="margin:0;padding:20px 50px">
            <div style="margin-bottom:20px;font-size:14px;border-bottom:1px solid #ccc">试卷信息</div>
            <div style="margin-bottom:10px">
                <input name="exam_number"  class="easyui-textbox" required="true" label="试卷编号:" style="width:100%" />
            </div>
            <div style="margin-bottom:10px">
                <input name="major_kind_id" class="easyui-textbox" required="true" label="职位分类编号:" style="width:100%" />
            </div>
            <div style="margin-bottom:10px">
                <input name="major_kind_name" class="easyui-textbox" required="true" label="职位分类名称:" style="width:100%"/>
            </div>
            <div style="margin-bottom:10px">
                <input name="major_id" class="easyui-textbox" required="true" label="职位编号:" style="width:100%"/>
            </div>
            <div style="margin-bottom:10px">
                <input name="major_name" class="easyui-textbox" required="true" label="职位名称" style="width:100%"/>
            </div>
            <div style="margin-bottom:10px">
                <input  name="register" class="easyui-textbox" required="true" validType="email" label="登记人:" style="width:100%"/>
            </div>
            <div style="margin-bottom:10px">
                <input  name="regist_time" class="easyui-textbox" required="true" label="登记时间:" style="width:100%"/>
            </div>
            <div style="margin-bottom:10px">
                <input  name="limite_time" class="easyui-textbox" required="true" label="答题限时:" style="width:100%"/>
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveExam()" style="width:90px">Save</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
    </div>
<script type="text/javascript">
$(function(){
	
})
var url;
function exam_search(){
	
}
function newExam(){
    $('#dlg').dialog('open').dialog('center').dialog('setTitle','添加新的试卷');
    $('#myForm').form('clear');
    url = '';
}
function editExam(){
    var row = $('#dg').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑试卷');
        $('#fm').form('load',row);
        url = 'update_user.php?id='+row.id;
    }
}
function saveExam(){
    $('#myForm').form('submit',{
        url: url,
        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            var result = eval('('+result+')');
            if (result.errorMsg){
                $.messager.show({
                    title: 'Error',
                    msg: result.errorMsg
                });
            } else {
                $('#dlg').dialog('close');        // close the dialog
                $('#dg').datagrid('reload');    // reload the user data
            }
        }
    });
}
function destroyExam(){
    var row = $('#dg').datagrid('getSelected');
    if (row){
        $.messager.confirm('Confirm','确定要删除这份试卷?',function(r){
            if (r){
                $.post('destroy_user.php',{id:row.id},function(result){
                    if (result.success){
                        $('#dg').datagrid('reload');    // reload the user data
                    } else {
                        $.messager.show({    // show error message
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    }
                },'json');
            }
        });
    }
}
</script>
</body>


</html>