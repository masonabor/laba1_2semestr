<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Casino 777</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .centered {
            text-align: center;
            margin-top: 50px;
        }
        .links {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0; /* Скасовуємо відступи */
            margin: 0; /* Скасовуємо відступи */
        }
        .links a {
            text-decoration: initial;
            text-decoration-style: initial;
            color: rebeccapurple;
            padding: 30px; /* Додайте відступи по бокам посилань */
        }
        h2 {
            font-size: 24px; /* Новий розмір тексту */
        }
        h1 {
            font-size: 36px; /* Новий розмір тексту */
            margin-bottom: 20px;
        }

        img {
            max-width: 60%;
            display: block;
            margin: 0 auto 20px;
        }
    </style>
</head>
<body>
<h1 class="centered">Наша ОП бригада
</h1>
<div class="links">
    <h2><a href="bogdanServlet">Богдан</a></h2>
    <h2><a href="yuriServlet">Юрій</a></h2>
    <h2><a href="vitaliiServlet">Віталій</a></h2>
</div>
<div class="image-container">
    <img src="OP.jpg" alt="">
</div>
</body>
</html>