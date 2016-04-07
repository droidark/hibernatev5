<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Tutorial: Hello Dojo!</title>
	</head>
	<body>
		<h2>Student Information</h2>
		<form:form method="POST" action="/SpringMVC05/addStudent">
			<table>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age"/></td>
				</tr>
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Submit" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>