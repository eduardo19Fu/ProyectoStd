package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Cliente;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CCliente {
    
    private ConexionDos conexion;
    private Connection connection;
    private Cliente cliente;
    
    public CCliente(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int grabar(Cliente cliente){
        String sql = "insert into tbl_cliente values(?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setString(3, cliente.getNit());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminar(int idcliente){
        String sql = "delete from tbl_cliente where idcliente = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idcliente);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<Cliente> consultar(){
        cliente = new Cliente();
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from tbl_cliente";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cliente.setIdcliente(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setNit(rs.getString(4));
                lista.add(cliente);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Cliente> consultarNit(String parametro){
        cliente = new Cliente();
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from tbl_cliente where nit like  ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + parametro + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cliente.setIdcliente(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setNit(rs.getString(4));
                lista.add(cliente);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Cliente> consultarNombre(String nombre){
        cliente = new Cliente();
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from tbl_cliente where nombre like ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cliente.setIdcliente(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setNit(rs.getString(4));
                lista.add(cliente);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
