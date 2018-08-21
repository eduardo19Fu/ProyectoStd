package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import prstd.modelos.NotaCliente;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CNotaCliente {
    
    private ConexionDos conexion;
    private Connection connection;
    private NotaCliente nota_cliente;

    public CNotaCliente() {   
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crear(DefaultTableModel modelo, int cliente){
        String sql = "insert into tbl_nota_cliente values(?,?)";
        int rs = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0; i < modelo.getRowCount(); i++){
                if(!String.valueOf(modelo.getValueAt(i, 5)).isEmpty()){
                    ps.setInt(1, (int) modelo.getValueAt(i, 5));
                    ps.setInt(2, cliente);
                    rs = ps.executeUpdate();
                }
            }
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCliente.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<NotaCliente> listar(int idnota){
        List<NotaCliente> lista = new ArrayList<>();
        String sql = "select * from tbl_nota_cliente where idnota = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idnota);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nota_cliente = new NotaCliente();
                nota_cliente.setNota_credito(rs.getInt(1));
                nota_cliente.setIdcliente(rs.getInt(2));
                lista.add(nota_cliente);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
