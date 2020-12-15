<%@page import="bean.UsuarioBean" %>
<%@page import="controller.ControlaUsuario" %>

<%
  
    UsuarioBean ub = new UsuarioBean();
    ControlaUsuario c = new ControlaUsuario();
    
    ub.setLogin(request.getParameter("login"));
    ub.setSenha(request.getParameter("senha"));
       
    int ID = c.controlaInsercao(ub);
    response.sendRedirect("pessoa.jsp?ID=" + ID);
    
%>