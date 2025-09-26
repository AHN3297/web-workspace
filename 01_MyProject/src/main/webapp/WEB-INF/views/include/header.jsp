<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
    	footer{
        	border-top: #52b1ff28 1px solid;
    	}
    	
    </style>	
</head>
<body>
       <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:4000/my/">KH Musical</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Musical
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Musical</a></li>
            <li><a class="dropdown-item" href="#">News</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">공지사항</a></li>
          </ul>
        </li>
        <c:choose>
        	<c:when test="${ empty sessionScope.userInfo }">
		        <li class="nav-item">
		          <a class="nav-link" href="Z">로그인</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="signup">회원가입</a>
		        </li>
	        </c:when>
	        
	        <c:otherwise>
		        <li class="nav-item">
		          <a class="nav-link" href="https://google.com">내정보</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="https://google.com">로그아웃</a>
		        </li>
	        </c:otherwise>
        </c:choose>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>