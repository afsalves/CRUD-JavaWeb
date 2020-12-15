<%-- 
    Document   : cadastroUsuario
    Created on : 13/10/2020, 21:09:12
    Author     : Aline 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <title>Farma Alves</title>
    </head>
    <body>
        <div>
            <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>
            <form action="usuario.jsp">
                <input class="form-style" type="text" name="login" placeholder="login">
                <input class="form-style" type="text" name="senha" placeholder="senha">
                <input id="btn-style" type="submit" value ="cadastrar">
            </div>    
        </form>
    </body>
</html>
