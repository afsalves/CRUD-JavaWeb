<%@page import="controller.ControlaVenda"%>
<%@page import="bean.VendaBean"%>
<%@page import="java.util.List"%>
<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    MedicamentoBean pb = new MedicamentoBean();
    ControleMedicamento pc = new ControleMedicamento();
    List<MedicamentoBean> pass  = pc.ListaMedicamento(pb);
    
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
                  <th>nome</th>
                  <th>preco</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
                  
              </tr>
            </thead>
                <tbody>
                    <!-- esse for continua executando enquanto houver dados na variavel -->
                    <% for (MedicamentoBean pb2 : pass) { %>
                        <tr>
                            <td><%=pb2.getId_medicamento()%></td>
                            <td><%=pb2.getNome_medicamento()%></td>
                            <td><%=pb2.getPreco()%></td>
                            <td><a href="deletaMedicamento.jsp?ID=<%=pb2.getId_medicamento() %>">Excluir</a></td>
                            <td><a href="alterarMedicamento.jsp?ID=<%=pb2.getId_medicamento() %>">Alterar</a></td> 
                        </tr>
                    <% } %>
                </tbody>
        </table>
        <div>       
            <a href="Venda.jsp">Nova Venda</a>
            <a href="listaVenda.jsp">Listar vendas</a>
            <a href="Medicamento.jsp">Cadastrar Novo</a>
            <a href="pessoas.jsp">Voltar para Usuarios</a>
        </div>

    </body>
</html>

