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
	<title>豆瓣书屋</title>
</head>

<body>
	<h1>书籍详情</h1>
	
	<input type="hidden" name="bid" value=${book.bid}>
		书名：${book.bname}</br></br>
		类别：${book.category.cname}</br></br>
		ISBN：${book.isbn}</br></br>
		作者：${book.author}</br></br>
		价格：${book.price}</br></br>
		介绍：${book.discription}</br></br>
	<c:forEach items="${book.pdfsStringList }" var="pdfUrl">
		<li><a href="${pdfUrl }">下载电子书</a></li>
	</c:forEach>
	</br></br>
	<a href="javascript:history.go(-1)">返回上一级</a>
</body>
</html>







