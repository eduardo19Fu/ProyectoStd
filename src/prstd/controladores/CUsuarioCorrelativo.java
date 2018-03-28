/*
 * Controlador de la clase para usuario_correlativo
 * encargada de manejar todos los procedimientos para asignacion de correlativos.
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.UsuarioCorrelativo;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CUsuarioCorrelativo {
    
    private Connection connection;
    private ConexionDos conexion;
    private UsuarioCorrelativo usuarioc;
    
    public CUsuarioCorrelativo() {
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int grabar(UsuarioCorrelativo uc){
        String sql = "insert into tbl_usuario_correlativo values (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, uc.getIdusuario());
            ps.setString(2, uc.getSerie());
            ps.setInt(3, uc.getCorrelativo_ini());
            ps.setInt(4, uc.getCorrelativo_fin());
            ps.setInt(5,uc.getCorrelativo_act());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int actualizar(UsuarioCorrelativo uc, int idusuario){
        String sql = "update tbl_usuario_correlativo set ";
        return 0;
    }
    
}
