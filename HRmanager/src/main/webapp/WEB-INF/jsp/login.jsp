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
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<title>豆瓣书屋--后台管理登录</title>
</head>
<script type="text/javascript">
function liadImage(){
	var img=document.getElementById("randImg");
	img.src="imageCode.jsp?r="+Math.random;
}
</script>
<body>
	<c:if test="${errmsg!='' }">
		<font style="color:red" ><c:out value="${errmsg }"></c:out></font>
	</c:if>
	<h3>后台管理登录</h3>
	<form action="adminLogin" method="post">
		用户名：<input type="text" name="uname" ></br></br>
		密码：<input type="password" name="password"></br></br>
		验证码：<input type="text" name="validateCode">
		<img id="randImg" borer=0 src="imageCode.jsp">
		<a href="jacascript:loadImage();"></a>
		</br></br>
		<input type="submit" value="登录">
	</form>
	
	
</body>
</html>