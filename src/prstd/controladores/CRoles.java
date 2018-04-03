/*
 * Clase encargada de manejar la asignación de roles al sistema.
 */
package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.Rol;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CRoles {
    
    private Connection connection;
    private ConexionDos conexion;
    private Rol rol;
    
    public CRoles(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int grabar(int idusuario, DefaultTableModel modelo){
        String sql = "insert into tbl_usuario_rol values(?,?)";
        int rs = 0;
        rol = new Rol();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i<= modelo.getRowCount(); i++){
                ps.setInt(1, idusuario);
                ps.setInt(2, rol.consultar(String.valueOf(modelo.getValueAt(i, 0))));
            }
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CRoles.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public DefaultTableModel listadoRoles(String usuario){
        String[] titulos = {"Rol ID","Nombre del Rol","Descripcion"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        Object[] datos = new Object[3];
        String sql =    "select r.*\n" +
                        "from tbl_rol r, tbl_usuario_rol ur, tbl_usuario u\n" +
                        "where r.idrol = ur.idrol and u.idusuario = ur.idusuario and u.usuario = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            rs.close();
            ps.close();
            connection.close();
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(CRoles.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
