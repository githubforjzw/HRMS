<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<base href="<%=basePath%>" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="App Sign in Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
</head>
<body>
	<h1>人力资源管理系统后台登录</h1>
	<div class="app-cam">
		<div class="cam">
			<img src="images/cam.png" class="img-responsive" alt="" />
		</div>
		<form action="back/login" method="post">
			<input type="text" class="text" value="E-mail address"
				onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = '请填写你的帐号';}">
			<input type="password" value="Password" onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = '';}">
			<div class="submit">
				<input type="submit" onclick="myFunction()" value="Sign in">
			</div>
			<div class="buttons">
				<ul>
					<li><a href="http://www.hyycinfo.com/" class="hvr-sweep-to-right">QQ帐号登录</a></li>
					<li><a href="http://www.hyycinfo.com/" class="hvr-sweep-to-left">新浪微博帐号登录</a></li>
				</ul>
			</div>
			<div class="new">
				<p>
					<a href="#">忘记密码?</a>
				</p>
			</div>
		</form>
	</div>
	<div class="copy-right">
		<p>电话：0734-8355998 QQ：1728952785 邮政编码：421141</p>
		<p>
			版权所有 &copy; CopyRight 2016
			<a href="http://www.hyycinfo.com/" target="_blank" title="源辰科技">源辰信息科技有限公司</a>&nbsp;地址：衡阳市解放西路丽天名园905室
		</p>
	</div>
	<!--//end-copyright-->
</body>
</html>