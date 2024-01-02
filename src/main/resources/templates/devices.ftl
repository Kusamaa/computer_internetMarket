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

                <tr>
                    <td>Название</td>
                    <td>Закупка</td>
                    <td>Продажа</td>
                    <td>Описание</td>
                </tr>
                <#list deviceList as device>
                    <tr>
                        <td><a class="list-link" href="/device?deviceId=${device.deviceId!0}">${device.name!""}</a></td>
                        <td style="text-align: center;">${device.buyingPrice!0.00}</td>
                        <td style="text-align: center;">${device.getSellingPrice()!0.00}</td>
                        <td>${device.description!""}</td>
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