package prstd.controladores;

import java.sql.CallableStatement;
import java.sql.Connection;
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
        String sql = "{call sp_factura()}";
        String sql2 = "{call sp_detalleFactura()}";
        
        try {
            CallableStatement cl = connection.prepareCall(sql);
            int rs = cl.executeUpdate();
            if(rs > 0){
                CallableStatement cl2 = connection.prepareCall(sql2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
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
    
    private int facturaVarios(){
        return 0;
    }
}
