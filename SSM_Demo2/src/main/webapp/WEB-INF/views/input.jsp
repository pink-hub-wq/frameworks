<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户</title>
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
						<small>新增用户</small>
					</h1>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				 <form class="form-horizontal" action="${pageContext.request.contextPath}/user/toAddUser2" method="post">
                <div class="form-group">
                    <label for="id" class="col-sm-2 control-label">ID:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="id" name="id" placeholder="请输入用户ID">
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">姓名:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="name" name="name" placeholder="请输入用户姓名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="col-sm-2 control-label">密码:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="pwd" name="pwd" placeholder="请输入密码">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">提交</button>
                    </div>
                </div>
            </form>
			</div>
		</div>
	</div>
</body>
</html>