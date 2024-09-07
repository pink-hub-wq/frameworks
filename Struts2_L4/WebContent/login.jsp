<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserAction_login">
		用户名：<input type="text" name="user.userName"/><br/>
		密码：<input type="text" name="user.userPassword"/><br/>
		用户类型：
		<select name="userType">
			<option value="教师">教师</option>
			<option value="学生">学生</option>
		</select><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>