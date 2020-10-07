<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-10-07
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="item">
<form action="/toupt" method="post">
    <table>

            <tr>
                <td>商品编号</td>
                <td><input type="text" name="id" value="${item.id}" readonly="readonly"></td>
            </tr>
            <tr>
                <td>商品名称</td>
                <td><input type="text" name="id" value="${item.gname}"></td>
            </tr>
            <tr>
                <td>商品价格</td>
                <td><input type="text" name="id" value="${item.gprice}"></td>
            </tr>
            <tr>
                <td>商品数量</td>
                <td><input type="text" name="id" value="${item.gcount}"></td>
            </tr>
            <tr>
        <tr>
            <td>商品数量</td>
            <td>
                <select name="billstatus">
                    <option value="${item.billstatus}">待处理</option>
                    <option value="${item.billstatus}">处理中</option>
                    <option value="${item.billstatus}">已处理</option>
                </select>
            </td>
        </tr>
                <td>
                    <input type="submit" value="添加">
                    <a href="/list"><button>返回</button></a>
                </td>
            </tr>

    </table>
</form>
</c:forEach>
</body>
</html>
