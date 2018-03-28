/*
 * Controlador 
 */
package prstd.controladores;

import java.sql.Connection;
import prstd.modelos.DetalleDocumento;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CDetalleDocumento {
    
    private ConexionDos conexion;
    private Connection connection;
    private DetalleDocumento dc;
    
    public CDetalleDocumento(){
    }
    
    public int detalleFactura(){
        return 0;
    }
    
    public int detalleProforma(){
        return 0;
    }
}
