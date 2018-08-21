/*
 * Controlador de la clase para usuario_correlativo
 * encargada de manejar todos los procedimientos para asignacion de correlativos.
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String sql = "insert into tbl_usuario_correlativo values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, uc.getIdusuario());
            ps.setString(2, uc.getSerie());
            ps.setInt(3, uc.getCorrelativo_ini());
            ps.setInt(4, uc.getCorrelativo_fin());
            ps.setInt(5,uc.getCorrelativo_act());
            ps.setInt(6, uc.getTipo_correlativo());
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
    
    public boolean verificarUsuario(int idusuario){
        String sql = "select 1 from tbl_usuario_correlativo where idusuario = ? and tipo_correlativo = 1";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ResultSet rs = ps.executeQuery();
            boolean resultado = rs.next();
            rs.close();
            ps.close();
            connection.close();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean verificarProforma(int idusuario){
        String sql = "select 1 from tbl_usuario_correlativo where idusuario = ? and tipo_correlativo = 2";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ResultSet rs = ps.executeQuery();
            boolean resultado = rs.next();
            rs.close();
            ps.close();
            connection.close();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public UsuarioCorrelativo getActual(int idusuario){
        String sql = "select * from tbl_usuario_correlativo where idusuario = ? and tipo_correlativo = 1";
        UsuarioCorrelativo ucorr = new UsuarioCorrelativo();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ucorr.setIdusuario(rs.getInt(1));
            ucorr.setSerie(rs.getString(2));
            ucorr.setCorrelativo_ini(rs.getInt(3));
            ucorr.setCorrelativo_fin(rs.getInt(4));
            ucorr.setCorrelativo_act(rs.getInt(5));
            rs.close();
            ps.close();
            connection.close();
            return ucorr;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public UsuarioCorrelativo getProformaActual(int idusuario){
        String sql = "select * from tbl_usuario_correlativo where idusuario = ? and tipo_correlativo = 2";
        UsuarioCorrelativo ucorr = new UsuarioCorrelativo();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ucorr.setIdusuario(rs.getInt(1));
            ucorr.setSerie(rs.getString(2));
            ucorr.setCorrelativo_ini(rs.getInt(3));
            ucorr.setCorrelativo_fin(rs.getInt(4));
            ucorr.setCorrelativo_act(rs.getInt(5));
            rs.close();
            ps.close();
            connection.close();
            return ucorr;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String serie(int idusuario){
        String sql = "select serie from tbl_usuario_correlativo where idusuario = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String serie = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return serie;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int avanzaCorrelativo(int id, int correlativo, int tipo){
        String sql = "update tbl_usuario_correlativo set correlativo_actual = ? where idusuario = ? and tipo_correlativo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, correlativo + 1);
            ps.setInt(2, id);
            ps.setInt(3, tipo);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
