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
    
    public int crear(Usuario usuario){
        String sql = "insert into tbl_usuario(usuario,password,nombre,apellido,estado,telefono,email,rol) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario().toUpperCase());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre().toUpperCase());
            ps.setString(4,usuario.getApellido().toUpperCase());
            ps.setString(5, usuario.getEstado());
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getEmail());
            ps.setInt(8, usuario.getIdrol());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepcion Ocurrida => " + e.getMessage(),"Error Fatal",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int actualizar(Usuario usuario){
        String sql = "update tbl_usuario set usuario = ?, password = ?, nombre = ?, apellido = ?, estado = ?,telefono=?,email=?,rol=? where idusuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario().toUpperCase());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre().toUpperCase());
            ps.setString(4, usuario.getApellido().toUpperCase());
            ps.setString(5, usuario.getEstado());
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getEmail());
            ps.setInt(8, usuario.getIdrol());
            ps.setInt(9, usuario.getIdusuario());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepción Ocurrida => " + e.getMessage(), "Error Fatal", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int eliminar(int id){
        String sql = "delete from tbl_usuario where idusuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Excepción Ocurrida => " + e.getMessage(), "Error Fatal", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public List<Usuario> consultar(){
        String sql = "select * from tbl_usuario";
        List<Usuario> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.usuario = new Usuario();
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefono(rs.getString("telefono"));
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
    
    public List<Usuario> consultar(String usuario){
        String sql = "select * from tbl_usuario where usuario like ?";
        List<Usuario> lista = new ArrayList<>();
                
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + usuario + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.usuario = new Usuario();
                this.usuario.setIdusuario(rs.getInt("idusuario"));
                this.usuario.setUsuario(rs.getString("usuario"));
                this.usuario.setPassword(rs.getString("password"));
                this.usuario.setNombre(rs.getString("nombre"));
                this.usuario.setApellido(rs.getString("apellido"));
                this.usuario.setEstado(rs.getString("estado"));
                this.usuario.setTelefono(rs.getString("telefono"));
                this.usuario.setEmail(rs.getString("email"));
                this.usuario.setIdrol(rs.getInt("rol"));
                lista.add(this.usuario);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
        
    public Usuario cargarUsuario(int id){
        String sql = "select * from tbl_usuario where idusuario = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.usuario = new Usuario();
            this.usuario.setIdusuario(rs.getInt(1));
            this.usuario.setUsuario(rs.getString(2));
            this.usuario.setPassword(rs.getString(3));
            this.usuario.setNombre(rs.getString(4));
            this.usuario.setApellido(rs.getString(5));
            this.usuario.setEstado(rs.getString(6));
            this.usuario.setTelefono(rs.getString(7));
            this.usuario.setEmail(rs.getString(8));
            this.usuario.setIdrol(rs.getInt(9));
            rs.close();
            ps.close();
            connection.close();
            return this.usuario;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int consultarUsuario(String usuario){
        String sql = "select idusuario from tbl_usuario where usuario = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int consultarUsuario(){
        String sql = "select max(idusuario) from tbl_usuario";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    // Método encargado de realizar el filtro para la ventana de Usuarios
    // Pretende realizar un filtro según el valor que el usuario desee buscar.
    public List<Usuario> filtrarUsuarios(String valor){
        String sql = "select * from tbl_usuario where usuario like ? or nombre like ? or apellido like ? or estado like ?";
        List<Usuario> lista = new ArrayList<>();
                
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + valor + "%");
            ps.setString(2, "%" + valor + "%");
            ps.setString(3, "%" + valor + "%");
            ps.setString(4, "%" + valor + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.usuario = new Usuario();
                this.usuario.setIdusuario(rs.getInt("idusuario"));
                this.usuario.setUsuario(rs.getString("usuario"));
                this.usuario.setPassword(rs.getString("password"));
                this.usuario.setNombre(rs.getString("nombre"));
                this.usuario.setApellido(rs.getString("apellido"));
                this.usuario.setEstado(rs.getString("estado"));
                this.usuario.setTelefono(rs.getString("telefono"));
                this.usuario.setEmail(rs.getString("email"));
                this.usuario.setIdrol(rs.getInt("rol"));
                lista.add(this.usuario);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean hacerLogin(Usuario usuario){
        String sql = "select 1 from tbl_usuario where usuario = ? and password = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ResultSet rs = ps.executeQuery();
            boolean log = rs.next();
            rs.close();
            ps.close();
            connection.close();
            return log;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String getVendedor(String usuario){
        String sql = "select concat(nombre,' ',apellido) from tbl_usuario where usuario = ?";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String vendedor = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return vendedor;
        }
        catch(SQLException ex){
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int comprobarRol(int usuario){
        String sql = "select rol from tbl_usuario where idusuario = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int idrol = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return idrol;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<Usuario> vendedores(){
        String sql = "select * from tbl_usuario where rol != 3";
        List<Usuario> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.usuario = new Usuario();
                usuario.setIdusuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                usuario.setNombre(rs.getString(4));
                usuario.setApellido(rs.getString(5));
                usuario.setEstado(rs.getString(6));
                usuario.setTelefono(rs.getString(7));
                usuario.setEmail(rs.getString(8));
                usuario.setIdrol(rs.getInt(9));
                lista.add(usuario);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
