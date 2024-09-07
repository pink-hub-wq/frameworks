<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
success<br/>
读取作用域:<br/>
<s:property value="msg1"/><br/>
<s:property value="msg2"/><br/>
访问属性:<br/>
<s:property value="user.name"/><br/>
<s:property value="user.pwd"/><br/>
访问方法:<br/>
<s:property value="user.toString()"/><br/>
调用普通类静态属性:<br/>
<s:property value="@com.edu.seiryo.entity.User@getStaticString()"/><br/>
调用action静态方法:<br/>
<s:property value="@com.edu.seiryo.action.UserAction@getActionStatic()"/><br/>
调用jdk静态方法:<br/>
<s:property value="@java.lang.Math@random()"/><br/>
访问List数组:<br/>
<s:iterator value="list">
	<s:property value="name"/>
	<s:property value="pwd"/>
</s:iterator><br/>
访问Map键值对:<br/>
<s:iterator value="map">
	键：<s:property value="map.keys"/>
	值：<s:property value="map.values"/>
</s:iterator>
</body>
</html>