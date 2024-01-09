<#-- Freemarker template -->

<!-- sidebar menu -->
<ul class="sidebar-menu" data-widget="tree">
    <li class="header"><a href="/index"> <i class="fa fa-bath"></i> <span>Главная</span> </a></li>
    <#if deviceTypes??>
        <#--    перебирать список DeviceType -->
        <li class="active treeview"> <a href="#"> <i class="icon-home"></i> <span>Устройства</span> <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a>
            <ul class="treeview-menu">
                <li class="active"><a href="/devices"><i class="fa fa-angle-right"></i> Все</a></li>
                <#list deviceTypes as deviceType>
                    <li><a href="/devices?deviceTypeId=${deviceType.deviceTypeId!0}"><i class="fa fa-angle-right"></i> ${deviceType.name!""}</a></li>
                </#list>
            </ul>
        </li>
    </#if>
    <#if hardwareTypes??>
    <#--    перебирать список DeviceType -->
        <li class="active treeview"> <a href="#"> <i class="icon-home"></i> <span>Комплектующие</span> <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a>
            <ul class="treeview-menu">
                <li class="active"><a href="/hardwares"><i class="fa fa-angle-right"></i> Все</a></li>
                <#list hardwareTypes as hardwareType>
                    <li><a href="/hardwares?hardwareTypeId=${hardwareType.hardwareTypeId!0}"><i class="fa fa-angle-right"></i> ${hardwareType.name!""}</a></li>
                </#list>
            </ul>
        </li>
    </#if>
    <li class="header"><a href="/help"> <i class="ti-help-alt"></i> <span>Справка</span> </a></li>
</ul>

