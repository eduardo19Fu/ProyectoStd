/*
 * Controlador de la clase para usuario_correlativo
 * encargada de manejar todos los procedimientos para asignacion de correlativos.
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prstd.modelos.UsuarioCorrelativo;
import prstd.servicios.ConexionDos;

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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int actualizar(UsuarioCorrelativo uc, int idusuario, int tipo){
        String sql = "update tbl_usuario_correlativo set correlativo_inicial = ?, correlativo_final = ?, correlativo_actual = ? where idusuario = ? and tipo_correlativo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, uc.getCorrelativo_ini());
            ps.setInt(2, uc.getCorrelativo_fin());
            ps.setInt(3, uc.getCorrelativo_act());
            ps.setInt(4, idusuario);
            ps.setInt(5, tipo);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public List<Object> listar(){
        String sql = "select uc.idusuario,u.usuario, uc.serie, uc.correlativo_inicial, uc.correlativo_final, uc.correlativo_actual, td.tipo_documento\n"
                    + "from tbl_usuario_correlativo uc\n"
                    + "inner join tbl_usuario u on u.idusuario = uc.idusuario\n"
                    + "inner join tbl_tipo_documento td on td.idtipodocumento = uc.tipo_correlativo\n"
                    + "where u.estado = 'ACTIVO'";
        List<Object> lista = new ArrayList<>();
        Object[] datos;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos = new Object[7];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getInt(6);
                datos[6] = rs.getString(7);
                lista.add(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Object> listar(String usuario){
        String sql = "select uc.idusuario,u.usuario, uc.serie, uc.correlativo_inicial, uc.correlativo_final, uc.correlativo_actual, td.tipo_documento\n"
                    + "from tbl_usuario_correlativo uc\n"
                    + "inner join tbl_usuario u on u.idusuario = uc.idusuario\n"
                    + "inner join tbl_tipo_documento td on td.idtipodocumento = uc.tipo_correlativo\n"
                    + "where u.estado = 'ACTIVO' and usuario like ?";
        List<Object> lista = new ArrayList<>();
        Object[] datos;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + usuario + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos = new Object[7];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getInt(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getInt(6);
                datos[6] = rs.getString(7);
                lista.add(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public UsuarioCorrelativo consultarCorr(int idusuario, int tipo){
        String sql = "select * from tbl_usuario_correlativo where idusuario = ? and tipo_correlativo = ?";
        UsuarioCorrelativo uc = new UsuarioCorrelativo();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setInt(2, tipo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            uc.setIdusuario(rs.getInt(1));
            uc.setSerie(rs.getString(2));
            uc.setCorrelativo_ini(rs.getInt(3));
            uc.setCorrelativo_fin(rs.getInt(4));
            uc.setCorrelativo_act(rs.getInt(5));
            uc.setTipo_correlativo(rs.getInt(6));
            rs.close();
            ps.close();
            connection.close();
            return uc;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public int consultarTipo(String tipo){
        String sql = "select idtipodocumento from tbl_tipo_documento where tipo_documento = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int idtipo = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return idtipo;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public String consultarTipo(int tipo){
        String sql = "select tipo_documento from tbl_tipo_documento where idtipodocumento = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, tipo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String tipodoc = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return tipodoc;
        } catch (SQLException ex) {
            Logger.getLogger(CUsuarioCorrelativo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
