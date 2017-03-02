<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%
	String path = request.getContextPath(); // /douban
//                       http                ://       localhost               :        8080                 
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	//        /douban  /
			+ path + "/";
%>
<base href="<%=basePath%>" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加书籍</title>
</head>
<body>

	<div id="global">
		<form:form commandName="book" action="admin/addBook" enctype="multipart/form-data" method="post">
			<fieldset>
				<legend>添加一本书</legend>
				<p>
					<label for="category"> 类别：</label>
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
					<label for="pdfs">电子书：</label>
					<div id="uploadFiles">
						<input type="file" name="pdfsUrl" />
						<input type="file" name="pdfsUrl" />
					</div>
				</p>
				
				
				<p id="buttons">
					<input id="reset"  type="reset"  tabindex="4" value="重置" > 
					<input id="submit" type="submit" tabindex="5" value="添加书籍">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>