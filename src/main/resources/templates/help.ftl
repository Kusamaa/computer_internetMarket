<#-- Freemarker template -->
<html lang="en">
<#include "block/head.ftl">
<body>
<table>
    <tbody>
    <tr>

        <td rowspan="2" style="width: 200px;">
            <#include "block/menu.ftl">
        </td>

        <td style="vertical-align: top">
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

<div>Страница "справка"</div>
<p>Тут будут ответы на частые вопросы или что-то в этом духе</p>
</body>

</html>
