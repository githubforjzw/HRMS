<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>豆瓣书屋</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">
$(document).ready(
		function(){
			$("#category").change(
				function(){
					$.post("findBookByCategory?cid="+$(this).val(),function(json){
						var obj=$.parseJSON(json);
						$("#bookList").html("");
						for(var i=0;i<obj.length;i++){
							var o=obj[i];
							$("#bookList").append(
									"<tr><td>"+o.category.cname
									+"</td><td>"+o.bname
									+"</td><td>"+o.isbn
									+"</td><td>"+o.author
									+"</td><td>"+o.price
									+"</td><td><a href='toDetailForm?bid="+o.bid+"'>详情</a>&nbsp;&nbsp;"
									+"<a href='toRankBookForm?bid=bid=+"+o.bid+"'>评分</a></td></tr>")
						}
					});
				});
		});
</script>
</head>

<body>
<h3>豆瓣书屋</h3>
筛选：
<select name="cid" id="category" >
	<option value="-1">所有书籍</option>
	<c:if test="${clist.size()>0 }">
		<c:forEach items="${clist }" var="category">
			<option value=${category.cid }>${category.cname}</option>
		</c:forEach>
	</c:if>
</select>
</br></br>


<table border="1px" align="center">
<thead>
	<tr>
		<th>类别</th>
		<th>书名</th>
		<th>ISBN</th>
		<th>作者</th>
		<th>价格</th>
		<th>操作</th>
	</tr>
</thead>
<tbody id="bookList">
	<c:if test="${list.size()>0 }">
		<c:forEach items="${list }" var="book">
			<tr>
				<td>${book.category.cname}</td>
				<td>${book.bname}</td>
				<td>${book.isbn}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td><a href="toDetailForm?bid=${book.bid}">详情</a>&nbsp;&nbsp;
					<a href="toRankBookForm?bid=${book.bid}">评分</a></td>
			</tr>
		</c:forEach>
	</c:if>
</tbody>
</table>

</body>
</html>