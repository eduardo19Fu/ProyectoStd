/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prstd.controladores;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
            ps.setInt(1, producto.getExistencia_tienda());
            ps.setString(2, producto.getCodigo());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int registroProducto(Producto productos){
        String sql = "insert into tbl_producto values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setInt(9, producto.getExistencia_tienda());
            ps.setInt(10, producto.getExistencia_bodega());
            ps.setDouble(11, producto.getPorcentaje_ganancia());
            ps.setInt(12, producto.getTipo_producto());
            ps.setInt(13, producto.getExistencia_minima_tienda());
            ps.setInt(14, producto.getExsitencia_minima_bodega());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
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
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setTipo_producto(rs.getInt(12));
                producto.setExistencia_minima_tienda(rs.getInt(13));
                producto.setExistencia_minima_bodega(rs.getInt(14));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
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
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setTipo_producto(rs.getInt(12));
                producto.setExistencia_minima_tienda(rs.getInt(13));
                producto.setExistencia_minima_bodega(rs.getInt(14));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String calcularPrecioVenta(String precioCosto, String porcentaje) throws NumberFormatException, ArithmeticException{
        double precioc = Double.parseDouble(precioCosto);
        double percent = (Double.parseDouble(porcentaje)/100); // Convertimos el entero en un valor de porcentaje al dividirlo dentro de 100%.
        
        double preciov =  (precioc*percent) + precioc; // Almacenamos el resultado en una nueva variable la cual sirve como precioVenta.
        
        BigDecimal bd = new BigDecimal(preciov); // Creamos una variable BigDecimal para almacenar el precioVenta.
        bd = bd.setScale(2,RoundingMode.HALF_UP); // Decidimos el formato de redondeo y la cantidad de decimales que deseamos.
        
        return String.format("%.2f",bd.doubleValue()); // Devolvemos el valor resultante como un String.
    }
}
