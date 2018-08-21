package prstd.controladores;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "insert into tbl_documento values(?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, proforma.getIdtransaccion());
            ps.setInt(2, proforma.getNo_documento());
            ps.setTimestamp(3, proforma.getFecha_emision());
            ps.setDouble(4, proforma.getTotal());
            ps.setInt(5, proforma.getIdcliente());
            ps.setInt(6, proforma.getIdvendedor());
            ps.setString(7, proforma.getSerie());
            ps.setString(8, proforma.getEstado());
            ps.setInt(9, proforma.getTipo_documento());
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
                ps.setDouble(5, 0.00);
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
        String sql = "select * from tbl_documento where tipo_documento = 1 and date(fecha_emision) = curdate()";
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
    
    public int delete(){
        return 0;
    }
    
    public javax.swing.JFrame imprimirProforma(int transac, int no_proforma, String serie, double total){
        try {
            Auxiliar aux = new Auxiliar();
            Map parametro = new HashMap();
            parametro.put("no_proforma", no_proforma);
            parametro.put("serie", serie);
            parametro.put("transac", transac);
            parametro.put("texto", aux.Convertir(String.valueOf(total), true));
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\proforma.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Factura No. \"" + no_proforma + "\"");
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