
package com.mycompany.saep.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    private static final String DATABASE = "jdbc:mysql://localhost:3306/saep_bd"; 
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection createConnectionMySQL() throws Exception{
        Connection con = DriverManager.getConnection(DATABASE, USER, PASSWORD);
        
        return con;
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = createConnectionMySQL();
        
        if(con != null){
            JOptionPane.showMessageDialog(null, "Conexao obtida com sucesso!");
            con.close();
        }
    }
    
}
