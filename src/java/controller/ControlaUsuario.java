/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UsuarioBean;
import dao.UsuarioDao;
import java.sql.SQLException;

public class ControlaUsuario {
    
    UsuarioDao ud = new UsuarioDao();
    public int controlaInsercao(UsuarioBean ub) throws SQLException{
       return ud.cadastrarUsuario(ub); 
    }
    public boolean controlaLogin(UsuarioBean ub) throws SQLException{
        return ud.executaLogin(ub);
    }
}
