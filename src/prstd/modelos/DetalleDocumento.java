/*
 * Modelo del detalle que funcionara para la creacion de los documentos de factura y proforma.
 */
package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class DetalleDocumento{
    
    private int idtransaccion;
    private String codigo;
    private int cantidad;
    private String serie;
    private double subtotal;
    
    public DetalleDocumento(){
    
    }

    public int getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(int idtransaccion) {
        this.idtransaccion = idtransaccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
