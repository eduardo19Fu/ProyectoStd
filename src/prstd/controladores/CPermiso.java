package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Permiso;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CPermiso {
    
    private Permiso permiso;
    private ConexionDos conexion;
    private Connection connection;
    
    public CPermiso(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crear(Permiso permiso){
        String sql = "insert into tbl_permiso values(??)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, permiso.getPermiso());
            ps.setString(2, permiso.getEstado());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CPermiso.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int editar(Permiso permiso){
        String sql = "update tbl_permiso set permiso = ?, estado = ? where idpermiso = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, permiso.getPermiso());
            ps.setString(2, permiso.getEstado());
            ps.setInt(3, permiso.getIdpermiso());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CPermiso.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminar(int idpermiso){
        String sql = "delete from permiso where idpermiso = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idpermiso);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CPermiso.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<Permiso> listar(){
        List<Permiso> lista = new ArrayList<>();
        String sql = "select * from tbl_permiso";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                permiso = new Permiso();
                permiso.setIdpermiso(rs.getInt(1));
                permiso.setPermiso(rs.getString(2));
                permiso.setEstado(rs.getString(3));
                lista.add(permiso);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CPermiso.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int getIdPermiso(String permiso){
        String sql = "select idpermiso from tbl_permiso where permiso = ?";
        
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, permiso);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(CPermiso.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
