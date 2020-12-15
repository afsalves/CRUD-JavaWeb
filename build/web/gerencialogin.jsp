<%@page import="controller.ControlaUsuario"%>
<%@page import="bean.UsuarioBean"%>
<%
    UsuarioBean ub = new UsuarioBean();
    ControlaUsuario cu = new ControlaUsuario();
    
    ub.setLogin(request.getParameter("login"));
    ub.setSenha(request.getParameter("senha"));
    
    if(cu.controlaLogin(ub) == true){
        response.sendRedirect("pessoas.jsp?ID="+ ub.getId() );
    }else{
        String errou = "Erro ao logar";
        response.sendRedirect("logar.jsp?errou="+errou);
    }

%>
