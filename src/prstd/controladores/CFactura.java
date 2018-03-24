package prstd.controladores;

import java.util.Date;
import java.util.List;
import prstd.modelos.Documento;

/**
 *
 * @author Edfu-Pro
 */
public class CFactura {
    
    public CFactura(){
    }
    
    private int crearFactura(Documento factura){
        String sql = "{call }";
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
