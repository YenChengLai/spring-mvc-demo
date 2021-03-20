<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
	<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br>
			Last Name: <form:input path="lastName" />
			<br>
			<input type="submit" value="submit" />
		</form:form>
	</body>
</html>