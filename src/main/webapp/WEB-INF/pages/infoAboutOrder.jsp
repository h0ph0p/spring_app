<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Информация о заказе</title>
</head>
<style>
    .img_wrap {
        width: 200px;
        height: 100px;
        overflow: hidden;
        border-style: solid;
    }

    .img_wrap2 {
        width: 100px;
        height: 40px;
        overflow: hidden;
        border-style: solid;
    }

    .c {
        border: 1px solid #333; /* Рамка */
        display: inline-block;
        padding: 5px 15px; /* Поля */
        text-decoration: none; /* Убираем подчёркивание */
        color: #000; /* Цвет текста */
    }

</style>
<body>

<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<a href="go_to_private_office" class="s1" style="margin-left: 40px">Личный Кабинет</a>

<a href="go_to_basket"><img src="https://st.depositphotos.com/1327054/3697/i/950/depositphotos_36977035-stock-photo-full-wastebasket.jpg"
                            width="80"
                            height="50" alt="Пример" style="margin-left: 40px"></a>
<br>
Адрес доставки:<c:out value="${receiveTEntity.adress}"/><br>
Тип доставки:<c:out value="${receiveTEntity.receivingType}"/><br>
Экспрес доставка:<c:out value="${receiveTEntity.express}"/><br><br>

<table border="2px">
    <tr>
        <th>id товара</th>
        <th>тип товара</th>
        <th>производитель</th>
        <th>фото</th>
        <th>количество</th>
        <th>price</th>
        <%--<th>options</th>--%>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.goodsByOrderId.id}</td>
            <td>${item.goodsByOrderId.characteristicsByTypeId.typeName}</td>
            <td><c:out value="${item.goodsByOrderId.producerByProducerId.producerName}"/></td>
            <td><img src="${item.goodsByOrderId.image}" class="img_wrap2"></td>
            <td><c:out value="${item.quantity}"/></td>
            <td><c:out value="${item.cost}"/></td>
            <td><a href="information_about_good?id=${item.goodsByOrderId.id}" class="c">Подробнее о товаре</a></td>
        </tr>
    </c:forEach>
</table>


<br><br>
<%--<a href="back_to_private_office" class="c">Назад</a>--%>


</body>
</html>
