<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form commandName="Human_file_dig" action="back/addhumanResourceFile" enctype="multipart/form-data" method="post" >
		<table class="dv-table" style="width: 100%; background: #fafafa; padding: 25px; margin-top:20px;">
			<tr>
				<td>档案编号：</td>	<!-- 自动生成一个档案编号 -->
				<td><input name="human_id" required="flase" disabled></input></td>

				<td>邮政编码：</td>	
				<td><input name="engage_resume.human_postcode" required="flase"></input></td>
				
				<td rowspan='4' colspan='2'> 
					<!-- <div id="showpic" >
						<p>上传图片：</p>
						<input type="file" multiple="multiple" onchange="previewMultipleImage(this,'showpic')" />
					</div> -->
					<p name="engage_resume.human_picture" > </p>
				</td>	
			</tr>
			<tr>
				<td>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
				<td><input name="engage_resume.human_name" required="flase"></input></td>			<!-- required="flase" 是否应被输入值 -->
				<td>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>		<!-- class="easyui-validatebox" 用于校验 -->
				<td><!-- <select>
					<option>男</option><option>女</option>
					</select> -->
					<input name="engage_resume.human_sex" required="flase"></input>
				</td>
				
			</tr>
			
			<tr>
				<td>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</td>
				<td><input name="engage_resume.human_telephone" required="flase" ></input></td>
	
				<td>手机号码:</td>	<!-- 还没有做验证的处理 -->
				<td><input name="engage_resume.human_mobilephone" required="flase" ></input></td>
				
			</tr>
			
			<tr>
				<td>国&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;籍：</td>
				<td><input name="engage_resume.human_nationality" required="flase" ></input></td>
				<td>民&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;族：</td>
				<td><input name="engage_resume.human_race" required="flase" ></input></td>
			</tr>
		<!-- </table>
		
		<table class="dv-table" style="width: 100%; background: #fafafa; padding-left: 25px; margin-top:-27px;"> -->
			<tr>
				<td>政治面貌:</td>
				<td><!-- <select id="human_party">
					<option>群众</option><option>共青团员</option><option>中共预备党员</option><option>中共党员</option>
					<option>民盟盟员</option><option>民进会员</option><option>无党派人士</option>
					</select> -->
					<input name="engage_resume.human_party" required="flase" ></input>
				</td>
				<td>QQ号码：</td>
				<td><input name="engage_resume.human_qq" required="flase"></input></td>
				<td>电子邮件：</td>
				<td><input name="engage_resume.human_email" required="flase"></input></td>
			</tr>
			
			<tr>
				<td>出生日期:</td>
				<td><input name="engage_resume.human_birthday" required="flase" ></input></td>
				<td>出&nbsp;&nbsp;生&nbsp;&nbsp;地：</td>
				<td><input name="engage_resume.human_birthplace" required="flase"></input></td>
				<td>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</td>
				<td><input name="engage_resume.human_age" required="flase"></input></td>
			</tr>
			<tr>
				<td>身份证号：</td>		
				<td><input name="engage_resume.human_idcard" equired="flase"></input></td>
				<td>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：</td>
				<td><!-- <select id="engage_resume.human_educated_degree">
					<option>专科</option><option>本科</option><option>硕士研究生</option><option>博士研究生</option>
					</select> -->
					<input name="engage_resume.human_educated_degree" required="flase"></input>
				</td>		
				<td>学历专业：</td>		
				<td><input name="engage_resume.human_educated_major" required="flase"></input></td>	
			</tr>
			
			<tr>
				<td>教育年限：</td>		
				<td><input name="engage_resume.human_educated_years"></input></td>
				<td>职位编号：</td>
				<td><input name="engage_resume.human_major_id" required="flase" ></input></td>
				<td>职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称： </td>	<!-- 还没有做验证的处理 -->
				<td><input name="engage_resume.human_major_name" required="flase" ></input></td>
			</tr>
			
			<tr>
				<td>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：</td>
				<td><input name="engage_resume.human_address" required="flase" ></input></td>
				<td>开户银行：</td>
				<td><select id="human_bank">
					<option>工商银行</option><option>农业银行</option><option>中国人民银行</option><option>建设银行</option><option>交通银行</option>
				</select></td>
				<td>银行帐号：</td>
				<td><input name="human_account" required="flase" ></input></td>
			</tr>
			
			<tr>
				<td>爱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;好：</td>		
				<td><input name="engage_resume.human_hobby"></input></td>
				<td>特&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长：</td>
				<td><input name="engage_resume.human_speciality" required="flase" ></input></td>
				<td>宗教信仰：</td>
				<td><input name="engage_resume.human_religion" required="flase" ></input></td>
			</tr>
			
			<tr>
				<td>社会保障号：</td>		
				<td><input name="human_society_security_id"></input></td>
				<td>基本薪酬：</td>
				<td><input name="salary_sum" required="flase" ></input>/月</td>
				<td>家庭关系：</td>
				<td><select id="human_religion">
					<option>核心家庭</option><option>主干家庭</option><option>联合家庭</option><option>其他家庭</option>
				</select></td>
			</tr>
			
			<tr>
				<!-- <td>一级机构编号：</td>		
				<td><select id="config_file_third_kind.config_file_second_kind.config_file_first_kind.first_kind_id">
				</select></td> -->
				<td>一级机构名称：</td>
				<td><select id="config_file_third_kind.config_file_second_kind.config_file_first_kind.first_kind_name">
					<!-- 从三级机构设置表中获取名称-->
				</select></td>
				<!-- <td>二级机构编号：</td>
				<td><select id="config_file_third_kind.config_file_second_kind.second_kind_id">
					从三级机构设置表中获取编号
				</select></td> -->
				
				<td>二级机构名称：</td>		
				<td><select id="config_file_third_kind.config_file_second_kind.second_kind_name">
					<!-- 从三级机构设置表中获取编号-->
				</select></td>
				
				<td>三级机构名称：</td>
				<td><select id="config_file_third_kind.third_kind_name">
				</select></td>
			</tr>
			
			<!-- <tr>
				<td>二级机构名称：</td>		
				<td><select id="config_file_third_kind.config_file_second_kind.second_kind_name">
					从三级机构设置表中获取编号
				</select></td>
				<td>三级机构编号：</td>
				<td><select id="config_file_third_kind.third_kind_id">
					从三级机构设置表中获取名称
				</select></td>
				<td>三级机构名称：</td>
				<td><select id="config_file_third_kind.third_kind_name">
				</select></td>
			</tr> -->
			
			<tr>
				<td colspan='6' style="text-align: center;padding: 20px 0;">
					<p id="submit" type="submit" class="easyui-linkbutton" iconCls="icon-save"
						plain="true" style="padding-right:20px;">Save</p>
					<p id="submit" type="submit" class="easyui-linkbutton" iconCls="icon-cancel"
						plain="true" >Cancel</p>
				</td>
			</tr>
		</table>
		
	</form:form>

</body>

<script type="text/javascript">
$('#dg').datagrid({
	view: detailview,
	detailFormatter:function(index,row){
		return '<div class="ddv"></div>';
	},
	onExpandRow: function(index,row){
		var ddv = $(this).datagrid('getRowDetail',index).find('div.ddv');
		ddv.panel({
			border:false,
			cache:true,
			href:'show_form.php?index='+index,
			onLoad:function(){
				$('#dg').datagrid('fixDetailRowHeight',index);
				$('#dg').datagrid('selectRow',index);
				$('#dg').datagrid('getRowDetail',index).find('form').form('load',row);
			}
		});
		$('#dg').datagrid('fixDetailRowHeight',index);
	}
});


	
	






</script>

</html>