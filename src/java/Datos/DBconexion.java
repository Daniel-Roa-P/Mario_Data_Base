/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danbr
 */
public class DBconexion {
    
    static String bd = "mario";
    static String login = "root";
    static String password = "Megamix12621";
    static String url = "jdbc:mysql://localhost:3306/"+bd;
    static String mensaje = "";
    
    Connection conexion = null;
    /**
     * Constructor de la clase
     */
    public DBconexion() {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url,login,password);

                if (conexion!=null){
                        System.out.println("Conexión a base de datos "+bd+" OK");
                }
        }catch(SQLException e){
                mensaje = e.getMessage();
        }catch(ClassNotFoundException e){
                mensaje = e.getMessage();
        }
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public static String getMensaje() {
        return mensaje;
    }

    public static void setMensaje(String mensaje) {
        DBconexion.mensaje = mensaje;
    }

    public void desconectar(){
        conexion = null;
    }
    
}
