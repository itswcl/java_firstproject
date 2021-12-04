<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Fruit Page</title>
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
	<h1 class="text-light">Two plus two is:</h1>
	<h2>
		<c:out value="${fruit}" />
	</h2>

	<h2>
		<c:out value="${firstName}" />
	</h2>
	<h2>
		<c:out value="${lastName}" />
	</h2>
	<h2>
		<c:out value="${email}" />
	</h2>
	<h2>
		<c:out value="${age}" />
	</h2>
	</div>



</body>
</html>