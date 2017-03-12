<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历表</title>
</head>
<body>
	<form:form commandName="Human_file_dig" action="back/addhumanResourceFile" enctype="multipart/form-data" method="post" >
		<table id="tt" title="简历清单" data-options="fit:true" class="easyui-datagrid" 
			pagination="true">
		<thead>
			<tr>
				<th field="itemid" width="80">Item ID</th>
				<th field="productid" width="80">Product ID</th>
				<th field="listprice" width="80" align="right">List Price</th>
				<th field="unitcost" width="80" align="right">Unit Cost</th>
				<th field="attr1" width="100">Attribute</th>
				<th field="status" width="60" align="center">Stauts</th>
			</tr>
		</thead>
		
	</table>
	</form:form>

</body>

<script type="text/javascript">
var pager = $('#tt').datagrid('getPager');    // get the pager of datagrid
pager.pagination({
	showPageList:false,
	buttons:[{
		iconCls:'icon-search',
		handler:function(){
			alert('search');
		}
	},{
		iconCls:'icon-add',
		handler:function(){
			alert('add');
		}
	},{
		iconCls:'icon-edit',
		handler:function(){
			alert('edit');
		}
	}],
	onBeforeRefresh:function(){
		alert('before refresh');
		return true;
	}
});
	







</script>

</html>