<#-- Freemarker template -->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    // todo - вынести header  в отдельный  ftl-блок
    //      - название страницы сделать переменной и значение ее передавать из бекенда model.addAttribute("header","");
    <title>${header}</title>
    <link href="../style.css" rel="stylesheet" type="text/css">
</head>
<body>
<#include "block/menu.ftl">

<div>Страница ${deviceTypeName}</div>
<p>Выводит все устройства которые продаются на сайте</p>
<div>${(device)}</div>



</body>

</html>
