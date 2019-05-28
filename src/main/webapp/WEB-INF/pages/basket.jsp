<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>корзина</title>
</head>
<style>
    .s1 {
        color: #FFD201;
        letter-spacing: 1px;
        border-bottom: 1px solid transparent;
        border-top: 1px solid transparent;
    }
    .s1:hover {
        border-bottom: 1px solid #FFD201;
        border-top: 1px solid #FFD201;
    }

    .img_wrap {
        width: 200px;
        height: 100px;
        overflow: hidden;
        border-style: solid;
    }
</style>
<body>

<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<a href="go_to_private_office" class="s1" style="margin-left: 40px">Личный Кабинет</a>

<h4>Таблица заказов:</h4>

<table border="2px">
    <tr>
        <th>type_id</th>
        <th>producer_id</th>
        <th>foto</th>
        <th>dimensions</th>
        <th>price</th>
        <%--<th>options</th>--%>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td><c:out value="${item.producerByProducerId.producerId}"/></td>
            <td><img src="${item.image}"></td>
            <td><c:out value="${item.dimensions}"/></td>
            <td><c:out value="${item.characteristic1}"/></td>
            <%--<td><a href="add_to_bin?id=${item.id}" class="c">Добавить в корзину</a></td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
