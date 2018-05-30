/*
    Clase que funciona para asignar permisos a los usuarios registrados, instanciando de Rol, Usuario y Permiso, 
    asi como sus controladores CRol, CUsuario y CPermiso.
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
import prstd.modelos.Permisos;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CPermisos {
    
    private ConexionDos conexion;
    private Connection connection;
    private Permisos permisos;
    
    public CPermisos(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public List<Permisos> listar(int rol){
        String sql = "select idpermiso from tbl_rol_permiso where idrol = ?";
        List<Permisos> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, rol);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                permisos = new Permisos();
                permisos.setIdpermiso(rs.getInt(1));
                lista.add(permisos);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CPermisos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
