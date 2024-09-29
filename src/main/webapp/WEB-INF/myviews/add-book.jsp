<%@ page language="java" contentType="text/html;"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Insert title here</title>		
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.main.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.main.css">

	</head>
	
	<body>		
		
		<div class="container-fluid bg-success text-white text-center">
				<h1>Spring Boot MVC Project...</h1>
				<h2>@Controller @Service @ExceptionHandler @Validations @JSP Vew Layer @bootstrap...</h2>
		</div>
		
		<div>
			<h1><i>Add the new Book Data...</i></h1>
			
			<form method="post" action="/books/savebook">
			
			<div class="form-group">
				<label>Book ISBN:-</label>
				
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fas fa-book"></i></span>
					</div>
					<input type="text" class="form-control" name="isbn" placeholder="Book Number">
				</div>
				
				<c:if test="${not empty errors.getFieldError('isbn')}">
					<div class="text-danger">
						${errors.getFieldError('isbn').defaultMessage}
					</div>
				</c:if>
							
			</div>
			
			<div class="form-group">
				<label>Book Name:-</label>
				
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fas fa-book"></i></span>
					</div>
					<input type="text" class="form-control" name="name" placeholder="Book Name">
				</div>
				
				<c:if test="${not empty errors.getFieldError('name')}">
					<div class="text-danger">
						${errors.getFieldError('name').defaultMessage}
					</div>
				</c:if>
			
			</div>
			
			<div class="form-group">
				<label>Book Author:-</label>
				
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="fas fa-user"></i></span>
					</div>
					<input type="text" class="form-control" name="author" placeholder="Book Author">
				</div>
				
				<c:if test="${not empty errors.getFieldError('author')}">
					<div class="text-danger">
						${errors.getFieldError('author').defaultMessage}
					</div>
				</c:if>
			
			</div>
			
			<button type="submit" class="btn btn-primary">Save Book</button>
			
			
			
			
			</form>
		</div>
	</body>
</html>