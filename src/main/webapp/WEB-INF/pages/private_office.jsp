<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>личный кабинет</title>
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
        #zatemnenie1 {
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
        #okno1 {
            width: 300px;
            height: 200px;
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
        #zatemnenie1:target {display: block;}
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


        .img_wrap {
            width: 200px;
            height: 100px;
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
            box-shadow: 0 0 5px rgba(0,0.4,0,0.3); /* Тень */
            background: linear-gradient(to bottom, #fcfff4, #e9bca2); /* Градиент */
            color: #060606;
        }
    </style>

</head>
<body>


<div id="zatemnenie">
    <div id="okno">

        <form:form id="formCreate" modelAttribute="NewCustomer" method="post" action="new_customer_registration">
            Заполните данные для регистрации:<br>
            <form:input path="login" placeholder="Логин" class="c"/><br><br>
            <form:input path="pasword" placeholder="Пароль" class="c"/><br><br>
            <form:input path="fio" placeholder="ФИО" class="c"/><br><br><br>
            <button type="submit" class="c">Зарегистрироваться</button>
        </form:form>
        <br>
        <a href="#" class="close">Закрыть окно</a>
    </div>
</div>


<div id="zatemnenie1">
    <div id="okno1">

        <form:form id="formCreate" modelAttribute="NewCustomer" method="post" action="customer_login">
            Вход:<br>
            <form:input path="login" placeholder="Логин" class="c"/><br><br>
            <form:input path="pasword" placeholder="Пароль" class="c"/><br><br><br>
            <button type="submit" class="c">Войти</button>
        </form:form>
        <a href="#" class="close">Закрыть окно</a>
    </div>
</div>



<a href="go_to_main_page"><img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">
</a>

<%--<%= if() %>--%>
<c:if test="${CustomersFio == \"-1\"}">
    <a href="#zatemnenie" style="margin-left: 40px">Регистрация</a>
    <a href="#zatemnenie1">/Вход</a>
</c:if>

<%--<br>--%>
<c:if test="${CustomersFio != \"-1\"}">
    <c:out value="${CustomersFio}"/>
    <a href="logout" style="margin-left: 40px">Выйти</a>
</c:if>

<a href="go_to_basket"><img src="https://st.depositphotos.com/1327054/3697/i/950/depositphotos_36977035-stock-photo-full-wastebasket.jpg"
                            width="80"
                            height="50" alt="Пример" style="margin-left: 40px"></a>



<c:if test="${CustomersFio != \"-1\"}">
<h4>Таблица заказов:</h4>

<table border="2px">
    <tr>
        <th>№ заказа</th>
        <th>стоймость заказа</th>
        <th>дата заказа</th>
        <th>подробнее</th>
    </tr>
    <%--
    for(Idea item : list ){
    ...
    }
    --%>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.orderId}</td>
            <td><c:out value="${item.totalCost}"/></td>
            <td><c:out value="${item.dateOfOrder}"/></td>
            <td><c:out value="кнопки"/></td>
            <td><a href="information_about_order?id=${item.orderId}" class="c">информация о заказе</a></td>

        </tr>
    </c:forEach>
</table>
</c:if>


<form:form id="formFind" action="">

<%----     <a href="login" class="c">стиральные машины</a>--%>
<%----     <a href="registration" class="c">холодильники</a>--%>


</form:form>

</body>
</html>
