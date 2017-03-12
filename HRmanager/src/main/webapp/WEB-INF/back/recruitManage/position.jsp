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
<base href="<%= basePath  %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div style="margin:20px 0;"></div>
<div class="easyui-panel" title="请填写一下内容" style="width:1100px">
	<div style="padding:10px 40px 20px 40px">
    <form id="ff" method="post"  action="addPosition" >
    	<table cellpadding="5">
    		<tr>
    			<td>I级机构:</td>
    			<td><select class="easyui-combobox" name="first_kind_id" >
						<c:if test="${Ilist.size()>0 }">
								<c:forEach items="${Ilist }" var="config_file_first_kind">
									<option value= ${config_file_first_kind.first_kind_id }>${config_file_first_kind.first_kind_name}</option>
								</c:forEach>
						</c:if>
					</select>
				</td>
				
				<td>II级机构:</td>
    			<td><select class="easyui-combobox" name="second_kind_id" >
						<c:if test="${IIlist.size()>0 }">
								<c:forEach items="${IIlist }" var="config_file_second_kind">
									<option value= ${config_file_second_kind.second_kind_id }>${config_file_second_kind.second_kind_name}</option>
								</c:forEach>
						</c:if>
					</select>
				</td>
				<td>III级机构:</td>
    			<td><select class="easyui-combobox" name="third_kind_id" >
						<c:if test="${IIlist.size()>0 }">
								<c:forEach items="${IIIlist }" var="config_file_third_kind">
									<option value= ${config_file_third_kind.third_kind_id }>${config_file_third_kind.third_kind_name}</option>
								</c:forEach>
						</c:if>
					</select>
				</td>
				
				<td>招聘类型:</td>
    			<td><select class="easyui-combobox" name="engage_type" >
    					<option value="校园招聘" selected="selected">校园招聘</option>
    					<option value="社会招聘">社会招聘</option>
					</select>
				</td>
    		
    		</tr>
    		<tr>
	    		<td>职位分类:</td>
    			<td><select class="easyui-combobox" name="major_kind_id" >
						<c:if test="${z1list.size()>0 }">
								<c:forEach items="${z1list }" var="config_major_kind">
									<option value= ${config_major_kind.major_kind_id }>${config_major_kind.major_kind_name}</option>
								</c:forEach>
						</c:if>
					</select>
				</td>
				<td>职位名称:</td>
    			<td><select class="easyui-combobox" name="major_id" >
						<c:if test="${list.size()>0 }">
								<c:forEach items="${list }" var="config_major">
									<option value= ${config_major.major_id }>${config_major.major_name}</option>
								</c:forEach>
						</c:if>
					</select>
				</td>
    			<td>招聘人数:</td>
    			<td><input class="easyui-textbox" type="text" name="human_amount" required="required" ></input></td>
    			<td>截止日期:</td>
    			<td><input id="deadline" type="text" class="easyui-datebox" required="required"></input></td>
    		</tr>
    		<tr>
    			<td>登记人:</td>
				<td><input class="easyui-textbox" type="text" name="register" required="required" ></input></td>
    			<td>登记时间:</td>
    			<td><input class="easyui-textbox" type="text" name="regist_time" required="required" ></input></td>
    		</tr>
    		<tr>
    			<td>职位描述:</td>
    			<td colspan="4"><textarea rows="3" cols="20" name="major_describe" style="resize:none; width:500; heitht:80"></textarea></td>
    		</tr>
    		<tr>
    			<td>招聘要求:</td>
    			<td colspan="4"><textarea rows="3" cols="20" name="engage_required" style="resize:none; width:500; heitht:80"></textarea></td>
    		</tr>
    	</table>
    </form>
   		<div style="text-align:center;padding:5px">
    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
		</div>
    </div>
</div>
	<script>
	function submitForm(){
		$('#ff').form('submit');
	}
	
	function clearForm(){
		$('#ff').form('clear');
	}
</script>
	
	
</body>
</html>