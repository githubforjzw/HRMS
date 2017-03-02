<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div id="global">
		<form:form commandName="book" action="admin/updateBook" enctype="multipart/form-data" method="post">
			<fieldset>
				<legend>编辑书籍</legend>
				<p>
					<label for="category"> 类别：</label>
					<form:hidden path="bid"/>
					<form:select id="category" path="cid" items="${clist }" itemLabel="cname" itemValue="cid" />
				</p>
				<p>
					<label for="bname"> 书名：</label>
					<form:input id="bname" path="bname"
						onkeydown="if(event.keyCode==13)return false;" />
				</p>
				<p>
					<label for="isbn"> ISBN：</label>
					<form:input id="isbn" path="isbn"
						onkeydown="if(event.keyCode==13)return false;" />
				</p>
				<p>
					<label for="author"> 作者：</label>
					<form:input id="author" path="author"
						onkeydown="if(event.keyCode==13)return false;" />
				</p>
				<p>
					<label for="price"> 价格：</label> $
					<form:input id="price" path="price"
						onkeydown="if(event.keyCode==13)return false;" />
				</p>
				<p>
					<label for="discription"> 详情：</label>
					<form:input id="discription" path="discription"
						onkeydown="if(event.keyCode==13)return false;" />
				</p>



				<p>
					<label for="pdfs">已上传的电子书：</label>
					
					<ul>
						<c:forEach items="${book.pdfsStringList }" var="pdfUrl">
							<li><a href="${pdfUrl }">下载电子书</a></li>
						</c:forEach>
					</ul>
					<div id="uploadFiles">
						重新上传电子书： <input type="file" name="pdfsUrl" /> <input type="file"
							name="pdfsUrl" />
					</div>
				</p>


				<p id="buttons">
					<input id="reset"  type="reset"  tabindex="4" value="重置" > 
					<input id="submit" type="submit" tabindex="5" value="修改书籍">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>







