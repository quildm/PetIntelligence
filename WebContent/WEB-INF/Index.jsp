<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

<h3>Sup ${name} I'm the index.jsp</h3>
	<h2>Add a Dog!</h2>
	<form action='/Pets/Dog'>
		<p>
			<label for="name">Name</label>
			<input type ="text" id='name' name="name">
		</p>
		<p>
			<label for="breed">Breed</label>
			<input type ="text" id='breed' name="breed">
		</p>
		<p>
			<label for="weight">Weight</label>
			<input type ="text" id='weight' name="weight">
		</p>	
		<p>
		<input type ="submit" value="Add Dog">
		</p>
	</form>
	<h2>Add a Cat!</h2>
		<form action='/Pets/Cat'>
		<p>
			<label for="name">Name</label>
			<input type ="text" id='name' name="name">
		</p>
		<p>
			<label for="breed">Breed</label>
			<input type ="text" id='breed' name="breed">
		</p>
		<p>
			<label for="weight">Weight</label>
			<input type ="text" id='weight' name="weight">
		</p>	
		<p>
		<input type ="submit" value="Add Cat">
		</p>
	</form>

</body>
</html>