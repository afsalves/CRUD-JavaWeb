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
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Farma Alves</title>
    </head>
    <body>
        <img id="logo" src="images/logo.png"alt="Logomarca Farma Alves"/>
        <form action="alterarContMedicamento.jsp?ID=<%=request.getParameter("ID")%>" method="post">
            <input class="form-style" type="text" placeholder="nome_medicamento:" name = "nome_medicamento" value="<%=pb.getNome_medicamento()%>">
            <input class="form-style" type="text" placeholder="preco" name = "preco" value="<%=pb.getPreco()%>">
            <br><br>
            <input id="btn-style" type="submit" value ="Alterar">
        </form>
    </body>
</html>
