<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2020-10-07
  Time: 09:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/list " method="post">
    请选择区域:<select name="gdistrict">
    <option value="1">朝阳订单</option>
    <option value="2">海淀订单</option>
    <option value="3">丰台订单</option>
    <option value="4">西城订单</option>
    <option value="5">昌平订单</option>
</select>
    <input type="submit" value="查询">
</form>
</body>
</html>
