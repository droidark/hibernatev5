<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Tutorial: Hello Dojo!</title>
	</head>
	<body>
		<h1>Title: ${title}</h1>
		<h1>Message: ${message}</h1>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>Welcome: ${pageContext.request.userPrincipal.name}
				| <a href="<c:url value="/logout" />">Logout</a></h2>
		</c:if>
	</body>
</html>