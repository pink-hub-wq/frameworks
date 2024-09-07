<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 传统访问 -->
<h2>传统访问</h2>
	<a href="UserAction">UserAction</a>
	<a href="UserAction2">UserActionQuery</a>
	<a href="UserAction3">UserActionUpdate</a><br/>
<!-- 通配符访问 -->
<h2>通配符访问</h2>
	<a href="InterfaceAction">InterfaceAction</a>
	<a href="InterfaceAction_add">InterfaceActionAdd</a>
	<a href="InterfaceAction_update">InterfaceActionUpdate</a><br/>
<h2>动态方法</h2>
<!-- 动态方法 -->
	<a href="ExtendsAction">ExtendsAction</a>
	<a href="ExtendsAction!add">ExtendsActionAdd</a>
	<a href="ExtendsAction!update">ExtendsActionUpdate</a>
</body>
</html>