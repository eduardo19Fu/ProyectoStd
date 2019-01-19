package prstd.controladores;

import java.io.File;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import prstd.gui.Auxiliar;
import prstd.modelos.Documento;
import prstd.modelos.Producto;
import prstd.servicios.ConexionDos;

public class CProforma {
    
    private Connection connection;
    private ConexionDos conexion;
    private Documento documento;
    private JasperReport reporte;

    public CProforma(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int insert(Documento proforma){
        String sql = "insert into tbl_documento values(?,?,current_timestamp(),?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, proforma.getIdtransaccion());
            ps.setInt(2, proforma.getNo_documento());
            //ps.setTimestamp(3, proforma.getFecha_emision());
            ps.setDouble(3, proforma.getTotal());
            ps.setInt(4, proforma.getIdcliente());
            ps.setInt(5, proforma.getIdvendedor());
            ps.setString(6, proforma.getSerie());
            ps.setString(7, proforma.getEstado());
            ps.setInt(8, proforma.getTipo_documento());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int insertDetalle(DefaultTableModel modelo, int transaccion, String serie){
        String sql = "insert into tbl_detalle_documento values(?,?,?,?,?,?,?)";
        int rs = 0;
        Producto producto = new Producto();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                ps.setInt(1, transaccion);
                ps.setString(2, modelo.getValueAt(i, 1).toString());
                ps.setInt(3, (int) modelo.getValueAt(i, 0));
                ps.setDouble(4, (double) modelo.getValueAt(i, 4));
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
            return 0;
        }
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
    
    public List<Documento> consultar(){
        String sql = "select * from tbl_documento where tipo_documento = 2 and date(fecha_emision) = curdate()";
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
            return null;
        }
    }
    
    public List<Documento> consultar(Date fechaIni, Date fechaFin){
        String sql = "select * from tbl_documento where tipo_documento = 2 and date(fecha_emision) between ? and ?";
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
            return null;
        }
    }
    
    public int delete(int transaccion){
        String sql = "update tbl_documento set fecha_emision = fecha_emision,estado = 'ANULADA' where idtransaccion = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, transaccion);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProforma.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public javax.swing.JFrame imprimirProforma(int transac, int no_proforma, String serie, double total){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("no_proforma", no_proforma);
            parametro.put("serie", serie);
            parametro.put("transac", transac);
            parametro.put("texto", aux.Convertir(String.format("%.2f", total), true));
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\proforma.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Proforma No. \"" + no_proforma + "\"");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            connection.close();
            return jv;
        } catch (JRException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public javax.swing.JFrame imprimirSimple(int transac, int no_proforma, String serie, double total){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("no_proforma", no_proforma);
            parametro.put("serie", serie);
            parametro.put("transaccion", transac);
            parametro.put("texto", aux.Convertir(String.format("%.2f",total), true));
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\simple.jrxml");
            System.out.println(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\simple.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Proforma Simple No. \"" + no_proforma + "\"");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            connection.close();
            return jv;
        } catch (JRException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}