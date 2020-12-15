<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar pessoa</h1>
        <%
            //Esse abre e fecha é o modo que o html reconehce que o que será passado a seguir é um codigo java
            //<%=request.getParameter("ID") passa para o link o id da pessoa pela url  
        %>
        <form action="cadastropessoa.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input type="text" placeholder="nome:" name = "nome">
            <input type="email" placeholder="email:" name = "email">
            <input type="text" placeholder="cpf:" name = "cpf">
            <input type="text" placeholder="telefone:" name = "telefone">
            <br><br>
            <input type="submit" value ="Cadastrar">
        </form>
    </body>
</html>
