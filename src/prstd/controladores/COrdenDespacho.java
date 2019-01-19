package prstd.controladores;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import prstd.modelos.Documento;
import prstd.modelos.OrdenDespacho;
import prstd.modelos.Producto;
import prstd.servicios.ConexionDos;

public class COrdenDespacho {
    
    private ConexionDos conexion;
    private Connection connection;
    private Documento documento;
    private JasperReport reporte;
    private OrdenDespacho od;
    
    public COrdenDespacho(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int create(OrdenDespacho orden){
        String sql = "insert into tbl_orden_despacho values(?,?,current_timestamp(),?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,orden.getIdorden());
            ps.setString(2, orden.getEstado());
            ps.setInt(3, orden.getUsuario());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int detalle(DefaultTableModel modelo, int orden){
        String sql = "insert into tbl_detalle_orden values(?,?,?,?,?)";
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                ps.setInt(1, orden);
                ps.setString(2, modelo.getValueAt(i, 0).toString());
                ps.setInt(3, (int) modelo.getValueAt(i, 2));
                ps.setInt(4, (int)modelo.getValueAt(i,3));
                ps.setInt(5, (int) modelo.getValueAt(i, 4));
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public List<OrdenDespacho> read(){
        List<OrdenDespacho> lista = new ArrayList<>();
        String sql = "select * from tbl_orden_despacho where date(fecha_creacion) = curdate()";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                od = new OrdenDespacho();
                od.setIdorden(rs.getInt(1));
                od.setEstado(rs.getString(2));
                od.setFecha_creacion(rs.getTimestamp(3));
                od.setUsuario(rs.getInt(4));
                lista.add(od);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<OrdenDespacho> read(Date fechaIni, Date fechaFin){
        List<OrdenDespacho> lista = new ArrayList<>();
        String sql = "select * from tbl_orden_despacho where date(fecha_creacion) between ? and ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(fechaIni.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                od = new OrdenDespacho();
                od.setIdorden(rs.getInt(1));
                od.setEstado(rs.getString(2));
                od.setFecha_creacion(rs.getTimestamp(3));
                od.setUsuario(rs.getInt(4));
                lista.add(od);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int actualizarExistencias(DefaultTableModel modelo){
        String sql = "update tbl_producto set stuckBodega = ?, stuckTienda = ? where codigo = ?";
        Producto producto;
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                producto = new Producto().buscarProducto(modelo.getValueAt(i, 0).toString());
                if(producto.getExistencia_bodega() >= (int) modelo.getValueAt(i,2)){
                    ps.setInt(1, (producto.getExistencia_bodega() - (int) modelo.getValueAt(i, 2)));
                    ps.setInt(2, (producto.getExistencia_tienda() + (int) modelo.getValueAt(i, 2)));
                }else{
                    ps.setInt(1, 0);
                    ps.setInt(2, 0);
                }
                ps.setString(3, modelo.getValueAt(i,0).toString());
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int update(int orden){
        return 0;
    }
    
    public int delete(int orden){
        String sql = "update tbl_orden_despacho set fecha_creacion = fecha_creacion, estado = 'ANULADA' where idorden = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, orden);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int restaurarExistencias(int orden){
        String sql = "select codigo, cantidad from tbl_detalle_orden where idorden = ?";
        String sql2 = "update tbl_producto set stuckBodega = ?, stuckTienda = ? where codigo = ?";
        Object[] dts = new Object[2];
        Producto producto;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps.setInt(1, orden);
            ResultSet rs = ps.executeQuery();
            int rs2 = 0;
            while(rs.next()){
                dts[0] = rs.getString(1);
                dts[1] = rs.getInt(2);
                producto = new Producto().buscarProducto(dts[0].toString());
                ps2.setInt(1, (producto.getExistencia_bodega()) + (int) dts[1]);
                ps2.setInt(2, (producto.getExistencia_tienda()) - (int) dts[1]);
                ps2.setString(3, dts[0].toString());
                rs2 = ps2.executeUpdate();
            }
            rs.close();
            ps2.close();
            ps.close();
            connection.close();
            return rs2;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int getMaxOrden(){
        String sql = "select max(idorden) from tbl_orden_despacho";
        int max = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            max = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return max;
        } catch (SQLException ex) {
            Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int getNo_orden(int orden){
        int existe = 0;
        String sql = "select idorden from tbl_orden_despacho where idorden = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, orden);
            ResultSet rs = ps.executeQuery();
            rs.next();
            existe = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return existe;
        } catch (SQLException ex) {
            //Logger.getLogger(COrdenDespacho.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public javax.swing.JFrame imprimirOrden(int orden){
        try {
            Map parametro = new HashMap();
            parametro.put("orden", orden);
            this.reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\orden_despacho.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro, connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Orden de Despacho No. " + orden);
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            connection.close();
            return jv;
        } catch (JRException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error en Impresión.",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
}
