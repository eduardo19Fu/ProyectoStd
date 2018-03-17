package prstd.controladores;

import java.sql.Connection;
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
    }
    
    public int eliminar(Cliente cliente){
        return 0;
    }
    
    public int editar(Cliente cliente){
        return 0;
    }
    
    
    
}
