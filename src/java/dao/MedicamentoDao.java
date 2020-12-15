/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MedicamentoBean;
import bean.UsuarioBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MedicamentoDao {
    //uma variavel do java que armazena o preparar de uma query sql
    PreparedStatement stmt = null;
    //uma variavel do java que armazena os resultados vindos do banco de dados
    ResultSet rs = null;
    //Objeto da conexão
    Connection con = Conexao.Conectar();

    //Metodo que cadastra uma pessoa no banco e passa como parametro a variavel bem que esta armazenada os valores digitados pelo usuario
    public void cadastraMedicamento(MedicamentoBean pb) throws SQLException{
        //Variavel que carrega a string da query que vai ser executada
        //O pondo de interrogação significa que naquela query o que foi o ponto vai ser substituido pelo valor digitado 
        String query = "insert into medicamento (nome_medicamento,preco) values (?,?)";
        
        //Abre a conexão com o banco de dados
        stmt = con.prepareStatement(query);
        
        //nessa parte que o java sebstitui o ponto pelo valor
        //OBS: Sempre começa com 1
        //ele está setando pela ordem da query os valores obtidos 
        stmt.setString(1, pb.getNome_medicamento());
        stmt.setFloat(2, pb.getPreco());
        System.out.println(pb.getPreco());
        //executeUpdate é um metodo java que executa a query no banco de dados
        stmt.executeUpdate();
    }
    
    //Mesma coisa só substitui a query 
    public void alteraMedicamento(MedicamentoBean pb) throws SQLException{
        String query = "update medicamento set nome_medicamento = ?,preco = ? where id_medicamento =?";
        stmt = con.prepareStatement(query);
        
        stmt.setString(1, pb.getNome_medicamento());
        stmt.setFloat(2, pb.getPreco());
        stmt.setInt(3, pb.getId());
        stmt.executeUpdate();
    }
    
    // Mesma coisa só substitui a query
    public void deletarMedicamento(MedicamentoBean pb) throws SQLException{
        String query = "delete from medicamento where id_medicamento = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, pb.getId());
        stmt.executeUpdate();
    }
    
    //Metodo que lista todos os dados cadastrados do bando 
    //List cria uma matriz dinamica que recebe os valores da mesma forma que um select direto no  workbeach
    public List<MedicamentoBean> selecionaMedicamento(MedicamentoBean pb) throws SQLException{
        String query = "SELECT * FROM medicamento";
        //Cria um metodo de Medicamento que vai cerregar essa lista
        List<MedicamentoBean> Medicamento = new ArrayList<>();
        stmt = con.prepareStatement(query);
        //Executa e com o metodo ResultSet armazena o que foi pego pelo banco
        rs = stmt.executeQuery();
        /*int id_Medicamento, String nome, String cpf, String email, String telefone, String login int id*/
        
        //Faz um loop utilizando o rs.next que pergunta para o banco se existe mais alguma tabela 
        //Caso exista ele continuara rodando até acabar as linhas
        while(rs.next()){

            MedicamentoBean pb2 = new MedicamentoBean(
                //pega os valores do banco 
                //rs.getInt("id_pessoa") = O tipo do dado setado no mysql e em aspas o nome do campo igual o do banco
                rs.getInt("id_medicamento"),
                rs.getFloat("preco"),
                rs.getString("nome_medicamento")
            );
            //no final de cada linha ele adiciona o valor a lista com o add
            Medicamento.add(pb2);
        }
        //retorna para tela todos os valores
        return Medicamento;
        
    }
    //Semelhante ao anterior mais apenas pega os valores de uma pessoa especifica
    public void selecionarMedicamento(MedicamentoBean pb) throws SQLException{
        String query = "SELECT * FROM medicamento where id_medicamento = ?;";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, pb.getId());
        rs = stmt.executeQuery();
        /*int id_pessoa, String nome, String cpf, String email, String telefone, String login int id*/
        while(rs.next()){
            pb.setId_medicamento(rs.getInt("id_medicamento"));
            pb.setNome_medicamento(rs.getString("nome_medicamento"));
            pb.setPreco(rs.getFloat("preco"));
        }
    }
    public void excluirMedicamento(MedicamentoBean pb){
        
    }

}