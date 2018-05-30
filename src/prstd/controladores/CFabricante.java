/*
 * Controlador del modelo Fabricante.
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
import prstd.modelos.Fabricante;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CFabricante {
    
    private Fabricante fabricante;
    private ConexionDos conexion;
    private Connection connection;
    
    public CFabricante(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public List<Fabricante> listar(){
        String sql = "select * from tbl_fabricante";
        List<Fabricante> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.fabricante = new Fabricante();
                this.fabricante.setIdfabricante(rs.getInt(1));
                this.fabricante.setNombre_fabricante(rs.getString(2));
                this.fabricante.setObservaciones(rs.getString(3));
                lista.add(this.fabricante);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CFabricante.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int getId(String fabricante){
        String sql = "select idfabricante from tbl_fabricante where nombre_fabricante = ?";
        int id = 0;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, fabricante);
            ResultSet rs = ps.executeQuery();
            rs.next();
            id = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(CFabricante.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int registrar(Fabricante fabricante){
        String sql = "insert into tbl_fabricante(idfabricante,nombre_fabricante,observaciones) values(?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, fabricante.getIdfabricante());
            ps.setString(2, fabricante.getNombre_fabricante());
            ps.setString(3, fabricante.getObservaciones());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CFabricante.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int getMaxFabricante(){
        String sql = "select getMaxFabricante()";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int max = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return max;
        } catch (SQLException ex) {
            Logger.getLogger(CFabricante.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}