<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Добро пожаловать в наш магаз, козлы))</title>
    <style>
        .c {
            border: 1px solid #333; /* Рамка */
            display: inline-block;
            padding: 5px 15px; /* Поля */
            text-decoration: none; /* Убираем подчёркивание */
            color: #000; /* Цвет текста */
        }
        .c:hover {
            box-shadow: 0 0 5px rgba(0,0,0,0.3); /* Тень */
            background: linear-gradient(to bottom, #fcfff4, #e9e9ce); /* Градиент */
            color: #a00;
        }

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
    <meta http-equip="content-type" content="text/html" charset="utf-8">
</head>
<body>
<%--<form:form id="formCreate" modelAttribute="newGood" method="post" action="main02">--%>
    <%--Название ээээ--%>
    <%--<form:input path="id"/>--%>
    <%--размер--%>
    <%--<form:input path="dimensions"/>--%>
    <%--задайте characteristic1--%>
    <%--<form:input path="characteristic1"/>--%>
    <%--задайте фото--%>
    <%--<form:input path="image"/>--%>
    <%--<button type="submit">Сохранить</button>--%>
<%--</form:form>--%>

<form:form id="formFind" modelAttribute="serch" action="product_selection_filtered">
    <img src="https://www.rateshops.ru/info/images/site/cache/0f/10/0f10d3c01db3fd1aa4ad9ced6a4bad91.png" class="img_wrap" alt="vertical">

    <form:input path="str" placeholder="поиск товаров" style="margin-left: 40px"/>
    <button type="submit">Искать</button>
    <a href="go_to_private_office" class="s1" style="margin-left: 40px">Личный Кабинет</a>

    <a href="go_to_basket"><img src="https://st.depositphotos.com/1327054/3697/i/950/depositphotos_36977035-stock-photo-full-wastebasket.jpg"
                              width="80"
                              height="50" alt="Пример" style="margin-left: 40px"></a>
</form:form>

<a href="find_by_type_name_Washer" class="c">стиральные машины</a>
<a href="find_by_type_name_Refrigerators" class="c">холодильники</a>
<a href="find_by_type_name_Ovens" class="c">духовки</a>
<a href="find_by_type_name_Cleaners" class="c">пылесосы</a>
<a href="find_by_type_name_TVs" class="c">телевизоры</a>


<%--<form2:form id="formFind" modelAttribute="serch" action="find_by_type_name_Washer">--%>
    <%--<button type="button">стиральные машины</button>--%>
<%--</form2:form>--%>

<%--<form2:form id="formFind" modelAttribute="serch" action="find_by_type_name_Refrigerators">--%>
    <%--<button type="button">холодильники</button>--%>
<%--</form2:form>--%>

<%--<form2:form id="formFind" modelAttribute="serch" action="find_by_type_name_Ovens">--%>
    <%--<button type="button">духовки</button>--%>
<%--</form2:form>--%>

<%--<form2:form id="formFind" modelAttribute="serch" action="find_by_type_name_Cleaners">--%>
    <%--<button type="button">пылесосы</button>--%>
<%--</form2:form>--%>

<%--<form2:form id="formFind" modelAttribute="serch" action="find_by_type_name_TVs">--%>
    <%--<button type="button">телевизоры</button>--%>
<%--</form2:form>--%>

<%--<a href="#" class="c">Комментировать</a>--%>



<%--<input type="button" value="стриралки1" action="find_by_type_name" lin/>--%>

<%--<button content="стриралки" type="button" form="rmj"--%>

</body>
</html>
