package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Rol;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CRol {
    
    private Connection connection;
    private ConexionDos conexion;
    private Rol rol;
    
    public CRol(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crear(Rol rol){
        String sql = "{call crear_rol(?,?)}";
        
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, rol.getRol());
            ps.setString(2, rol.getEstado());
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRol.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int editar(Rol rol){
        return 0;
    }
    
    private int eliminar(String rol){
        return 0;
    }
    
    public List<Rol> consultar(){
        return null;
    }
    
    public List<Rol> consultar(String rol){
        return null;
    }
}
