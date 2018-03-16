/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import prstd.modelos.Producto;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CProducto {
    
    private Producto producto;
    private ConexionDos conexion;
    private Connection connection;
    
    public CProducto(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int altaProducto(Producto producto){
        String sql = "update tbl_producto set existencia = ? where codigo = ?";
        producto = new Producto();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getExistencia());
            ps.setString(2, producto.getCodigo());
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int registroProducto(Producto productos){
        String sql = "insert into tbl_producto values (?,?,?,?,?,?,?,?,?,?,?,?)";
        producto = new Producto();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio_compra());
            ps.setDouble(4, producto.getPrecio_venta());
            ps.setTimestamp(5, producto.getFecha_compra());
            ps.setDate(6, new java.sql.Date(producto.getFecha_vencimiento().getTime()));
            ps.setInt(7, producto.getFabricante());
            ps.setInt(8, producto.getFamilia());
            ps.setInt(9, producto.getExistencia());
            ps.setDouble(10, producto.getPorcentaje_ganancia());
            ps.setInt(11, producto.getTipo_producto());
            ps.setInt(12, producto.getExistencia_minima());
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminarProducto(String codProducto){
        return 0;
    }
    
    public List<Producto> buscarProductos(){
        producto = new Producto();
        List<Producto> lista = new ArrayList<>();
        String sql = "{call pr_listarProductos(?,?)}";
        
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, null);
            ps.setString(2, null);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia(rs.getInt(9));
                producto.setPorcentaje_ganancia(rs.getDouble(10));
                producto.setTipo_producto(rs.getInt(11));
                producto.setExistencia_minima(rs.getInt(12));
                lista.add(producto);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Producto> buscarProductos(String codigo, String nombre){
        producto = new Producto();
        List<Producto> lista = new ArrayList<>();
        String sql = "{call pr_listarProductos(?,?)}";
        
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia(rs.getInt(9));
                producto.setPorcentaje_ganancia(rs.getDouble(10));
                producto.setTipo_producto(rs.getInt(11));
                producto.setExistencia_minima(rs.getInt(12));
                lista.add(producto);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
