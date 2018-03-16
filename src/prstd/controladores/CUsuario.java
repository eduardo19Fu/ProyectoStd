package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prstd.modelos.Usuario;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CUsuario {
    
    public Usuario usuario;
    private ConexionDos conexion;
    private Connection connection;
    
    public CUsuario(){
        usuario = new Usuario();
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    private int crear(Usuario usuario){
        String sql = "insert into tbl_usuario values (?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre());
            ps.setString(4,usuario.getApellido());
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepcion Ocurrida => " + e.getMessage(),"Error Fatal",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int getCrear(Usuario usuario){
        return crear(usuario);
    }
    
    private int actualizar(Usuario usuario){
        String sql = "update tbl_usuario set usuario = ?, password = ?, nombre = ?, apellido = ?, estado = ? where idusuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getApellido());
            ps.setString(5, usuario.getEstado());
            ps.setInt(6, usuario.getIdusuario());
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepción Ocurrida => " + e.getMessage(), "Error Fatal", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int getActualizar(Usuario usuario){
        return actualizar(usuario);
    }
    
    private int eliminar(Usuario usuario){
        String sql = "delete from tbl_usuario where idusuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getIdusuario());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepción Ocurrida => " + e.getMessage(), "Error Fatal", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int getEliminar(Usuario usuario){
        return eliminar(usuario);
    }
    
    public List<Usuario> consultar(){
        String sql = "select * from usuario";
        List<Usuario> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setNombre("nombre");
                usuario.setApellido("apellido");
                usuario.setEstado("estado");
                lista.add(usuario);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    private List<Usuario> consultar(String usuario){
        String sql = "select * from usuario where usuario like ?";
        
        return null;
    }
    
    public int consultarUsuario(String usuario){
        String sql = "select idusuario from tbl_usuario where usuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
