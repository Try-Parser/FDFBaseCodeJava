<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
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
	<div style="margin:auto;display:block;">
		<center class="blink_me">
			<h1>Franky-D-Fixer BaseCode</h1>
			<br />
			<img src="<c:url value='/assets/images/1.gif' />" />
		</center>
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4 col-md-offset-4">
					<form action="<c:url value='/j_spring_security_check' />" method="post" role="form">
					  <div class="form-group">
					    <label for="exampleInputEmail1">Email address</label>
					    <input type="email" name="j_username" class="form-control" id="j_username"  placeholder="Email" required>
					  </div>
					  <div class="form-group">
					    <label for="exampleInputPassword1">Password</label>
					    <input type="password" name="j_password" class="form-control" id="j_password" placeholder="Password" required>
					  </div>
					  <div class="checkbox">
					    <label>
					      <input type="checkbox"> Check me out
					    </label>
					  </div>
					  <button type="submit" class="btn btn-default">Submit</button>
					  <strong class="error"><c:out value="${fn:replace(SPRING_SECURITY_LAST_EXCEPTION.message, 'Bad credentials', 'Username/Password is incorrect')}"/></strong>
					</form>
				</div>
		  	</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="<c:url value='/assets/js/jquery-2.1.4.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/assets/js/bootstrap.min.js'/>" ></script>
<script type="text/javascript">
(function blink() { 
    $('.blink_me').fadeOut(500).fadeIn(500, blink); 
})();
</script>
</html>