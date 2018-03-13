package prstd.modelos;

import java.sql.Connection;

/**
 *
 * @author Edfu-Pro
 */
public class Conexion {
    
    private Connection connection;
    private String db;
    private String user;
    private String pass;
    private String url;
    private String driver;

    public Conexion() {
    }

    public Conexion(Connection connection, String db, String user, String pass, String url, String driver) {
        this.connection = connection;
        this.db = db;
        this.user = user;
        this.pass = pass;
        this.url = url;
        this.driver = driver;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
}
