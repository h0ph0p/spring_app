<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>корзина</title>
</head>
<style>
    #zatemnenie {
        background: rgba(102, 102, 102, 0.5);
        width: 100%;
        height: 100%;
        position: absolute;
        top: 0;
        left: 0;
        display: none;
    }
    #okno {
        width: 300px;
        height: 265px;
        text-align: center;
        padding: 15px;
        border: 3px solid #0000cc;
        border-radius: 10px;
        color: #0000cc;
        position: absolute;
        top: 0;
        right: 0;
        bottom: 0;
        left: 0;
        margin: auto;
        background: #fff;
    }
    #zatemnenie:target {display: block;}
    .close {
        display: inline-block;
        border: 1px solid #0000cc;
        color: #0000cc;
        padding: 0 12px;
        margin: 10px;
        text-decoration: none;
        background: #f2f2f2;
        font-size: 14pt;
        cursor:pointer;
    }
    .close:hover {background: #e6e6ff;}




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
        background: linear-gradient(to bottom, #060606, #e9e688); /* Градиент */
        color: #fffffc;
    }

    .disabled {
        pointer-events: none; /* делаем элемент неактивным для взаимодействия */
        cursor: default; /*  курсор в виде стрелки */
        color: #888;/* цвет текста серый */
    }
</style>
<body>

<div id="zatemnenie">
    <div id="okno">

        <form:form id="formCreate" modelAttribute="newT" method="post" action="new_order">
            Заполните данные для регистрации:<br>
            адрес: <form:input path="adress" placeholder="адрес" class="c"/><br><br>
            тип доставки: <form:input path="receivingType" placeholder="самовывоз/курьером" class="c"/><br><br>
            экспрес: <form:input path="express" placeholder="да/нет" class="c"/><br><br><br>
            <button type="submit" class="c">Оформить заказ</button>
        </form:form>
        <br>
        <a href="#" class="close">Закрыть окно</a>
    </div>
</div>



<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<a href="go_to_private_office" class="s1" style="margin-left: 40px">Личный Кабинет</a>

<h4>Таблица заказов:</h4>

<table border="2px">
    <tr>
        <th>id товара</th>
        <th>тип товара</th>
        <th>производитель</th>
        <th>фото</th>
        <th>размеры</th>
        <th>цена</th>
        <th>количество</th>
        <%--<th>options</th>--%>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.characteristicsByTypeId.typeName}</td>
            <td><c:out value="${item.producerByProducerId.producerName}"/></td>
            <td><img src="${item.image}" class="img_wrap2"></td>
            <td><c:out value="${item.dimensions}"/></td>
            <td><c:out value="${item.characteristic1}"/></td>
            <%--<td><a href="plus" style="margin: 14px">+</a>1<a href="minus" style="margin-left: 14px">-</a></td>--%>
            <td>1</td>
            <td><a href="information_about_good?id=${item.id}" class="c">Подробнее о товаре</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

<br><br><br>
<a href="#zatemnenie"
<c:if test="${CustomersFio == \"-1\"}"> class="disabled" </c:if>
    >Совершить заказ</a>
