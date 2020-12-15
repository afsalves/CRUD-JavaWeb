package bean;

public class VendaBean {

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

    private int user_id_venda;
    private int medicamento_id_venda;
    private int id;
    private float valor;
    private String modo_pagamento;
    private String nome;
    private String telefone;
    private String nome_medicamento;
    
    public VendaBean(){
    }

    public VendaBean(int id, float valor, String nome_medicamento, String nome, String telefone, String modo_pagamento) {
        this.id = id;
        this.valor = valor;
        this.nome_medicamento = nome_medicamento;
        this.nome = nome;
        this.telefone = telefone;
        this.modo_pagamento = modo_pagamento;
    }
        
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the user_id_venda
     */
    
   
    

    
    public int getUser_id_venda() {
        return user_id_venda;
    }

    /**
     * @param user_id_venda the user_id_venda to set
     */
    public void setUser_id_venda(int user_id_venda) {
        this.user_id_venda = user_id_venda;
    }

    /**
     * @return the medicamento_id_venda
     */
    public int getMedicamento_id_venda() {
        return medicamento_id_venda;
    }

    /**
     * @param medicamento_id_venda the medicamento_id_venda to set
     */
    public void setMedicamento_id_venda(int medicamento_id_venda) {
        this.medicamento_id_venda = medicamento_id_venda;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the modo_pagamento
     */
    public String getModo_pagamento() {
        return modo_pagamento;
    }

    /**
     * @param modo_pagamento the modo_pagamento to set
     */
    public void setModo_pagamento(String modo_pagamento) {
        this.modo_pagamento = modo_pagamento;
    }
    
}
