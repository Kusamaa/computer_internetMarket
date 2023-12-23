<#-- Freemarker template -->
<ul class="menu-wrapper">
    <li class="menu-items"><a href="/index">Главная</a></li>
    <#if deviceTypes??>
        <li class="menu-items"><a href="/devices">Устройства</a></li>
            <ul>
                <#--    перебирать список DeviceType -->
                <#list deviceTypes as deviceType>
                    <li class="menu-items-subitems"><a href="/devices?deviceTypeId=${deviceType.deviceTypeId!0}">${deviceType.name!""}</a></li>
                </#list>
            </ul>
    </#if>
    <#if hardwareTypes??>
        <li class="menu-items"><a href="/hardware">Комплектующие</a></li>
            <ul>
                <#list hardwareTypes as hardwareType>
                    <li class="menu-items-subitems"><a href="/hardware?harwareTypeId=${hardwareType.hardwareTypeId!0}">${hardwareType.name!""}</a></li>
                </#list>
            </ul>
    </#if>
    <li class="menu-items"><a href="/help">Справка</a></li>
</ul>

