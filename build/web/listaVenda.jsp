<%@page import="controller.ControlaVenda"%>
<%@page import="bean.VendaBean"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    VendaBean vb = new VendaBean();
    ControlaVenda cv = new ControlaVenda();
    List<VendaBean> listVenda  = cv.ListaVenda(vb);
    
%>
<!DOCTYPE html>
<html>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/pessoa.css" type="text/css"/>
        <title>Farma Alves</title>
    </head>
    <body> 
        <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>

        <table>
            <thead>
              <tr>
                  <th>Id</th>
                  <th>Fone Cliente</th>
                  <th>Nome</th>
                  <th>Preço</th>
                  <th>Medicamento</th>
                  <th>Forma PGTO</th>
                  
              </tr>
            </thead>
                <tbody>
                    <!-- esse for continua executando enquanto houver dados na variavel -->
                    <% for (VendaBean vb2 : listVenda) { %>
                        <tr>
                            <td><%=vb2.getId()%></td>
                            <td><%=vb2.getTelefone()%></td>
                            <td><%=vb2.getNome()%></td>
                            <td><%=vb2.getValor()%></td>
                            <td><%=vb2.getNome_medicamento()%></td>
                            <td><%= Integer.parseInt(vb2.getModo_pagamento()) == 1 ? "Dinheiro" : "Cartão" %> </td>
                        </tr>
                    <% } %>
                </tbody>
        </table>     
        <div>       
            <a href="Venda.jsp">Nova Venda</a>
            <a href="Medicamento.jsp">Cadastrar Medicamento</a>
            <a href="pessoas.jsp">Voltar para Usuarios</a>
        </div>        
    </body>
</html>

