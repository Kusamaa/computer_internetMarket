<#-- Freemarker template -->
<html lang="en">
<#include "block/head.ftl">
<body>
<table style="height: 100%">
    <tbody>
    <tr>

        <td rowspan="2" style="width: 200px; vertical-align: top;">
            <#include "block/menu_0.ftl">
        </td>

        <td style="vertical-align: top">
            <table>
                <thead>

                <tr>
                    <th colspan="4" class="table-header">${headerName}</th>
                </tr>

                <tr>
                    <td>Название</td>
                    <td>Закупка</td>
                    <td>Продажа</td>
                    <td>Описание</td>
                </tr>

                <#list hardwareList as hardware>
                    <tr>
                        <td><a class="list-link" href="/hardware?hardwareId=${hardware.hardwareId!0}">${hardware.name!""}</a></td>
                        <td style="text-align: center">${hardware.buyingPrice!0.00}</td>
                        <td style="text-align: center">${hardware.sellingPrice!0.00}</td>
                        <td>${hardware.description!""}</td>
                    </tr>
                </#list>
                </thead>
            </table>
        </td>

    </tr>
    </tbody>
</table>

</body>

</html>
