<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2020/4/22
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/insert" method="post">
    <table>
        <tr>
            <td>部门名称</td>
            <td>
                <input type="text" name="dept_name"/>
            </td>
        </tr>
        <tr>
            <td>
                <button type="reset">重置</button>
            </td>
            <td>
                <button type="submit">添加</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
