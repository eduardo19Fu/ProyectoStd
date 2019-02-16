package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.NotaCredito;
import prstd.servicios.ConexionDos;

public class CNotaCredito {
    
    private ConexionDos conexion;
    private Connection connection;
    private NotaCredito nota_credito;
    
    public CNotaCredito(){
        
        conexion = new ConexionDos();
        connection = conexion.getConnection();
        
    }
    
    public int crear(NotaCredito nc){
        String sql = "insert into tbl_nota_credito(cod_producto,saldo_pendiente,fecha_creacion,estado) values(?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nc.getCod_producto());
            ps.setDouble(2, nc.getSaldo_pendiente());
            ps.setTimestamp(3, nc.getFecha_creacion());
            ps.setString(4, nc.getEstado());
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
        String sql = "select nc.idnota,p.nombre_producto,cl.nombre,dc.no_documento,nc.fecha_creacion,nc.estado\n" +
                    "from tbl_nota_credito nc\n" +
                    "inner join tbl_producto p on nc.cod_producto = p.codigo\n" +
                    "inner join tbl_nota_cliente ncl on ncl.idnota = nc.idnota\n" +
                    "inner join tbl_cliente cl on ncl.idcliente = cl.idcliente\n" +
                    "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                    "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                    "where date(nc.fecha_creacion) = curdate()";
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
                datos[4] = rs.getTimestamp(5);
                datos[5] = rs.getString(6);
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
        String sql = "select nc.idnota,p.nombre_producto,cl.nombre,dc.no_documento,nc.fecha_creacion,nc.estado\n" +
                    "from tbl_nota_credito nc\n" +
                    "inner join tbl_producto p on nc.cod_producto = p.codigo\n" +
                    "inner join tbl_nota_cliente ncl on ncl.idnota = nc.idnota\n" +
                    "inner join tbl_cliente cl on ncl.idcliente = cl.idcliente\n" +
                    "inner join tbl_nota_transaccion nt on nt.idnota = nc.idnota\n" +
                    "inner join tbl_documento dc on dc.idtransaccion = nt.idtransaccion\n" +
                    "where date(fecha_creacion) between ? and ?";
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
                datos[4] = rs.getTimestamp(5);
                datos[5] = rs.getString(6);
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
}
