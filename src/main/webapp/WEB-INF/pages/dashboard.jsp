<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='assets/css/bootstrap.min.css'/>" rel="stylesheet"></link>
</head>
<body>
	<center><h1><blink class="blink_me">WELCOME HOME KID</blink></h1></center>
</body>
<script type="text/javascript" src="<c:url value='/assets/js/jquery-2.1.4.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/assets/js/bootstrap.min.js'/>" ></script>
<script type="text/javascript">
(function blink() { 
    $('.blink_me').fadeOut(500).fadeIn(500, blink); 
})();
</script>
</html>