package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Documento;
import prstd.modelos.Producto;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CFactura {
    
    private Connection connection;
    private ConexionDos conexion;
    private Documento documento;
    
    public CFactura(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crearFactura(Documento factura){
        String sql = "insert into tbl_documento values(?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, factura.getIdtransaccion());
            ps.setInt(2, factura.getNo_documento());
            ps.setTimestamp(3, factura.getFecha_emision());
            ps.setDouble(4, factura.getTotal());
            ps.setInt(5, factura.getIdcliente());
            ps.setInt(6, factura.getIdvendedor());
            ps.setString(7, factura.getSerie());
            ps.setString(8, factura.getEstado());
            ps.setInt(9, factura.getTipo_documento());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    public int anular(int idtransaccion, int no_documento, String serie){
        return 0;
    }
    
    public List<Documento> consultarTransacciones(){
        String sql = "select * from tbl_documento where tipo_documento = 1";
        List<Documento> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                documento = new Documento();
                documento.setIdtransaccion(rs.getInt(1));
                documento.setNo_documento(rs.getInt(2));
                documento.setFecha_emision(rs.getTimestamp(3));
                documento.setTotal(rs.getDouble(4));
                documento.setIdcliente(rs.getInt(5));
                documento.setIdvendedor(rs.getInt(6));
                documento.setSerie(rs.getString(7));
                documento.setEstado(rs.getString(8));
                documento.setTipo_documento(rs.getInt(9));
                lista.add(documento);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Documento> consultarTransacciones(int no_factura){
        String sql = "select * from tbl_documento where no_documento = ?";
        List<Documento> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, no_factura);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                documento = new Documento();
                documento.setIdtransaccion(rs.getInt(1));
                documento.setNo_documento(rs.getInt(2));
                documento.setFecha_emision(rs.getTimestamp(3));
                documento.setTotal(rs.getDouble(4));
                documento.setIdcliente(rs.getInt(5));
                documento.setIdvendedor(rs.getInt(6));
                documento.setSerie(rs.getString(7));
                documento.setEstado(rs.getString(8));
                documento.setTipo_documento(rs.getInt(9));
                lista.add(documento);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Documento> consultarClientesVarios(){
        String sql = "select * from tbl_documento where tipo_documento = 3";
        List<Documento> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                documento = new Documento();
                documento.setIdtransaccion(rs.getInt(1));
                documento.setNo_documento(rs.getInt(2));
                documento.setFecha_emision(rs.getTimestamp(3));
                documento.setTotal(rs.getDouble(4));
                documento.setIdcliente(rs.getInt(5));
                documento.setIdvendedor(rs.getInt(6));
                documento.setSerie(rs.getString(7));
                documento.setEstado(rs.getString(8));
                documento.setTipo_documento(rs.getInt(9));
                lista.add(documento);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private List<Documento> consultarTransacciones(Date fecha_emision){
        return null;
    }
    
    private int crearFacturaVarios(){
        return 0;
    }
    
    public int getMaxTransaccion(){
        String sql = "select max(idtransaccion) from tbl_documento";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int maximo = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return maximo;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int detalleFactura(DefaultTableModel modelo, int transaccion,String serie){
        String sql = "insert into tbl_detalle_documento values(?,?,?,?,?,?)";
        int rs = 0;
        Producto producto = new Producto();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                ps.setInt(1, transaccion);
                ps.setString(2, modelo.getValueAt(i, 1).toString());
                ps.setInt(3, (int) modelo.getValueAt(i, 0));
                ps.setDouble(4, (double) modelo.getValueAt(i, 3));
                
                // Validación del campo de descuento.
                if(modelo.getValueAt(i, 4) != null){
                    ps.setDouble(5, (double) modelo.getValueAt(i, 4)); // si el campo no esta vacio se inserta en la db
                }else{
                    ps.setDouble(5, 0.00); // por el contrario si lo esta, se inserta el valor de 0.00
                }
                ps.setString(6, serie);
                rs = ps.executeUpdate();
            }
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public void imprimir(){
        
    }
    
    public int actualizarExistencias(DefaultTableModel modelo){
        String sql = "update tbl_producto set stuckTienda = ? where codigo = ?";
        Producto producto;
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                producto = new Producto().buscarProducto(modelo.getValueAt(i, 1).toString());
                ps.setInt(1, (producto.getExistencia_tienda() - (int) modelo.getValueAt(i, 0)));
                ps.setString(2, modelo.getValueAt(i, 1).toString());
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
