package prstd.controladores;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "insert into tbl_rol (rol,descripcion,estado) values(?,?,?)}";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, rol.getRol());
            ps.setString(2, rol.getDescripcion());
            ps.setString(3, rol.getEstado());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRol.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int editar(Rol rol){
        String sql = "update tbl_rol set rol = ?, descripcion = ?, estado = ? where idrol = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, rol.getRol());
            ps.setString(2, rol.getDescripcion());
            ps.setString(3, rol.getEstado());
            ps.setInt(4, rol.getIdrol());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRol.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminar(int idrol){
        String sql = "delete from tbl_rol where idrol = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idrol);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRol.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<Rol> consultar(){
        List<Rol> lista = new ArrayList<>();
        String sql = "select * from tbl_rol";
        rol = new Rol();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rol.setIdrol(rs.getInt(1));
                rol.setRol(rs.getString(2));
                rol.setDescripcion(rs.getString(3));
                rol.setEstado(rs.getString(4));
                lista.add(rol);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CRol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Rol> consultar(String rol){
        return null;
    }
}
