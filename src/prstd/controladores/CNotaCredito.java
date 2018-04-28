package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.NotaCredito;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CNotaCredito {
    
    private ConexionDos conexion;
    private Connection connection;
    private NotaCredito nota_credito;
    
    public CNotaCredito(){
        
        conexion = new ConexionDos();
        connection = conexion.getConnection();
        
    }
    
    public int crear(NotaCredito nc){
        String sql = "insert into tbl_nota_credito values(?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, nc.getIdnota());
            ps.setString(2, nc.getCod_producto());
            ps.setDouble(3, nc.getSaldo_pendiente());
            ps.setDate(4, new java.sql.Date(nc.getFecha_creacion().getTime()));
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<NotaCredito> listar(){
        String sql = "select * from tbl_nota_credito";
        List<NotaCredito> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nota_credito = new NotaCredito();
                nota_credito.setIdnota(rs.getInt(1));
                nota_credito.setCod_producto(rs.getString(2));
                nota_credito.setSaldo_pendiente(rs.getDouble(3));
                nota_credito.setFecha_creacion(rs.getDate(4));
                lista.add(nota_credito);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaCredito.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
