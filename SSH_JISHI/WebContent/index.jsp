<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script>
window.onload = function() {
    if (document.referrer.indexOf('shops_query') === -1) {
        window.location.href = "shops_query";
    }
};

</script>
</head>
<body>
<h1>订单查询</h1>
    <form action="order_queryStatus">
        输入订单号：<input type="text" name="orderId" id="orderId">
        <input type="submit" value="查询">
    </form>
	<span id="msg"></span>
<h2>商品信息列表</h2>
<table border="1">
    <tr>
    	<th>编号：</th>
        <th>商品名：</th>
        <th>原价</th>
        <th>现价</th>
        <th>描述</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${shopInfoList}" var="shopinfo">
        <tr>
        	<td>${shopinfo.shopId}</td>
            <td>${shopinfo.shopName}</td>
            <td>${shopinfo.oldPrice}</td>
            <td>${shopinfo.price}</td>
            <td>${shopinfo.descr}</td>
            <td><a href="shops_add?shopId=${shopinfo.shopId}&shopName=${shopinfo.shopName}&price=${shopinfo.price}">加入购物车</a></td>
        </tr>
    </c:forEach>
</table>	
</body>
</html>