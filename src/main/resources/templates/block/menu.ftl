<#-- Freemarker template -->

<!-- sidebar menu -->
<ul class="sidebar-menu" data-widget="tree">
    <li> <a href="/index"> <i class="fa fa-home"></i> <span>Главная</span><span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a></li>

    <#if deviceTypes??>
        <li class="treeview"> <a href="#"> <i class="fa fa-laptop"></i> <span>Устройства</span> <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a>
            <ul class="treeview-menu">
                <li><a href="/devices"><i class="fa fa-angle-right"></i>Все устройства</a></li>
                <#list deviceTypes as deviceType>
                <li><a href="/devices?deviceTypeId=${deviceType.deviceTypeId!0}"><i class="fa fa-angle-right"></i>${deviceType.name!""}</a></li>
                </#list>
            </ul>
        </li>
    </#if>

    <#if hardwareTypes??>
        <li class="treeview"> <a href="#"> <i class="fa fa-keyboard-o"></i> <span>Комплектующие</span> <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a>
            <ul class="treeview-menu">
                <li><a href="/hardwares"><i class="fa fa-angle-right"></i>Все комплектующие</a></li>
                <#list hardwareTypes as hardwareType>
                <li><a href="/hardwares?hardwareTypeId=${hardwareType.hardwareTypeId!0}"><i class="fa fa-angle-right"></i>${hardwareType.name!""}</a></li>
                </#list>
            </ul>
        </li>
    </#if>

    <li> <a href="/help"> <i class="fa fa-info-circle"></i> <span>Справка</span> <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i> </span> </a></li>
</ul>

