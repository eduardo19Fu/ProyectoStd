package prstd.controladores;

import java.awt.Frame;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import prstd.gui.Auxiliar;
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
    private JasperReport reporte;
    
    public CFactura(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crearFactura(Documento factura){
        String sql = "insert into tbl_documento values(?,?,current_timestamp(),?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, factura.getIdtransaccion());
            ps.setInt(2, factura.getNo_documento());
            ps.setDouble(3, factura.getTotal());
            ps.setInt(4, factura.getIdcliente());
            ps.setInt(5, factura.getIdvendedor());
            ps.setString(6, factura.getSerie());
            ps.setString(7, factura.getEstado());
            ps.setInt(8, factura.getTipo_documento());
            ps.setString(9, factura.getCorrelatvio_sat());
            ps.setString(10, factura.getCertificacion_sat());
            ps.setString(11, factura.getSerie_sat());
            ps.setString(12, factura.getMensaje_sat());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return 0;
        }
    }
    
    
    public int anular(int idtransaccion, int no_documento, String serie){
        String sql = "update tbl_documento set fecha_emision = fecha_emision,estado = 'ANULADA' where idtransaccion = ? and no_documento = ? and serie = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idtransaccion);
            ps.setInt(2, no_documento);
            ps.setString(3, serie);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public List<Documento> consultarTransacciones(){
        String sql = "select * from tbl_documento where (tipo_documento = 1 or tipo_documento = 4) and date(fecha_emision) = curdate()";
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
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Documento> consultarTransacciones(Date fechaIni, Date fechaFin){
        String sql = "select * from tbl_documento where (tipo_documento = 1 or tipo_documento = 4) and date(fecha_emision) between ? and ?";
        List<Documento> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(fechaIni.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
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
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    
    public List<Documento> consultarTransacciones(String no_factura){
        String sql = "select * from tbl_documento where cast(no_documento as char) like ?";
        List<Documento> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, no_factura + "%");
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
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    private List<Documento> consultarTransacciones(Date fecha_emision){
        return null;
    }
    
    private List<Documento> consultarTransaccion(String valor){
        String sql = "";
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int detalleFactura(DefaultTableModel modelo, int transaccion,String serie){
        String sql = "insert into tbl_detalle_documento values(?,?,?,?,?,?,?)";
        int rs = 0;
        Producto producto = new Producto();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                ps.setInt(1, transaccion);
                ps.setString(2, modelo.getValueAt(i, 1).toString());
                ps.setInt(3, (int) modelo.getValueAt(i, 0));
                ps.setDouble(4, Double.parseDouble(modelo.getValueAt(i,4).toString()));
                
                // Validación del campo de descuento.
                if(modelo.getValueAt(i, 5) != null){
                    ps.setDouble(5, (double) modelo.getValueAt(i, 5)); // si el campo no esta vacio se inserta en la db
                    ps.setDouble(7, Double.parseDouble(modelo.getValueAt(i, 3).toString()));
                }else{
                    ps.setDouble(5, 0.00); // por el contrario si lo esta, se inserta el valor de 0.00
                    ps.setDouble(7, 0.00);
                }
                ps.setString(6, serie);
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    // Contrlador que se encarga de la impresion de la factura
    public javax.swing.JFrame imprimir(int transac, int no_factura, String serie, double total){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("no_factura", no_factura);
            parametro.put("serie", serie);
            parametro.put("transac", transac);
            parametro.put("texto", aux.Convertir(String.format("%.2f",total), true));
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\factura.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Factura No. \"" + no_factura + "\"");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            //jv.setAlwaysOnTop(true);
            connection.close();
            return jv;
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public javax.swing.JFrame imprimir2(int transac, int no_factura, String serie, double total){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("no_factura", no_factura);
            parametro.put("serie", serie);
            parametro.put("transac", transac);
            parametro.put("texto", aux.Convertir(String.format("%.2f",total), true));
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\factura_2.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Factura No. \"" + no_factura + "\"");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            //jv.setAlwaysOnTop(true);
            connection.close();
            return jv;
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    // Controlador que impirme la poliza de un usuario en determinada fecha
    public javax.swing.JFrame imprimir(int usuario, Date fecha){
        try{
            Map parametro = new HashMap();
            parametro.put("usuario", usuario);
            parametro.put("fechaIni", fecha);
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\poliza.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Poliza");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            connection.close();
            return jv;
        }catch(JRException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public javax.swing.JFrame ventas_mensuales(String mes, int anho){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("mes", aux.getMes(mes));
            parametro.put("anho", anho);
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\ventas_mensuales.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Ventas del mes de " + mes +" del " + anho);
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            connection.close();
            return jv;
        } catch (JRException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public int actualizarExistencias(DefaultTableModel modelo){
        String sql = "update tbl_producto set stuckTienda = ? where codigo = ?";
        Producto producto;
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                producto = new Producto().buscarProducto(modelo.getValueAt(i, 1).toString());
                if(producto.getExistencia_tienda() >= (int) modelo.getValueAt(i, 0))
                    ps.setInt(1, (producto.getExistencia_tienda() - (int) modelo.getValueAt(i, 0)));
                else
                    ps.setInt(1, 0);
                ps.setString(2, modelo.getValueAt(i, 1).toString());
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int restaurarExistencias(int idtransaccion, int no_docuemento, String serie){
        String sql = "select codigo, cantidad from tbl_detalle_documento where idtransaccion = ? and serie = ?";
        String sql2 = "update tbl_producto set stuckTienda = ? where codigo = ?";
        Object[] dts = new Object[2];
        Producto producto;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps.setInt(1, idtransaccion);
            ps.setString(2, serie);
            ResultSet rs = ps.executeQuery();
            int rs2 = 0;
            while(rs.next()){
                dts[0] = rs.getString(1);
                dts[1] = rs.getInt(2);
                producto = new Producto().buscarProducto(dts[0].toString());
                ps2.setInt(1, (producto.getExistencia_tienda()) + (int) dts[1]);
                ps2.setString(2, dts[0].toString());
                rs2 = ps2.executeUpdate();
            }
            rs.close();
            ps2.close();
            ps.close();
            connection.close();
            return rs2;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public double totalDocumento(int idtransaccion){
        String sql = "select total from tbl_documento where idtransaccion = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idtransaccion);
            ResultSet rs = ps.executeQuery();
            rs.next();
            double total = rs.getDouble(1);
            rs.close();
            ps.close();
            connection.close();
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public BigDecimal calcularIva(double total){
        double iva = (total/1.12) * 0.12;
        
        BigDecimal big = new BigDecimal(iva);
        return big;
    }
}
