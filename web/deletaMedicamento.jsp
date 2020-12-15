<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    MedicamentoBean pb = new MedicamentoBean();
    ControleMedicamento cp = new ControleMedicamento();

    pb.setId(cod);
    cp.controlaDeletarMedicamento(pb);
    response.sendRedirect("listaMedicamento.jsp");
%>