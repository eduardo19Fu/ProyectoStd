package prstd.modelos;

import java.sql.Timestamp;
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
   
    */

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
    public int crear(NotaCredito nc){
        CNotaCredito cn = new CNotaCredito();
        return cn.crear(nc);
    }
}
