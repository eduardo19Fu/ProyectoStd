package prstd.controladores;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
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
    
    private int crearFactura(Documento factura){
        String sql = "{call sp_factura()}";
        return 0;
    }
    
    private int anular(int idtransaccion){
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
}
