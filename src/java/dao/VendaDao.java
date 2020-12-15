/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MedicamentoBean;
import bean.VendaBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VendaDao {
    //uma variavel do java que armazena o preparar de uma query sql
    PreparedStatement stmt = null;
    //uma variavel do java que armazena os resultados vindos do banco de dados
    ResultSet rs = null;
    //Objeto da conexão
    Connection con = Conexao.Conectar();

    //Metodo que cadastra uma pessoa no banco e passa como parametro a variavel bem que esta armazenada os valores digitados pelo usuario
    public void cadastraMedicamento(VendaBean vb) throws SQLException{
        //Variavel que carrega a string da query que vai ser executada
        //O pondo de interrogação significa que naquela query o que foi o ponto vai ser substituido pelo valor digitado 
        String query = "insert into venda (user_id_venda,medicamento_id_venda,modo_pagamento,valor) values (?,?,?,?)";
        
        stmt = con.prepareStatement(query);
        
        stmt.setInt(1, vb.getUser_id_venda());
        stmt.setInt(2, vb.getMedicamento_id_venda());
        stmt.setString(3, vb.getModo_pagamento());
        stmt.setFloat(4, vb.getValor());
                
        stmt.executeUpdate();
    }
    
    public List<VendaBean> selecionaVenda(VendaBean vb) throws SQLException{
        String query = "SELECT * FROM venda inner join usuario as u on user_id_venda = id inner join medicamento as m on medicamento_id_venda = id_medicamento inner join pessoa as pp on pp.id_pessoa = id;";
        //Cria um metodo de pessoa que vai cerregar essa lista
        List<VendaBean> Venda = new ArrayList<>();
        stmt = con.prepareStatement(query);
        //Executa e com o metodo ResultSet armazena o que foi pego pelo banco
        rs = stmt.executeQuery();
        //Caso exista ele continuara rodando até acabar as linhas
        while(rs.next()){
            VendaBean pb2 = new VendaBean(
                
                rs.getInt("id_venda"),
                rs.getFloat("preco"),
                rs.getString("nome_medicamento"),
                rs.getString("nome"),
                rs.getString("telefone"),
                rs.getString("modo_pagamento")
                    
            );
            //no final de cada linha ele adiciona o valor a lista com o add
            Venda.add(pb2);
        }
        //retorna para tela todos os valores
        return Venda;
        
    }
    
}
