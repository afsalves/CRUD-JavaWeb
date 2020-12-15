/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


//Responsavel por carregar os valores das variaveis e passar pelos arquivos dos programas 
public class MedicamentoBean extends UsuarioBean{

    
    //Seta as variaveis em private pois as variaveis não poderam ser modificadas 
    private int id_medicamento;
    private Float preco;
    private String nome_medicamento;

    public MedicamentoBean(int id_medicamento, Float preco, String nome_medicamento) {
        this.id_medicamento = id_medicamento;
        this.preco = preco;
        this.nome_medicamento = nome_medicamento;
    }
    
    //metodos construtores são metodos que são executados assim que o programa é chamado eles já passam o valor 
    //de imediato 
    public MedicamentoBean(String login, int id) {
        super(login, id);
    }
    //DICA cria um vazio que não da problema
    public MedicamentoBean() {

    }

    public MedicamentoBean(int aInt, String string, float aFloat, String string0) {
        
    }
 
    //Metodo de acesso get serve para passar o valor que esta contido dentro da variavel
    public int getId_medicamento() {
        return id_medicamento;
    }
    
    //Metodo de acesso get serve para pegar o valor que sera passado geralmente pelo usuario
    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }
    //Serve para todos
 
    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    /**
     * @return the nome_medicamento
     */
    public String getNome_medicamento() {
        return nome_medicamento;
    }

    /**
     * @param nome_medicamento the nome_medicamento to set
     */
    public void setNome_medicamento(String nome_medicamento) {
        this.nome_medicamento = nome_medicamento;
    }
    
 
}
