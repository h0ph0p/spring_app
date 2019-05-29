<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>VACHEnasrat</title>
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
    .c:hover {
        box-shadow: 0 0 5px rgba(0,0,0,0.3); /* Тень */
        background: linear-gradient(to bottom, #060606, #e99f89); /* Градиент */
        color: #fffcfe;
    }

</style>
<body>

<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<a href="go_to_private_office" class="s1" style="margin-left: 40px">Личный Кабинет</a>

<a href="go_to_basket"><img src="https://st.depositphotos.com/1327054/3697/i/950/depositphotos_36977035-stock-photo-full-wastebasket.jpg"
                            width="80"
                            height="50" alt="Пример" style="margin-left: 40px"></a>



<table border="2px">
    <tr>
        <th>id товара</th>
        <th>тип товара</th>
        <th>производитель</th>
        <th>фото</th>
        <th>габариты</th>
        <th>цена</th>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.characteristicsByTypeId.typeName}</td>
            <td><c:out value="${item.producerByProducerId.producerName}"/></td>
            <td><img src="${item.image}" class="img_wrap2"></td>
            <td><c:out value="${item.dimensions}"/></td>
            <td><c:out value="${item.characteristic1}"/></td>
            <td>
                <a href="information_about_good?id=${item.id}" class="c">Подробнее о товаре</a><br>
                <a href="add_to_bin?id=${item.id}" class="c">Добавить в корзину</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
