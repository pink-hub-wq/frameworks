<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="HelloController/HelloGet">HelloController/HelloGet</a>
	<form action="HelloController/HelloPost" method="post">
		<input type="submit" value="HelloController/HelloPost">
	</form>
	<a href="HelloController/add?name=jessica">HelloController/helloAdd</a><br/>
	<a href="HelloController/helloPath/aaa/aaa">HelloController/helloPath</a><br/>
	<a href="HelloController/helloPath2/aaabb">HelloController/helloPath2</a><br/>
	<a href="HelloController/helloPath3/aaa/bb/aaa">HelloController/helloPath3</a><br/>
	<a href="HelloController/TestName/jessica">HelloController/TestName</a><br/>
	<form action="HelloController/Test" method="post">
		<input type="submit" value="HelloController/addTest">
	</form>
	<form action="HelloController/Test" method="get">
		<input type="submit" value="HelloController/queryTest">
	</form>
	<form action="HelloController/Test" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="HelloController/deleteTest">
	</form>
	<form action="HelloController/Test/1" method="post">
		<input type="hidden" name="_method" value="put">
		<input type="submit" value="HelloController/putTest">
	</form>
</body>
</html>