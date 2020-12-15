<!-- Importa as classes para que o  html o reconheça -->
<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%
    //Variavel pega o valor da url para ser passado para o java dentro da variavel id
    String id = request.getParameter("ID");
    //Converte ela com o Integer.parseInt pois o que é passado pela url é uma string
    //OBS: Só é necessario a conversão se o tipo da variavle for incompativel
    int cod = Integer.parseInt(id);
    
    //Cria os metodos de controller e Bean
    PessoaBean pb = new PessoaBean();
    ControlePessoa cp = new ControlePessoa();
    
    
    //Seta os valores 
    pb.setNome(request.getParameter("nome"));
    pb.setEmail(request.getParameter("email"));
    pb.setCpf(request.getParameter("cpf"));
    pb.setTelefone(request.getParameter("telefone"));
    pb.setId(cod);
    
    //Chama o metodo do controler que pega os dados e passa para DAO para ser executado no banco 
    cp.controlaCadastroPessoa(pb);
    
    //Redireciona para outra tela assim que o metodo terminar sua execução
    response.sendRedirect("pessoas.jsp");

%>
