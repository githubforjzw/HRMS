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
	<title>豆瓣书屋--后台管理</title>
</head>

<body>
<h1>fdfsff</h1>
	<h1>添加书籍</h1>
	<form action="admin/addBook" method="post">
		类别：<select name="cid" >
			<c:if test="${list.size()>0 }">
					<c:forEach items="${list }" var="category">
						<option value= ${category.cid }>${category.cname}</option>
					</c:forEach>
			</c:if>
		</select></br></br>
		书名：<input type="text" name="bname" onkeydown="if(enent)"></br></br>
		作者：<input type="text" name="author"></br></br>
		ISBN：<input type="text" name="isbn"></br></br>
		价格：<input type="text" name="price"></br></br>
		<input type="submit" value="添加书籍">
	</form>
	
	
</body>
</html>