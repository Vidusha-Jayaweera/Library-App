<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error occured</title>
</head>
<body>
    <h1>${errorCode}</h1>
    <h3>${errorMsg}</h3>
    <p>Please visit our <a href="${pageContext.request.contextPath}">home</a> page</p>
</body>
</html>
