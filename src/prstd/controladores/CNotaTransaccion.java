package prstd.controladores;

import java.sql.Connection;
import prstd.modelos.NotaCredito;
import prstd.modelos.NotaTransaccion;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CNotaTransaccion {

    private ConexionDos conexion;
    private Connection connection;
    private NotaTransaccion nt;
    private NotaCredito nc;
    
    public CNotaTransaccion(){
        
    }
}
