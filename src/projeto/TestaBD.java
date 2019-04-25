package projeto;

import java.sql.SQLException;

public class TestaBD {
    public static void main(String[] args ) throws SQLException{
        Query quer=new Query();
        quer.listarTables();
    }
}
