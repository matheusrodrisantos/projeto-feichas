package projeto;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Query {
        
        Conectadb con=new Conectadb();
        Connection c=null;
        
        public void listarTables() throws SQLException
        {
            Statement stm=c.createStatement();
            String sql="show tables";
            ResultSet res=stm.executeQuery(sql);
            while (res.next()) 
            {
                String lastName = res.getString("Tables_in_livraria");
                System.out.println(lastName + "\n");
            }
        }
        
        public void listarDados(String sql) throws SQLException
        {
            Statement stm=c.createStatement();
            ResultSet res=stm.executeQuery(sql);
        
            while (res.next()) 
            {
                String lastName = res.getString("");
                System.out.println(lastName + "\n");
            }
        }
        
        
        
        public void inserirDados(String sql) throws SQLException
        {
            Statement stm=c.createStatement();
            ResultSet res=stm.executeQuery(sql);
            while (res.next()) 
            {
                String lastName = res.getString("Tables_in_livraria");
                System.out.println(lastName + "\n");
            }
        }
    
}
