<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <title>Farma Alves</title>
    </head>
    <body>
        <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>
        <form action="cadastraMedicamento.jsp" method="post">
            <input class="form-style" type="text" placeholder="Nome Medicamento:" name = "nome_medicamento">
            <input class="form-style" type="number" placeholder="Preco:" name = "preco">
            <br><br>
            <input id="btn-style" type="submit" value ="Cadastrar">
        </form>
    </body>
</html>
