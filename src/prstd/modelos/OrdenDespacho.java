package prstd.modelos;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import prstd.controladores.COrdenDespacho;

public class OrdenDespacho {
    
    private int idorden;
    private String estado;
    private Timestamp fecha_creacion;
    private int usuario;

    public OrdenDespacho(){}
    
    public int getIdorden() {
        return idorden;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    
    /*
        Mëtodos controlador para las Ordenes de despacho.
    */
    
    public int create(OrdenDespacho orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.create(orden);
    }
    
    public List<OrdenDespacho> read(){
        COrdenDespacho co = new COrdenDespacho();
        return co.read();
    }
    
    public List<OrdenDespacho> read(Date fechaIni, Date fechaFin){
        COrdenDespacho co = new COrdenDespacho();
        return co.read(fechaIni, fechaFin);
    }
    
    public int detalle(DefaultTableModel modelo, int orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.detalle(modelo, orden);
    }
    
    public int actualizarExistencias(DefaultTableModel modelo){
        COrdenDespacho co = new COrdenDespacho();
        return co.actualizarExistencias(modelo);
    }
    
    public int restaurarExistencias(int orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.restaurarExistencias(orden);
    }
    
    public int update(int orden){
        return 0;
    }
    
    public int delete(int orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.delete(orden);
    }
    
    public int getMaxOrden(){
        COrdenDespacho co = new COrdenDespacho();
        return co.getMaxOrden();
    }
    
    public int getNo_orden(int orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.getNo_orden(orden);
    }
    
    public javax.swing.JFrame imprimirOrden(int orden){
        COrdenDespacho co = new COrdenDespacho();
        return co.imprimirOrden(orden);
    }
}
