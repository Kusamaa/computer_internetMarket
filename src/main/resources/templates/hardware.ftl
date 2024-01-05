<#-- Freemarker template -->
<html lang="en">
<#include "block/head.ftl">


<body class="skin-blue sidebar-mini">

<div class="wrapper boxed-wrapper">
    <header class="main-header">
        <!-- Logo -->
        <#--        <a href="index-2.html" class="logo blue-bg">-->
        <#--            <!-- mini logo for sidebar mini 50x50 pixels &ndash;&gt;-->
        <#--            <span class="logo-mini"><img src="dist/img/logo-n.png" alt=""></span>-->
        <#--            <!-- logo for regular state and mobile devices &ndash;&gt;-->
        <#--            <span class="logo-lg"><img src="dist/img/logo.png" alt=""></span> </a>-->
        <!-- Header Navbar -->
        <nav class="navbar blue-bg navbar-static-top">
            <!-- Sidebar toggle button-->
            <ul class="nav navbar-nav pull-left">
                <li><a class="sidebar-toggle" data-toggle="push-menu" href="#"></a> </li>
            </ul>
            <!-- Content Header (Page header) -->
            <div class="pull-left content-header sty-one store_name">
                <h1>Магазин электроники Kusamaa (${headerName})</h1>
                <#--            <ol class="breadcrumb">-->
                <#--                <li><a href="#">Home</a></li>-->
                <#--                <li><i class="fa fa-angle-right"></i> Modern Dashboard</li>-->
                <#--            </ol>-->
            </div>


            <div class="navbar-custom-menu">
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar -->
        <div class="sidebar">
            <#include "block/menu.ftl">
        </div>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <#--        <!-- Content Header (Page header) &ndash;&gt;-->
        <#--        <div class="content-header sty-one">-->
        <#--            <h1>Магазин электроники Кусамаа</h1>-->
        <#--&lt;#&ndash;            <ol class="breadcrumb">&ndash;&gt;-->
        <#--&lt;#&ndash;                <li><a href="#">Home</a></li>&ndash;&gt;-->
        <#--&lt;#&ndash;                <li><i class="fa fa-angle-right"></i> Modern Dashboard</li>&ndash;&gt;-->
        <#--&lt;#&ndash;            </ol>&ndash;&gt;-->
        <#--        </div>-->
        <!-- Main content -->
        <div class="content">
            <div class="row">

            <div class="col-lg-4">
                <img src="dist/img/${hardware.hardwareId!0}(hardware).jpg" alt="Фото товара" style="height: 500px; width: 500px">
            </div>

            <div class="col-lg-8">
                <td style="vertical-align: top">
                    <div class="row">

                        <div class="col-lg-10">
                            <table>
                                <tr>
                                    <td>Название</td>
                                    <td>${hardware.name!""}</td>
                                </tr>

                                <tr>
                                    <td>Описание</td>
                                    <td>${hardware.description!""}</td>
                                </tr>
                            </table>
                        </div>

                        <div class="col-lg-2">
                            <table>
                                <tr>
                                    <td style="text-align: center;">Закупка</td>
                                </tr>

                                <tr>
                                    <td style="text-align: center;">${hardware.buyingPrice!0.00}</td>
                                </tr>

                                <tr>
                                    <td style="text-align: center;">Продажа</td>
                                </tr>

                                <tr>
                                    <td style="text-align: center;">${hardware.getSellingPrice()!0.00}</td>
                                </tr>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    <#include "block/footer.ftl">
</div>
<!-- ./wrapper -->
<#include "block/footer_js.ftl">
</body>

</html>
