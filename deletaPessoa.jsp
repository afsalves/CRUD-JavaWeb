<%@page import="controller.ControlePessoa"%>
<%@page import="bean.PessoaBean"%>
<%
    String id = request.getParameter("ID");
    int cod = Integer.parseInt(id);
    PessoaBean pb = new PessoaBean();
    ControlePessoa cp = new ControlePessoa();

    pb.setId(cod);
    cp.controlaDeletarPessoa(pb);
    response.sendRedirect("pessoas.jsp");
%>