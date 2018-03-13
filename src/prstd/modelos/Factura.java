package prstd.modelos;

import java.sql.Timestamp;

/**
 *
 * @author Edfu-Pro
 */
public class Factura {
    
    private int idtransaccion;
    private int no_factura;
    private Timestamp fecha_emision;
    private Double total;
    private int idcliente;
    private int idvendedor;
    private String serie;

    public Factura(){
    }
    
    public Factura(int idtransaccion, int no_factura, Timestamp fecha_emision, Double total, int idcliente, int idvendedor, String serie) {
        this.idtransaccion = idtransaccion;
        this.no_factura = no_factura;
        this.fecha_emision = fecha_emision;
        this.total = total;
        this.idcliente = idcliente;
        this.idvendedor = idvendedor;
        this.serie = serie;
    }

    public int getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(int idtransaccion) {
        this.idtransaccion = idtransaccion;
    }

    public int getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public Timestamp getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Timestamp fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
}
