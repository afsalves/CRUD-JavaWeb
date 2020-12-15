<%@page import="java.util.List"%>
<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    PessoaBean pb = new PessoaBean();
    ControlePessoa pc = new ControlePessoa();
    List<PessoaBean> pess = pc.ListarPessoas(pb);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="listaMedicamento.jsp">Lista de Medicamentos</a>
        <table>
            <thead>
              <tr>
                  <th>Id</th>
                  <th>Nome</th>
                  <th>Telefone</th>
                  <th>Cpf</th>
                  <th>Email</th>
                  <th>Id usuario</th>
                  <th>login</th>
                  
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
                  
              </tr>
            </thead>
                <tbody>
                    <!-- esse for continua executando enquanto houver dados na variavel -->
                    <% for (PessoaBean pb2 : pess) { %>
                        <tr>
                            <td><%=pb2.getId_pessoa()%></td>
                            <td><%=pb2.getNome()%></td>
                            <td><%=pb2.getTelefone()%></td>
                            <td><%=pb2.getCpf()%></td>
                            <td><%=pb2.getEmail()%></td>
                            <td><%=pb2.getId()%></td>
                            <td><%=pb2.getLogin()%></td>
                            <td><a href="deletaPessoa.jsp?ID=<%=pb2.getId_pessoa() %>">Excluir</a></td>
                            <td><a href="alterarPessoa.jsp?ID=<%=pb2.getId_pessoa() %>">Alterar</a></td> 
                        </tr>
                    <% } %>
                </tbody>
        </table>
              <a href="cadastroUsuario.jsp">Novo Usuario</a>
    </body>
</html>
