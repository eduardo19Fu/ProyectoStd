package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Cliente;
import prstd.modelos.ClienteMayor;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CClienteMayor extends CCliente{
    
    private ConexionDos conexion;
    private Connection connection;
    private ClienteMayor cm;
    
    public CClienteMayor(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crear(ClienteMayor cm){
        String sql = "inserto into tbl_cliente_mayor values (?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cm.getTelefono());
            ps.setString(2, cm.getEmail());
            ps.setInt(3, cm.getIdcliente());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CClienteMayor.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminar(Cliente cliente){
        return 0;
    }
    
    public int editar(Cliente cliente){
        return 0;
    }
    
    
    
}
