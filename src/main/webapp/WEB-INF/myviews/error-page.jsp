<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Error Page Duplicate Book...</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
		 rel="stylesheet" >
	</head>	
<body>
	<div class="container-fluid bg-success text-white text-center">
				<h1>Spring Boot MVC Project...</h1>
				<h2>@Controller @Service @ExceptionHandler @Validations @JSP Vew Layer @bootstrap...</h2>
	</div>
	
	<div class="container-fluid text-white bg-danger text-center">
		
		<h1>Error : Duplicate Book Exception Message </h1>
		
		Book ISBN : ${book.isbn} <br>
		Book Name : ${book.name} <br>
		Book Author : ${book.author} <br>
		
		Message : ${message}
	</div>
	



</body>
</html>