package prstd.servicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.TimeZone;
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
    private final String url;
    private String host;

    public ConexionDos() {
        iniciarVariables();
        url = "jdbc:mysql://"+ host +"/" + db 
              + "?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone="
              + TimeZone.getDefault().getID() + "&useSSL=false";
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
    
    public void iniciarVariables(){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(new File("").getAbsolutePath()+"\\src\\prstd\\properties\\properties.properties"));
            db = properties.getProperty("db");
            user = properties.getProperty("user");
            pass = properties.getProperty("password");
            driver = properties.getProperty("driver");
            host = properties.getProperty("host");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionDos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexionDos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
