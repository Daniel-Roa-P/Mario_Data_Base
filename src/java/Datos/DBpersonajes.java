
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBpersonajes {
    
    DBconexion con;
    
    public DBpersonajes(){
        
        con = new DBconexion();
        
    }
    
    public ResultSet getPersonajePorId(int id) throws SQLException {
        PreparedStatement pstm = con.getConexion().prepareStatement("SELECT idpersonajes, "
                + " protagonista, "
                + " poder, "
                + " yoshi "
                + " FROM personajes "
                + " WHERE con_id = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }
    
    public ResultSet getPersonaje() throws SQLException {
        PreparedStatement pstm = con.getConexion().prepareStatement("SELECT idpersonajes, "
                + " protagonista, "
                + " poder, "
                + " yoshi "
                + " FROM personajes "
                + " ORDER BY protagonista, yoshi ");


        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public String getMensaje() {
        return con.getMensaje();
    }
    
}
