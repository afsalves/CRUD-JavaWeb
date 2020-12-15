<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    MedicamentoBean pb = new MedicamentoBean();
    ControleMedicamento pc = new ControleMedicamento();
    List<MedicamentoBean> pass  = pc.ListaMedicamento(pb);
    
    PessoaBean cadpb = new PessoaBean();
    ControlePessoa cadpc = new ControlePessoa();
    List<PessoaBean> pess = cadpc.ListarPessoas(cadpb);
    
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
        <form action="cadastravenda.jsp" method="post">
            <select class="select-style" name="tipo_pagamento" id="cars">
                <option value="1">Dinheiro</option>
                <option value="2">Cartão</option>
            </select>
            <input class="form-style" type="text" placeholder="valor" name = "valor">
            <br><br>
            <select class="select-style" name="medicamento">
                <% for (MedicamentoBean pb2 : pass) { %>
                    <option value="<%=pb2.getId_medicamento()%>"><%=pb2.getNome_medicamento()%></option>
                <% } %>
            </select> 
            
            <select class="select-style" name="cliente">
                <% for (PessoaBean cadpb2 : pess) { %>
                    <option value="<%= cadpb2.getId_pessoa()%>"><%=cadpb2.getNome()%></option>
                <% } %>
            </select>  
            
            <input id="btn-style" type="submit" value ="Cadastrar">
        </form>
    </body>
</html>
