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
	<title>豆瓣书屋--后台管理</title>
</head>

<body>
	<a href="admin/toAddBook"><h3>添加</h3></a>

	<c:if test="${list.size()>0 }">
		<table border="1px" align="center">
			<tr>
			<th>类别</th>
			<th>书名</th>
			<th>ISBN</th>
			<th>作者</th>
			<th>价格</th>
			<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="book">
				<tr>
				<td>${book.category.cname}</td>
				<td>${book.bname}</td>
				<td>${book.isbn}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td><a href="admin/toUpdateBook?bid=${book.bid}"> 编辑</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
</body>
</html>