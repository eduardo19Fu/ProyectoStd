package prstd.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prstd.modelos.Documento;
import prstd.modelos.NotaCredito;
import prstd.modelos.NotaTransaccion;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CNotaTransaccion {

    private ConexionDos conexion;
    private Connection connection;
    private NotaTransaccion nt;
    private NotaCredito nc;
    
    public CNotaTransaccion(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int crear(NotaTransaccion nt, Documento documento){
        String sql = "insert into tbl_nota_transaccion(idtransaccion,idnota) values(?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, documento.getMaxTransaccion());
            ps.setInt(2, nc.getIdnota());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<NotaTransaccion> listar(){
        List<NotaTransaccion> lista = new ArrayList<>();
        String sql = "select * from tbl_nota_transaccion";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nt = new NotaTransaccion();
                nt.setDocumento(rs.getInt(1));
                nt.setNota(rs.getInt(2));
                lista.add(nt);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CNotaTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
