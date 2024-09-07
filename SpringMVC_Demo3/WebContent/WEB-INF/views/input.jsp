<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/EmployeeController/emp" method="post" modelAttribute="employee">
		<c:if test="${employee.id != null}">
			id:<form:input path="id" readonly="readonly"/><br/>
			   <input type="hidden" name="_method" value="PUT"/>
		</c:if>
		lastName:<form:input path="lastName"/><br/>
		email:<form:input path="email"/><br/>
		<%
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(0,"female");
			map.put(1,"male");
			request.setAttribute("map", map);
		%>
		gender:<form:radiobuttons path="gender" items="${map}"/><br/>
		department:<form:select path="department.id" items="${departments}" itemLabel="departmentName" itemValue="id"></form:select><br/>
		<input type="submit"/>
	</form:form>
</body>
</html>