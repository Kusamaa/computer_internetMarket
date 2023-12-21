<#-- Freemarker template -->
<ul>
    <li><a href="/index">Главная</a></li>
    <#if deviceTypes??>
        <li>Устройства</li>
            <ul>
                <#--    перебирать список DeviceType -->
                <#list deviceTypes as deviceType>
                    <li class="device-type"><a href="/device?deviceTypeId=${deviceType.deviceTypeId!0}">${deviceType.name!""}</a></li>
                </#list>
            </ul>
    </#if>
    <li><a href="/hardware">Комплектующие</a></li>
    <li><a href="/hardware?hardwareTypeId=1">Гарнитура</a></li>
    <li><a href="/hardware?hardwareTypeId=3">Монитор</a></li>
    <li><a href="/help">Справка</a></li>
</ul>

