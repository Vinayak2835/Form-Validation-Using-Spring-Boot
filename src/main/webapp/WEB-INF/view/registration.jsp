<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors {
	color: red;
}
</style>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-3" align="center">
		<div class="col-sm-4">
			<div>
				<h1>Please Register:</h1>

				<form:form action="register-process" modelAttribute="reg"
					method="Post">
					<label class="form-label">UserName:</label>
					<form:input path="userName" class="form-control" />
					<form:errors path="userName" class="errors"></form:errors>
					<br>


					<label class="form-label">Password:</label>
					<form:input path="password" class="form-control" />
					<form:errors path="password" class="errors"></form:errors>
					<br />


					<label class="form-label">Phone:</label>
					<form:input path="phone" class="form-control" />
					<br />


					<label class="form-label">Age:</label>
					<form:input path="age" class="form-control" />
					<form:errors path="age" class="errors"></form:errors>
					<br />

					<input type="submit" class="btn btn-primary text-center text-white">
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>