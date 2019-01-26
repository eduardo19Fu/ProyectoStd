package prstd.modelos;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import prstd.controladores.CNotaCredito;

/**
 *
 * @author Edfu-Pro
 */
public class NotaCredito {
    
    private int idnota;
    private String cod_producto;
    private double saldo_pendiente;
    private Timestamp fecha_creacion;
    private String estado;

    public NotaCredito() {
    }

    public NotaCredito(int idnota, String cod_producto, double saldo_pendiente, Timestamp fecha_creacion, String estado) {
        this.idnota = idnota;
        this.cod_producto = cod_producto;
        this.saldo_pendiente = saldo_pendiente;
        this.fecha_creacion = fecha_creacion;
        this.estado = estado;
    }

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public double getSaldo_pendiente() {
        return saldo_pendiente;
    }

    public void setSaldo_pendiente(double saldo_pendiente) {
        this.saldo_pendiente = saldo_pendiente;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /*
        Métodos controlador de Nota Credito
    */

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
    public int crear(NotaCredito nc){
        CNotaCredito cn = new CNotaCredito();
        return cn.crear(nc);
    }
    
    public int notaMax(String codigo){
        CNotaCredito cn = new CNotaCredito();
        return cn.notaMax(codigo);
    }
    
    public int update(DefaultTableModel modelo){
        CNotaCredito cn = new CNotaCredito();
        return cn.update(modelo);
    }
    
    public int anular(int idnota){
        CNotaCredito cn = new CNotaCredito();
        return cn.anular(idnota);
    }
    
    public List<NotaCredito> listar(){
        CNotaCredito cn = new CNotaCredito();
        return cn.listar();
    }
    
    public List<Object> consultar(){
        CNotaCredito cn = new CNotaCredito();
        return cn.consultar();
    }
    
    public List<Object> consultar(Date fechaIni, Date fechaFin){
        CNotaCredito cn = new CNotaCredito();
        return cn.consultar(fechaIni,fechaFin);
    }
}
