<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    MedicamentoBean pb = new MedicamentoBean();
    ControleMedicamento cp = new ControleMedicamento();
    
    pb.setNome_medicamento(request.getParameter("nome_medicamento"));
    pb.setPreco(Float.parseFloat(request.getParameter("preco")));
    pb.setId(cod);
    cp.controlaAlteraMedicamento(pb);
    response.sendRedirect("listaMedicamento.jsp");

%>