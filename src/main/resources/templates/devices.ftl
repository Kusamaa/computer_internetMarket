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
                <#list deviceList as device>
                    <tr>
                        <td style="text-align: center;">${device.deviceId!0}</td>
                        <td style="text-align: center;">${device.deviceType.deviceTypeId!0}</td>
                        <td>${device.getDeviceType().name!""}</td>
                        <td>${device.name!""}</td>
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

<div>Страница ${deviceTypeName}</div>
<p>Выводит все устройства которые продаются на сайте</p>
<div>${(device)}</div>



</body>

</html>
