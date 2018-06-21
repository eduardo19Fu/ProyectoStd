package prstd.modelos;

import java.sql.Timestamp;
import prstd.controladores.CFactura;

/**
 *
 * @author Edfu-Pro
 */
public class Documento {
    
    private int idtransaccion;
    private int no_documento;
    private Timestamp fecha_emision;
    private Double total;
    private int idcliente;
    private int idvendedor;
    private String serie;
    private int tipo_documento;

    public Documento(){
    }
    
    public Documento(int idtransaccion, int no_documento, Timestamp fecha_emision, Double total, int idcliente, int idvendedor, String serie) {
        this.idtransaccion = idtransaccion;
        this.no_documento = no_documento;
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

    public int getNo_documento() {
        return no_documento;
    }

    public void setNo_documento(int no_documento) {
        this.no_documento = no_documento;
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

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
    public int getMaxTransaccion(){
        CFactura cf = new CFactura();
        return cf.getMaxTransaccion();
    }
    
    public int crearFactura(Documento documento){
        CFactura cf = new CFactura();
        return cf.crearFactura(documento);
    }
    
}
