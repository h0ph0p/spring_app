<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h2>GOODBYE, table!</h2>
<table border="2px">
    <tr>
        <th>1__1</th>
        <th>2__2</th>
        <th>3__3</th>
        <th>4__4</th>
    </tr>
    <c:forEach items="${list02}" var="item02">
        <tr>
            <td><c:out value="${item02.typeId}"/></td>
            <td><c:out value="${item02.typeName}"/></td>
            <td><c:out value="${item02.characteristic1}"/></td>
            <td><c:out value="${item02.characteristic2}"/></td>
        </tr>
    </c:forEach>
</table>
<%--<img src="https://img-fotki.yandex.ru/get/173114/19749220.11/0_da31c_45c53ada_orig.jpg">--%>
</body>
</html>