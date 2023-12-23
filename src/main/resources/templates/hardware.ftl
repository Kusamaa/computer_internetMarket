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
                <#list hardwareList as hardware>
                    <tr>
<#--                        <td style="text-align: center">${hardware.hardwareId!0}</td>-->
<#--                        <td style="text-align: center">${hardware.hardwareType.hardwareTypeId!0}</td>-->
<#--                        <td>${hardware.getHardwareType().name!""}</td>-->
                        <td><a class="list-link" href="/device?hardwareId=${hardware.hardwareId!0}">${hardware.name!""}</a></td>
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
