/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexao.Conexao;
import bean.UsuarioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UsuarioDao {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    public int cadastrarUsuario(UsuarioBean ub) throws SQLException {
        Connection con = Conexao.Conectar();
        String sql = "insert into usuario (login,senha) values (?,?)";
        
        stmt = con.prepareStatement(sql);
        stmt.setString(1, ub.getLogin());
        stmt.setString(2, ub.getSenha());
       
        
        stmt.executeUpdate();
        
        return verificaLogin(ub);
    }
    public boolean executaLogin(UsuarioBean ub) throws SQLException{
        
        Connection con = Conexao.Conectar();
        String sql = "select * from usuario where login = ? and senha = ?";
        boolean logado = false;
        stmt = con.prepareStatement(sql);
        stmt.setString(1, ub.getLogin());
        stmt.setString(2, ub.getSenha());
        rs = stmt.executeQuery();
        
        //if verifica se existe esse valores passados no banco
        if(rs.next()){
            //se sim retorna true e é logado
            logado = true;
            ub.setId(rs.getInt("id"));
        }else{
            logado = false;
        }
        //retorna a resposta
        return logado;
    }
    
    //Metodo retorna um boolean caso o login e senha exixtam
    public int verificaLogin (UsuarioBean ub) throws SQLException{
        
        Connection con = Conexao.Conectar();
        String sql = "select * from usuario where login = ? and senha = ?";
        boolean logado = false;
        stmt = con.prepareStatement(sql);
        stmt.setString(1, ub.getLogin());
        stmt.setString(2, ub.getSenha());
        rs = stmt.executeQuery();
        //retorna a resposta
        //if verifica se existe esse valores passados no banco
        int ID = 0;
        if(rs.next()){
            //se sim retorna true e é logado
            ID = rs.getInt("id");
        }else{
            logado = false;
        }
        return ID;
    }
    
}
