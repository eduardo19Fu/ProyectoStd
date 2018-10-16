/*
 * Controlador para la Clase de Familia.
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Familia;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CFamilia {
    
    private Familia familia;
    private ConexionDos conexion;
    private Connection connection;
    
    public CFamilia(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public List<Familia> listar(){
        String sql = "select * from tbl_producto_familia";
        List<Familia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.familia = new Familia();
                this.familia.setIdfamilia(rs.getInt(1));
                this.familia.setNombre_familia(rs.getString(2));
                lista.add(familia);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Familia consultar(int id){
        String sql = "select * from tbl_producto_familia where idproducto_familia = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.familia = new Familia();
            this.familia.setIdfamilia(rs.getInt(1));
            this.familia.setNombre_familia((rs.getString(2)));
            rs.close();
            ps.close();
            connection.close();
            return this.familia;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Familia> filtrar(String nombre){
        String sql = "select * from tbl_producto_familia where nombre_familia like ?";
        List<Familia> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.familia = new Familia();
                this.familia.setIdfamilia(rs.getInt(1));
                this.familia.setNombre_familia(rs.getString(2));
                lista.add(familia);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int getId(String familia){
        String sql = "select idproducto_familia from tbl_producto_familia where nombre_familia = ?";
        int id = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, familia);
            ResultSet rs = ps.executeQuery();
            rs.next();
            id = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int registrar(Familia familia){
        String sql = "insert into tbl_producto_familia(idproducto_familia,nombre_familia) values(?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, familia.getIdfamilia());
            ps.setString(2, familia.getNombre_familia().toUpperCase());
            int rs;
            rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int actualizar(Familia familia){
        String sql = "update tbl_producto_familia set nombre_familia = ? where idproducto_familia";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, familia.getNombre_familia());
            ps.setInt(2, familia.getIdfamilia());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int getMaxFamilia(){
        String sql = "select getMaxFamilia()";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int max = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return max;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public String getNombre(int id){
        String sql = "select nombre_familia from tbl_producto_familia where idproducto_familia = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String nombre = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return nombre;
        } catch (SQLException ex) {
            Logger.getLogger(CFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
