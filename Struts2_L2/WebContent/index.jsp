<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="UserAction">UserAction</a>
<a href="TestAction">TestAction</a><br/>
<a href="UserAction_add">UserActionAdd</a>
<a href="TestAction_add">TestActionAdd</a><br/>
<a href="RedirectAction">RedirectAction</a>
<a href="ChainAction">ChainAction</a><br/>
<a href="UserAction_login?userName=张三&userPassword=123456">UserActionLogin</a>
<a href="UserAction_login2?userName=李四&userPassword=123456">UserActionLogin2</a><br/>
<a href="UserAction2_login?userName=王五&userPassword=123456">UserAction2Login</a>
<a href="UserAction3_login">UserAction3Login</a>
<a href="UserAction4_login">UserAction4Login</a><br/>
<a href="UserAction_test">UserActionTest</a><br/>
<a href="UserAction_test2?user.userName=赵六&user.userPassword=123456">UserActionTest2</a><br/>
<a href="UserModelAction_test?userName=麻七&userPassword=123456">UserModelAction</a><br/>
</body>
</html>