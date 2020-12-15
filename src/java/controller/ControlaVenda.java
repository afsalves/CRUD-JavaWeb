/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.VendaBean;
import dao.MedicamentoDao;
import dao.VendaDao;
import java.sql.SQLException;
import java.util.List;


public class ControlaVenda {
    public void cadastraMedicamento(VendaBean vb) throws SQLException{
        //Cria o objeto da DAO        
        VendaDao vd = new VendaDao();
        vd.cadastraMedicamento(vb);
    }
    
    public List<VendaBean> ListaVenda(VendaBean vb) throws SQLException{
        VendaDao vd = new VendaDao();
        List<VendaBean> listaVenda = vd.selecionaVenda(vb);
        return listaVenda;
    }
}
