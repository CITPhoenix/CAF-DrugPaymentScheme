<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html
	PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/shtml1-strict.dtd">
	
	<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	
	<head>
	<title>Login</title>
	</head>
	<body>
		<h3> Please enter your authentication credentials below</h3>
		
		<c:if test="${not empty errorMsg}">
			<div style="color:red;font-weight:bold;">
			Login attempt unsuccessful.<br/> Reason:
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>
		
		<form action="<c:url value='j_spring_security_check' />" method='post'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username'/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td colspan='2'><input name="Login" type="submit" value="Login"/>
				</td>
			</tr>
		
		</table>
		</form>
		
	</body>
	
	</html>