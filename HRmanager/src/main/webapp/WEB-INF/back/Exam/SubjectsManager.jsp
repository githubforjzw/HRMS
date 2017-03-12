<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path=request.getContextPath();
	String basePath= request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<base href="<%= basePath  %>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历表</title>
</head>
<body>
	<form:form commandName="engage_subjects" action=""  method="post" >
		
	</form:form>
	
</body>
<script type="text/javascript">

</script>
</html>