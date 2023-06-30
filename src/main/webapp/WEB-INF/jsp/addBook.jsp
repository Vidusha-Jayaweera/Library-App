<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book</title>
    <style>
        .errorMsg{
            color: red;
            font-style: italic;
            font-weight: bold;
        }
        .errorInput{
            border-color: brown;
        }
    </style>
</head>
<body>
    <h2>Add Book</h2>
    <form:form modelAttribute="book" action="${pageContext.request.contextPath}/add-book/save" method="post">
        <table>
            <tr>
                <td><form:label path="title">Title</form:label></td>
                <td><form:input path="title" cssErrorClass="errorInput"/></td>
                <td><form:errors path="title" cssClass="errorMsg"/> </td>
            </tr>
            <tr>
                <td><form:label path="description">Description</form:label></td>
                <td><form:input path="description" cssErrorClass="errorInput"/></td>
                <td><form:errors path="description" cssClass="errorMsg"/></td>
            </tr>
            <tr>
                <td><form:label path="type">Type</form:label></td>
                <td>
                    <form:select path="type">
                        <form:options items="${types}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Add Book"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>