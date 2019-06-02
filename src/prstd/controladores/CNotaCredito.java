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
import prstd.modelos.NotaCredito;
import prstd.servicios.ConexionDos;

public class CNotaCredito {
    
    private ConexionDos conexion;
    private Connection connection;
    private NotaCredito nota_credito;
    private JasperReport reporte;
    public CNotaCredito(){
        
        conexion = new ConexionDos();
        connection = conexion.getConnection();
        
    }
    
    public int crear(NotaCredito nc){
        String sql = "insert into tbl_nota_credito(cod_producto,saldo_pendiente,cantidad,fecha_creacion,estado) values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nc.getCod_producto());
            ps.setDouble(2, nc.getSaldo_pendiente());
            ps.setInt(3, nc.getCantidad());
            ps.setTimestamp(4, nc.getFecha_creacion());
            ps.setString(5, nc.getEstado());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int update(DefaultTableModel modelo){
        String sql = "update tbl_nota_credito set estado = 'ACTIVA' where idnota = ?";
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                if(!modelo.getValueAt(i, 6).toString().equals("")){
                    ps.setInt(1, (int) modelo.getValueAt(i, 6));
                    rs = ps.executeUpdate();
                }
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int anular(int idnota){
        String sql = "update tbl_nota_credito set estado = 'ANULADA' where idnota = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idnota);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public List<NotaCredito> listar(){
        String sql = "select * from tbl_nota_credito";
        List<NotaCredito> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nota_credito = new NotaCredito();
                nota_credito.setIdnota(rs.getInt(1));
                nota_credito.setCod_producto(rs.getString(2));
                nota_credito.setSaldo_pendiente(rs.getDouble(3));
                nota_credito.setFecha_creacion(rs.getTimestamp(4));
                nota_credito.setEstado(rs.getString(5));
                lista.add(nota_credito);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Object> consultar(){
        String sql =    "select c.idcliente, c.nombre, c.nit, count(nc.idnota) notas,dc.no_documento, dc.fecha_emision\n" +
                        "from tbl_cliente c\n" +
                        "inner join tbl_nota_cliente ncl on ncl.idcliente = c.idcliente \n" +
                        "inner join tbl_nota_credito nc on nc.idnota = ncl.idnota\n" +
                        "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                        "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                        "where nc.estado = 'ACTIVA' and date(nc.fecha_creacion) = curdate()\n" +
                        "group by c.nombre, nt.idtransaccion;";
        List<Object> lista = new ArrayList<>();
        Object[] datos;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos = new Object[6];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getTimestamp(6);
                lista.add(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Object> consultar(Date fechaIni, Date fechaFin){
        String sql =    "select c.idcliente, c.nombre, c.nit, count(nc.idnota) notas,dc.no_documento, dc.fecha_emision\n" +
                        "from tbl_cliente c\n" +
                        "inner join tbl_nota_cliente ncl on ncl.idcliente = c.idcliente \n" +
                        "inner join tbl_nota_credito nc on nc.idnota = ncl.idnota\n" +
                        "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                        "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                        "where nc.estado = 'ACTIVA' and date(dc.fecha_emision) between ? and ?\n" +
                        "group by c.nombre, nt.idtransaccion;";
        List<Object> lista = new ArrayList<>();
        Object[] datos;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(fechaIni.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos = new Object[6];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getTimestamp(6);
                lista.add(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Object> consultar(String valor){
        String sql =    "select c.idcliente, c.nombre, c.nit, count(nc.idnota) notas,dc.no_documento, dc.fecha_emision\n" +
                        "from tbl_cliente c\n" +
                        "inner join tbl_nota_cliente ncl on ncl.idcliente = c.idcliente \n" +
                        "inner join tbl_nota_credito nc on nc.idnota = ncl.idnota\n" +
                        "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                        "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                        "where nc.estado = 'ACTIVA' and (c.nombre like ? or cast(nt.idtransaccion as char) like ? or c.nit like ?)\n" +
                        "group by c.nombre, nt.idtransaccion;";
        List<Object> lista = new ArrayList<>();
        Object[] datos;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + valor + "%");
            ps.setString(2, "%" + valor + "%");
            ps.setString(3, "%" + valor + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos = new Object[6];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getTimestamp(6);
                lista.add(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public int notaMax(String codigo){
        String sql = "select max(idnota) from tbl_nota_credito where cod_producto = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int nota = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return nota;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public DefaultTableModel notasPendientes(int idcliente){
        String titulos[] = {"Codigo","Nombre","Saldo Pendiente","No. Factura","Fecha Creacion"};
        Object[] datos = new Object[5];
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        String sql = "select nc.cod_producto, pr.nombre_producto, " +
                            "nc.saldo_pendiente, dc.no_documento, nc.fecha_creacion\n" +
                    "from tbl_nota_credito nc\n" +
                    "inner join tbl_producto pr on nc.cod_producto = pr.codigo\n" +
                    "inner join tbl_nota_cliente ncl on ncl.idnota = nc.idnota\n" +
                    "inner join tbl_cliente cl on cl.idcliente = ncl.idcliente\n" +
                    "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                    "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                    "where cl.idcliente = ? and nc.estado = 'ACTIVA'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idcliente);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getDouble(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getTimestamp(5);
                model.addRow(datos);
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // Controlador que se encarga de la impresión de las notas de crédito pendientes de determinado cliente
    public javax.swing.JFrame imprimirPendientes(int idcliente){
        try {
            Map parametro = new HashMap();
            parametro.put("idcliente", idcliente);
            reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\reporte_notas.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, parametro, connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Notas de Crédito Pendientes");
            jv.setVisible(true);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            connection.close();
            return jv;
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Facturación",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
