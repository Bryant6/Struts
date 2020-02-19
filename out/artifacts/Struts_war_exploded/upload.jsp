<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2020/2/19
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="upload" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="doc"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
