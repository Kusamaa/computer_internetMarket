<#-- Freemarker template -->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>"Компьютерный магазин"</title>
</head>
<body>
<ul>
    <li><a href="/index">Главная</a></li>
    <li><a href="/computers">Готовые компьютеры</a></li>
    <li><a href="/laptops">Ноутбуки</a></li>
    <li><a href="/hardware">Комплектующие</a></li>
    <li><a href="/help">Справка</a></li>
</ul>
<div>Главная страница с тестовыми переменными:</div>
<p>${whois}</p>
<p>Он любит ${computers}</p>
<a href="/help">2 страница(справка)</a> <#--гиперссылка была до этого, решил не убирать-->
</body>

</html>
