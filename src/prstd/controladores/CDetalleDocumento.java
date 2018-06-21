/*
 * Controlador 
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.DetalleDocumento;
import prstd.modelos.Documento;
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
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int detalleFactura(List<DetalleDocumento> dc){
        String sql = "insert into tbl_detalle_documento values(?,?,?,?,?)";
        Documento factura = new Documento();
        int rs = 0;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < dc.size(); i ++){
                ps.setInt(1, factura.getMaxTransaccion());
                ps.setString(2, dc.get(i).getCodigo());
                ps.setInt(3, dc.get(i).getCantidad());
                ps.setString(4, dc.get(i).getSerie());
                ps.setDouble(5, dc.get(i).getDescuento());
                rs = ps.executeUpdate();
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CDetalleDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int detalleProforma(){
        return 0;
    }
}
