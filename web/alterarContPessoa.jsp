<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    PessoaBean pb = new PessoaBean();
    ControlePessoa cp = new ControlePessoa();
    
    pb.setNome(request.getParameter("nome"));
    pb.setEmail(request.getParameter("email"));
    pb.setCpf(request.getParameter("cpf"));
    pb.setTelefone(request.getParameter("telefone"));
    pb.setId(cod);
    cp.controlaAlteraPessoa(pb);
    response.sendRedirect("pessoas.jsp");

%>