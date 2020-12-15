/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

public class UsuarioBean {
    String login;
    private String senha;

    public UsuarioBean(String login,  int id) {
        this.login = login;
        this.id = id;
    }
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public UsuarioBean() {
    }
    
    
}
