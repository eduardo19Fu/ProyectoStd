package prstd.controladores;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Documento;
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
        String sql = "insert into tbl_documento values(?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, factura.getNo_documento());
            ps.setTimestamp(2, factura.getFecha_emision());
            ps.setDouble(3, factura.getTotal());
            ps.setInt(4, factura.getIdcliente());
            ps.setInt(5, factura.getIdvendedor());
            ps.setString(6, factura.getSerie());
            ps.setString(7, "PAGADA");
            ps.setInt(8, factura.getTipo_documento());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    private int anular(int idtransaccion, int no_documento, String serie){
        return 0;
    }
    
    private List<Documento> consultarTransacciones(){
        return null;
    }
    
    private List<Documento> consultarTransacciones(int no_factura){
        return null;
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
}
