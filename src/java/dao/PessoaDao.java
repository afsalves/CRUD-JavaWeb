/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PessoaBean;
import bean.UsuarioBean;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PessoaDao {
    //uma variavel do java que armazena o preparar de uma query sql
    PreparedStatement stmt = null;
    //uma variavel do java que armazena os resultados vindos do banco de dados
    ResultSet rs = null;
    //Objeto da conexão
    Connection con = Conexao.Conectar();
    //Metodo que cadastra uma pessoa no banco e passa como parametro a variavel bem que esta armazenada os valores digitados pelo usuario
    public void cadastroPessoa(PessoaBean pb) throws SQLException{
        //Variavel que carrega a string da query que vai ser executada
        //O pondo de interrogação significa que naquela query o que foi o ponto vai ser substituido pelo valor digitado 
        String query = "insert into pessoa (nome,email,cpf,telefone,id_pessoa) values (?,?,?,?,?)";
        
        //Abre a conexão com o banco de dados
        stmt = con.prepareStatement(query);
        
        //nessa parte que o java sebstitui o ponto pelo valor
        //OBS: Sempre começa com 1
        //ele está setando pela ordem da query os valores obtidos 
        stmt.setString(1, pb.getNome());
        stmt.setString(2, pb.getEmail());
        stmt.setString(3, pb.getCpf());
        stmt.setString(4, pb.getTelefone());
        stmt.setInt(5, pb.getId());

        //executeUpdate é um metodo java que executa a query no banco de dados
        stmt.executeUpdate();
        

    }
    
    //Mesma coisa só substitui a query 
    public void alteraPessoa(PessoaBean pb) throws SQLException{
        String query = "update pessoa set nome = ?,email = ?,cpf = ?,telefone = ? where id_pessoa = ?";
        stmt = con.prepareStatement(query);
        
        stmt.setString(1, pb.getNome());
        stmt.setString(2, pb.getEmail());
        stmt.setString(3, pb.getCpf());
        stmt.setString(4, pb.getTelefone());
        stmt.setInt(5, pb.getId());
        
        stmt.executeUpdate();
    }
    
    // Mesma coisa só substitui a query
    public void deletarPessoa(PessoaBean pb) throws SQLException{
        String query = "delete from pessoa where id_pessoa = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, pb.getId());
        stmt.executeUpdate();
    }
    
    //Metodo que lista todos os dados cadastrados do bando 
    //List cria uma matriz dinamica que recebe os valores da mesma forma que um select direto no  workbeach
    public List<PessoaBean> selecionaPessoas(PessoaBean pb) throws SQLException{
        String query = "SELECT * FROM pessoa inner join usuario as u on id_pessoa =  id;";
        //Cria um metodo de pessoa que vai cerregar essa lista
        List<PessoaBean> pessoa = new ArrayList<>();
        stmt = con.prepareStatement(query);

        //Executa e com o metodo ResultSet armazena o que foi pego pelo banco
        rs = stmt.executeQuery();
        /*int id_pessoa, String nome, String cpf, String email, String telefone, String login int id*/
        
        //Faz um loop utilizando o rs.next que pergunta para o banco se existe mais alguma tabela 
        //Caso exista ele continuara rodando até acabar as linhas
        while(rs.next()){

            PessoaBean pb2 = new PessoaBean(
                //pega os valores do banco 
                // rs.getInt("id_pessoa") = O tipo do dado setado no mysql e em aspas o nome do campo igual o do banco
                rs.getInt("id_pessoa"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("email"),
                rs.getString("telefone"),
                rs.getString("login"),
                rs.getInt("id")

            );
            //no final de cada linha ele adiciona o valor a lista com o add
            pessoa.add(pb2);
        }
        //retorna para tela todos os valores
        return pessoa;
        
    }
    //Semelhante ao anterior mais apenas pega os valores de uma pessoa especifica
    public void selecionarPessoa(PessoaBean pb) throws SQLException{
        String query = "SELECT * FROM pessoa where id_pessoa = ?;";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, pb.getId());
        rs = stmt.executeQuery();
        /*int id_pessoa, String nome, String cpf, String email, String telefone, String login int id*/
        while(rs.next()){
            pb.setId(rs.getInt("id_pessoa"));
            pb.setNome(rs.getString("nome"));
            pb.setCpf(rs.getString("cpf"));
            pb.setEmail(rs.getString("email"));
            pb.setTelefone(rs.getString("telefone"));
        }
        
    }
    public void excluirPessoa(PessoaBean pb){
        
    }
}
