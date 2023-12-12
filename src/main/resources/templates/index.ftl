<#-- Freemarker template -->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>"Компьютерный магазин"</title>

    <style>
        table {
            width: 100%;
            border: 1px solid;
        }
        th {
            border: 1px solid;
            text-align: center;
            /*vertical-align: top;*/
        }

        td {
            border: 1px solid;
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tbody>
    <tr>

        <td>
            <ul>
                <li><a href="/index">Главная</a></li>
                <li><a href="/computers">Готовые компьютеры</a></li>
                <li><a href="/laptops">Ноутбуки</a></li>
                <li><a href="/hardware">Комплектующие</a></li>
                <li><a href="/help">Справка</a></li>
            </ul>
        </td>

        <td>
            <table>
                <thead>

                <tr>
                    <th colspan="7">Название девайса</th>
                </tr>

                <tr>
                    <td>id устройства</td>
                    <td>id типа</td>
                    <td>Тип</td>
                    <td>Название</td>
                    <td>Закупка</td>
                    <td>Продажа</td>
                    <td>Описание</td>
                </tr>

                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                    <td>4</td>
                    <td>5</td>
                    <td>6</td>
                    <td>7</td>
                </tr>
                </thead>
            </table>
        </td>

    </tr>
    </tbody>
</table>

<div>Главная страница с тестовыми переменными:</div>
<p>${whois}</p>
<p>Он любит ${computers}</p>
<a href="/help">2 страница(справка)</a> <#--гиперссылка была до этого, решил не убирать-->
</body>

</html>
