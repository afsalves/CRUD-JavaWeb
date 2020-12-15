
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar pessoa</h1>
        <form action="alterarContPessoa.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input type="text" placeholder="nome:" name = "nome" value="<%=pb.getNome()%>">
            <input type="email" placeholder="email:" name = "email" value="<%=pb.getEmail()%>">
            <input type="text" placeholder="cpf:" name = "cpf" value="<%=pb.getCpf()%>">
            <input type="text" placeholder="telefone:" name = "telefone" value="<%=pb.getTelefone()%>">
            <br><br>
            <input type="submit" value ="Alterar">
        </form>
    </body>
</html>
