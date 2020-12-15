<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    MedicamentoBean pb = new MedicamentoBean();
    
    ControleMedicamento pc = new ControleMedicamento();
    pb.setId(cod);
    
    pc.listarMedicamento(pb);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Farma Alves</title>
    </head>
    <body>
        <h1>Cadastrar Medicamento</h1>
        <form action="alterarContMedicamento.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input type="text" placeholder="nome_medicamento:" name = "nome_medicamento" value="<%=pb.getNome_medicamento()%>">
            <input type="text" placeholder="preco" name = "preco" value="<%=pb.getPreco()%>">
            <br><br>
            <input type="submit" value ="Alterar">
        </form>
    </body>
</html>
