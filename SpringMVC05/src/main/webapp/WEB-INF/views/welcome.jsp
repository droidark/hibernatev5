<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tutorial: Hello Dojo!</title>
<!-- load Dojo -->
<style type="text/css">
@import
	"http://ajax.googleapis.com/ajax/libs/dojo/1.5/dijit/themes/claro/claro.css"
	;
</style>
<script
	src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"></script>
<script>
	dojo.ready(function() {
		dojo.byId("greeting").innerHTML += ", from " + dojo.version;
	});
</script>
</head>
<body>
	
	<table>
		<c:forEach items="${greeting}" var="numero">
			<tr><td>${numero}</td></tr>
		</c:forEach>
	</table>
</body>
</html>