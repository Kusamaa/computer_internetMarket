<#-- Freemarker template -->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>"Комплектующие"</title>
</head>
<body>

<table border="1" style="width: 100%;">
    <tr>
        <td rowspan="2" style="width: 200px;">
            <#include "block/menu.ftl">
        </td>
        <td><div style="text-align: center">Название девайса</div></td>
    </tr>
    <tr>
<#--        <td></td>-->
        <td style="vertical-align: baseline">
            <table border="1" width="100%">
                <tr style="text-align: center; background: lightgrey;">
                    <td>id устройства</td>
                    <td>id типа</td>
                    <td>Тип</td>
                    <td>Название</td>
                    <td>Закупка</td>
                    <td>Продажа</td>
                    <td>Описание</td>
                </tr>
                <tr>
                    <td style="text-align: center;">1</td>
                    <td style="text-align: center;">2</td>
                    <td>3</td>
                    <td>4</td>
                    <td style="text-align: center;">5</td>
                    <td style="text-align: center;">6</td>
                    <td>7</td>
                </tr>
            </table>
        </td>
    </tr>
</table>

</body>

</html>
