<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP PAGE</title>
    </head>
    <body>
        <h1>Cadastrar Medicamento</h1>
        <form action="cadastraMedicamento.jsp" method="post">
            <input type="text" placeholder="nome_medicamento:" name = "nome_medicamento">
            <input type="number" placeholder="Preco:" name = "preco">
            <br><br>
            <input type="submit" value ="Cadastrar">
        </form>
    </body>
</html>