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
	<h1>修改书籍</h1>
	<form action="admin/updateBook" method="post">
		类别：<select name="cid" >
			<c:if test="${list.size()>0 }">
				<c:forEach items="${list }" var="category">
					<c:choose>
					    <c:when test="${category.cid == book.cid}">
					    	<option value=${category.cid } selected="selected"> ${category.cname } </option>
					    </c:when>
					    <c:otherwise>
							<option value=${category.cid }> ${category.cname } </option>
					    </c:otherwise>
					</c:choose>
				</c:forEach>
			</c:if>
			</select></br></br>
			
			<input type="hidden" name="bid" value=${book.bid}>
		书名：<input type="text" name="bname" value=${book.bname}></br></br>
		作者：<input type="text" name="author" value=${book.author}></br></br>
		ISBN：<input type="text" name="isbn" value=${book.isbn}></br></br>
		价格：<input type="text" name="price" value=${book.price}></br></br>
		<input type="submit" value="确定修改">
	</form>
	
</body>
</html>







