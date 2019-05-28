<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<style>
    .img_wrap {
        width: 200px;
        height: 100px;
        overflow: hidden;
        border-style: solid;
    }
</style>
<html>
<body>
<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<h2>Hello, table!</h2>

<table border="2px">
    <tr>
        <th>type_id</th>
        <th>producer_id</th>
        <th>foto</th>
        <th>dimensions</th>
        <th>price</th>
    </tr>
    <%--
    for(Idea item : list ){
    ...
    }
    --%>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td><c:out value="${item.producerByProducerId.producerId}"/></td>
            <td><img src="${item.image}"></td>
            <td><c:out value="${item.dimensions}"/></td>
            <td><c:out value="${item.characteristic1}"/></td>
        </tr>
    </c:forEach>
</table>
<img src="https://img-fotki.yandex.ru/get/173114/19749220.11/0_da31c_45c53ada_orig.jpg">
</body>
</html>