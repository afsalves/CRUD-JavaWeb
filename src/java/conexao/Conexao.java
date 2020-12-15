/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    private  static Connection con = null;
    public static Connection Conectar()  {
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/farmacia","root","");
            System.out.println("Conectado");
        } 
            
        catch(SQLException e) {
                System.out.println(e);
                 throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            
        }
        
        //System.out.println(con);
        return con;
        
    }
}
