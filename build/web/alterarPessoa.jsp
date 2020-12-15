
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    PessoaBean pb = new PessoaBean();
    
    ControlePessoa pc = new ControlePessoa();
    pb.setId(cod);
    
    pc.ListaPessoa(pb);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <title>Farma Alves</title>
    </head>
    <body>
        <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>
        <form action="alterarContPessoa.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input class="form-style" type="text" placeholder="nome:" name = "nome" value="<%=pb.getNome()%>">
            <input class="form-style" type="email" placeholder="email:" name = "email" value="<%=pb.getEmail()%>">
            <input class="form-style" type="text" placeholder="cpf:" name = "cpf" value="<%=pb.getCpf()%>">
            <input class="form-style" type="text" placeholder="telefone:" name = "telefone" value="<%=pb.getTelefone()%>">
            <br><br>
            <input id="btn-style" type="submit" value ="Alterar">
        </form>
    </body>
</html>
