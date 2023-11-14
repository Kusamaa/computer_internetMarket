<#-- Freemarker template -->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>"Ноутбуки"</title>
</head>
<body>
<#include "block/menu.ftl">

<div>Страница ${deviceTypeName}</div>
<p>Выводит все устройства которые продаются на сайте</p>
<div>${(device)}</div>



</body>

</html>
