<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인크루드~</title>
</head>
<body>
	<h1>include</h1>
	<p>다른페이지를 포함할때 사용</p>
	<%-- 중복 사용안됨
	<%@ include file="footer.jsp" %>
	<%@ include file="footer.jsp" %>
	--%>
	
	<h4> JSP 표준 액션 태그를이용한 방식(동적 include)</h4>
	
	<jsp:include page="footer.jsp"></jsp:include>
	
	<!-- 
		XML 기반 기술이기 때문에 반드시 시작태그와 종료태그가 쌍으로 존재해야함!!
		닫는 태그를 작성하지않는다면 500에러 발생!!
	 -->
	 <jsp:include page="footer.jsp" />
	 <jsp:include page="footer.jsp" />
	 <jsp:include page="footer.jsp" />
	 <jsp:include page="footer.jsp" />
	 <jsp:include page="footer.jsp" />
	 <jsp:include page="footer.jsp" />
	 
	 <hr>
	 <!-- name 내맘대로 밸류도 내맘대로 -->
	 <!-- Content영역에 주석넣지않기 --> 
	 
	 <jsp:include page="footer.jsp" >
	 	<jsp:param name ="test" value="result_first"/>
	 </jsp:include>
	 
	 <jsp:include page="footer.jsp" >
	 	<jsp:param name ="test" value="result_second"/>
	 </jsp:include>
	 
	
	
</body>
</html>