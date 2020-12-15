/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.PessoaBean;
import dao.PessoaDao;
import java.sql.SQLException;
import java.util.List;

//A controller serve com intermediador entre as minhas requisições no banco e minha tela
public class ControlePessoa {
    //Cria um motodo que recebe os dados que foram digitados ou que são necessarios para execução da query 
    public void controlaCadastroPessoa(PessoaBean pb) throws SQLException{
        //Cria o objeto da DAO
        PessoaDao pd = new PessoaDao();
        //Chama o metodo que sera executado
        pd.cadastroPessoa(pb);
    }
    //Igual para todos os outros
    public void controlaAlteraPessoa(PessoaBean pb) throws SQLException{
        PessoaDao pd = new PessoaDao();
        pd.alteraPessoa(pb);
    }
    public void controlaDeletarPessoa(PessoaBean pb) throws SQLException{
        PessoaDao pd = new PessoaDao();
        pd.deletarPessoa(pb);
    }
    public List<PessoaBean> ListarPessoas(PessoaBean pb) throws SQLException{
        PessoaDao pd = new PessoaDao();
        List<PessoaBean> listPessoa = pd.selecionaPessoas(pb);
        return listPessoa;
    }
    public void ListaPessoa(PessoaBean pb) throws SQLException{
        PessoaDao pd = new PessoaDao();
        pd.selecionarPessoa(pb);
    }
}
