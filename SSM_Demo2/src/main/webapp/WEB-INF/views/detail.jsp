<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>用户展示页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="page-header">
					<h1>
						<small>书籍列表 —— 显示书籍</small>
					</h1>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>编号</th>
							<th>姓名</th>
							<th>密码</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="user" items="${list}">
							<tr>
								<td>${user.id}</td>
								<td>${user.name}</td>
								<td>${user.pwd}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>