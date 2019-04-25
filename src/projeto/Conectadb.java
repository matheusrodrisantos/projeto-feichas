/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author matheus
 */

public class Conectadb {   
        public static Connection getConnection() throws SQLException {   
              try {   
                     Class.forName("com.mysql.jdbc.Driver"); //Altere o Driver caso não seja o MySQL   
                     return DriverManager.getConnection("jdbc:mysql://localhost/livraria","root","ukulele");  
                     
              } catch (ClassNotFoundException e) {   
                     throw new SQLException(e.getMessage());   
              }   
        }   

    
}

