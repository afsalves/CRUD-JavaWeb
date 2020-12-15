<%@page import="controller.ControleMedicamento"%>
<%@page import="bean.MedicamentoBean"%>
<!-- Importa as classes para que o  html o reconheça -->
<%  
    
    //Variavel pega o valor da url para ser passado para o java dentro da variavel id
    String id = request.getParameter("ID");
    
    //Cria os metodos de controller e Bean
    MedicamentoBean pb = new MedicamentoBean();
    ControleMedicamento cp = new ControleMedicamento();
    
    
    //Seta os valores 
    pb.setNome_medicamento(request.getParameter("nome_medicamento"));
    pb.setPreco(Float.parseFloat(request.getParameter("preco")));
    
    //Chama o metodo do controler que pega os dados e passa para DAO para ser executado no banco 
    cp.cadastraMedicamento(pb);
    
    //Redireciona para outra tela assim que o metodo terminar sua execução
    response.sendRedirect("listaMedicamento.jsp");

%>
