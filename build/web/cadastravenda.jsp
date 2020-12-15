<%@page import="controller.ControlaVenda"%>
<%@page import="bean.VendaBean"%>
<!-- Importa as classes para que o  html o reconheça -->
<%  
        
    VendaBean pv = new VendaBean();
    ControlaVenda cv = new ControlaVenda();
    
    pv.setMedicamento_id_venda(Integer.parseInt(request.getParameter("medicamento")));
    pv.setUser_id_venda(Integer.parseInt(request.getParameter("cliente")));
    pv.setModo_pagamento(request.getParameter("tipo_pagamento"));
    pv.setValor(Float.parseFloat(request.getParameter("valor")));
    
    cv.cadastraMedicamento(pv);
    
    //Redireciona para outra tela assim que o metodo terminar sua execução
    response.sendRedirect("listaMedicamento.jsp");

%>

