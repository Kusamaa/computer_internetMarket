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
        <#if hardware??>
<#--          <#list hardware as hardware>-->
            <tr>
              <#--                        <td style="text-align: center;">${device.deviceId!0}</td>-->
              <#--                        <td style="text-align: center;">${device.deviceType.deviceTypeId!0}</td>-->
              <#--                        <td>${device.getDeviceType().name!""}</td>-->
              <td>${hardware.name!""}</td>
              <td style="text-align: center;">${hardware.buyingPrice!0.00}</td>
              <td style="text-align: center;">${hardware.getSellingPrice()!0.00}</td>
              <td>${hardware.description!""}</td>
            </tr>
<#--          </#list>-->
        </#if >

        <#if device??>
          <#list device as device>
            <tr>
              <#--                        <td style="text-align: center;">${device.deviceId!0}</td>-->
              <#--                        <td style="text-align: center;">${device.deviceType.deviceTypeId!0}</td>-->
              <#--                        <td>${device.getDeviceType().name!""}</td>-->
              <td>${device.name!""}</td>
              <td style="text-align: center;">${device.buyingPrice!0.00}</td>
              <td style="text-align: center;">${device.getSellingPrice()!0.00}</td>
              <td>${device.description!""}</td>
            </tr>
          </#list>
        </#if>

        </thead>
      </table>
    </td>

  </tr>
  </tbody>
</table>


</body>

</html>
