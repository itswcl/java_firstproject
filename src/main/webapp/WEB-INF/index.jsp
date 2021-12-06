<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>First Project</title>
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- <script type="text/javascript" src="js/script.js"></script> -->
	
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<%-- 	<h1>Hello World</h1>
	<h2><c:out value="${2+2}"/></h2> --%>
	
	<div class="container">
		<h3>Login</h3>
		<form action="/login" method="post">
			<label>Email:</label>
			<input type="email" name="email">
			<label>Password:</label>
			<input type="password" name="password">
	        <input type="submit">
		</form>
		
		<h3>Search</h3>
			<form action="/search">
	        <label>Search:</label>
	        <input type="text" name="searchTerm">
	        <input type="submit">
    	</form>
    	
    	<h3>Pay</h3>
    	<form action="processPayment" method="post">
    		<input type="hidden" name="productID" value="128">
    		<label>Credit Card Number</label>
    		<input type="text" name="creditCardNumber">
    		<label>Expiration Date</label>
    		<input type="date" name="expDate">
    		<input type="submit">
    	</form>
		<%-- 		
		<h1 class="text-dark">Dojo Location</h1>
			<!-- this will only run if dojoList pass in -->
			<c:forEach var="dojo" items="${ dojosList }">
				<p> <c:out value="${ dojo }"/> </p>
			</c:forEach>
		--%>
		<!-- h2 will still create but if route not providing value it'll be empty tag -->
		<%--
		<h2><c:out value="${fruit}" /></h2>
		<h2><c:out value="${firstName}" /></h2>
		<h2><c:out value="${lastName}" /></h2>
		<h2><c:out value="${email}" /></h2>
		<h2><c:out value="${age}" /></h2>
		--%>
	</div>



</body>
</html>