package prstd.controladores;

import prstd.modelos.Emisor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Cliente;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CDatosEmisor {
    
    private ConexionDos conexion;
    private Connection connection;
    private Emisor datosEmisor;
    
    public CDatosEmisor(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public Emisor consultar(){
        String sql = "SELECT * FROM tbl_datos_emisor LIMIT 1";
        Emisor datosEmisor = new Emisor();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            datosEmisor.setId(rs.getInt(1));
                datosEmisor.setCodigo_postal(rs.getString(2));
                datosEmisor.setCorreo_emisor(rs.getString(3));
                datosEmisor.setDepartamento(rs.getString(4));
                datosEmisor.setMunicipio(rs.getString(5));
                datosEmisor.setDireccion(rs.getString(6));
                datosEmisor.setNit(rs.getString(7));
                datosEmisor.setNombre_comercial(rs.getString(8));
                datosEmisor.setNombre_emisor(rs.getString(9));
            rs.close();
            ps.close();
            connection.close();
            return datosEmisor;
        } catch (SQLException ex) {
            Logger.getLogger(CDatosEmisor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
