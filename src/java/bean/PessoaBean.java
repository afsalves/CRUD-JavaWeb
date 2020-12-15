/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


//Responsavel por carregar os valores das variaveis e passar pelos arquivos dos programas 
public class PessoaBean extends UsuarioBean{
    //Seta as variaveis em private pois as variaveis não poderam ser modificadas 
    private int id_pessoa;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    
    //metodos construtores são metodos que são executados assim que o programa é chamado eles já passam o valor 
    //de imediato 
    public PessoaBean(String login, int id) {
        super(login, id);
    }
    //DICA cria um vazio que não da problema
    public PessoaBean() {

    }

    public PessoaBean(int id_pessoa, String nome, String cpf, String email, String telefone, String login, int id) {
        super(login, id);
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    //Metodo de acesso get serve para passar o valor que esta contido dentro da variavel
    public int getId_pessoa() {
        return id_pessoa;
    }
    //Metodo de acesso get serve para pegar o valor que sera passado geralmente pelo usuario
    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    //Serve para todos
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
