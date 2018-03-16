package prstd.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edfu-Pro
 */
public class ConexionDos {
    
    private Connection connection;
    private String user;
    private String pass;
    private String db;
    private String driver;
    private String url;

    public ConexionDos() {
        user = "root";
        pass = "1992";
        db = "std_db";
        driver = "com.mysql.jdbc.Driver";
        url = "";
    }
    
    private Connection conectar(){
        try{
           Class.forName(driver);
           connection = DriverManager.getConnection(url,user,pass);
           return connection;
       }catch(ClassNotFoundException | SQLException ex){
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Conexion Failed: Error => " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
           return null;
       }
    }
    
    public Connection getConnection(){
        return conectar();
    }
    
    public void desconectar() throws SQLException{
        getConnection().close();
    }
    
}