<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/EmployeeController/emp">add</a>
	<table border="1px">
		<tr>
			<td>ID</td>
			<td>LastName</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Department</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${emps}" var="emp">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.lastName}</td>
			<td>${emp.email}</td>
			<td>${emp.gender == 0 ? 'female' : 'male'}</td>
			<td>${emp.department.departmentName}</td>
			<td><a href="${pageContext.request.contextPath}/EmployeeController/emp">Edit</a></td>
			<td><a href="${pageContext.request.contextPath}/EmployeeController/emp/${emp.id}" class="delete">Delete</a></td>
		</tr>
		</c:forEach>
		<form action="" method="post" id="form1">
			<input type="hidden" name="_method" value="DELETE"/>
		</form>
	</table>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$(".delete").click(function(){
				$("#form1").attr("action",this.href);
				$("#form1").submit();
				return false;
			})
		})
	</script>
</body>
</html>