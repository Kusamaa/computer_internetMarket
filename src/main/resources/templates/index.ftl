<#-- Freemarker template -->
<html lang="en">
<#include "block/head.ftl">
<body>
<table style="height: 100%">
    <tbody>
    <tr>

        <td rowspan="2" style="width: 200px; vertical-align: top;">
            <#include "block/menu.ftl">
        </td>

        <td style="vertical-align: top">
            <table>
                <thead>

                <tr>
                    <th colspan="4" class="table-header">${headerName}</th>
                </tr>
                </thead>
            </table>
            <h1 class="welcome-header">Добро пожаловать</h1>
            <p class="welcome-text">
<pre>
<h3>Добро пожаловать в наш мир технологий!</h3>
Мы - ваш надежный партнер в сфере высокотехнологичных решений. Наши полки наполнены не только готовыми компьютерами и ноутбуками,
но и всем, что нужно для их улучшения. А ещё мы предлагаем широкий выбор телевизоров, планшетов, клавиатур, мышей и других гаджетов
для вашего комфорта. Доверьтесь нам, и создайте свое пространство высоких технологий!
</pre>
            </p>
        </td>

    </tr>
    </tbody>
</table>

</body>

</html>
