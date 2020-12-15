/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.MedicamentoBean;
import dao.MedicamentoDao;
import java.sql.SQLException;
import java.util.List;

//A controller serve com intermediador entre as minhas requisições no banco e minha tela
public class ControleMedicamento {
    //Cria um motodo que recebe os dados que foram digitados ou que são necessarios para execução da query 
    public void cadastraMedicamento(MedicamentoBean pb) throws SQLException{
        //Cria o objeto da DAO
        MedicamentoDao pd = new MedicamentoDao();
        //Chama o metodo que sera executado
        pd.cadastraMedicamento(pb);
    }
    //Igual para todos os outros
    public void controlaAlteraMedicamento(MedicamentoBean pb) throws SQLException{
        MedicamentoDao pd = new MedicamentoDao();
        pd.alteraMedicamento(pb);
    }
    public void controlaDeletarMedicamento(MedicamentoBean pb) throws SQLException{
        MedicamentoDao pd = new MedicamentoDao();
        pd.deletarMedicamento(pb);
    }
    public List<MedicamentoBean> ListaMedicamento(MedicamentoBean pb) throws SQLException{
        MedicamentoDao pd = new MedicamentoDao();
        List<MedicamentoBean> listaMedicamento = pd.selecionaMedicamento(pb);
        return listaMedicamento;
    }
    public void listarMedicamento(MedicamentoBean pb) throws SQLException{
        MedicamentoDao pd = new MedicamentoDao();
        pd.selecionarMedicamento(pb);
    }
}