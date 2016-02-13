<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="margin:auto;display:block;">
		<center class="blink_me">
			<h1>Franky-D-Fixer BaseCode</h1>
			<br />
			<img src="<c:url value='/assets/images/1.gif' />" />
		</center>
	</div>
</body>
<script type="text/javascript" src="<c:url value='/assets/js/jquery-2.1.4.min.js'/>" ></script>
<script type="text/javascript">
(function blink() { 
    $('.blink_me').fadeOut(500).fadeIn(500, blink); 
})();
</script>
</html>