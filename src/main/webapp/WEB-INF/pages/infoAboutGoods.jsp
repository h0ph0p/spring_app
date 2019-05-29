<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Информация о товаре</title>
</head>
<style>
    .img_wrap {
        width: 200px;
        height: 100px;
        overflow: hidden;
        border-style: solid;
    }

    .img_wrap2 {
        width: 300px;
        height: 400px;
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

id товара: <c:out value="${goodsEntity.id}"/><br>
фото товара: <img src="${goodsEntity.image}" class="img_wrap2"><br>
габариты: <c:out value="${goodsEntity.dimensions}"/><br>
<c:out value="${characteristicsEntity.characteristic1}"/>: <c:out value="${goodsEntity.characteristic1}"/><br>
<c:out value="${characteristicsEntity.characteristic2}"/>: <c:out value="${goodsEntity.characteristic2}"/><br>
<c:out value="${characteristicsEntity.characteristic3}"/>: <c:out value="${goodsEntity.characteristic3}"/><br>
<c:out value="${characteristicsEntity.characteristic4}"/>: <c:out value="${goodsEntity.characteristic4}"/><br>
<c:out value="${characteristicsEntity.characteristic5}"/>: <c:out value="${goodsEntity.characteristic5}"/><br>
<c:out value="${characteristicsEntity.characteristic6}"/>: <c:out value="${goodsEntity.characteristic6}"/><br>


</body>
</html>
