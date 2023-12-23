<#-- Freemarker template -->
<html lang="en">
<#include "block/head.ftl">
<body>
<table>
    <tbody>
    <tr>

        <td rowspan="2" style="width: 200px; vertical-align: top;">
            <#include "block/menu.ftl">
        </td>

        <td style="vertical-align: top">
            <table>
                <thead>

                <tr>
                    <th colspan="4">${headerName}</th>
                </tr>

                <tr>
<#--                    <td>id устройства</td>-->
<#--                    <td>id типа</td>-->
<#--                    <td>Тип</td>-->
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
<#--                    <td>5</td>-->
<#--                    <td>6</td>-->
<#--                    <td>7</td>-->
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
