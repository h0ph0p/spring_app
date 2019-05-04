<%--<html>--%>
<%--<body>--%>
<%--<h2>Hello World!</h2>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h2>Hello, table!</h2>
<table border="2px">
    <tr>
        <th>type_id</th>
        <th>type_name</th>
        <th>charact_1</th>
        <th>charact_2</th>
    </tr>
    <%--
    for(Idea item : list ){
    ...
    }
    --%>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.typeId}"/></td>
            <td><c:out value="${item.typeName}"/></td>
            <td><c:out value="${item.characteristic1}"/></td>
            <td><c:out value="${item.characteristic2}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>