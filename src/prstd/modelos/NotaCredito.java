package prstd.modelos;

import java.util.Date;

/**
 *
 * @author Edfu-Pro
 */
public class NotaCredito {
    
    private int idnota;
    private String cod_producto;
    private double saldo_pendiente;
    private Date fecha_creacion;

    public NotaCredito() {
    }

    public NotaCredito(int idnota, String cod_producto, double saldo_pendiente, Date fecha_creacion) {
        this.idnota = idnota;
        this.cod_producto = cod_producto;
        this.saldo_pendiente = saldo_pendiente;
        this.fecha_creacion = fecha_creacion;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
