<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <title>Farma Alves</title>
    </head>
    <body>
       <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>
        <%
            //Esse abre e fecha é o modo que o html reconhece que o que será passado a seguir é um codigo java
            //<%=request.getParameter("ID") passa para o link o id da pessoa pela url  
        %>
        <form action="cadastropessoa.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input class="form-style" type="text" placeholder="nome:" name = "nome">
            <input class="form-style" type="email" placeholder="email:" name = "email">
            <input class="form-style" type="text" placeholder="cpf:" name = "cpf">
            <input class="form-style" type="text" placeholder="telefone:" name = "telefone">
            <br><br>
            <input id="btn-style" type="submit" value ="Cadastrar">
        </form>
    </body>
</html>
