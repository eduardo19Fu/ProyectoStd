package prstd.modelos;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author Edfu-Pro
 */
public class Producto {
    
    private String codigo;
    private String nombre;
    private Double precio_compra;
    private Double precio_venta;
    private Timestamp fecha_compra;
    private Date fecha_vencimiento;
    private int fabricante;
    private int familia;
    private int existencia;
    private Double porcentaje_ganancia;
    private int tipo_producto;
    private int existencia_minima;
    
    public Producto(){
    }

    public Producto(String codigo, String nombre, Double precio_compra, Double precio_venta, Timestamp fecha_compra, Date fecha_vencimiento, 
                    int fabricante, int familia, int existencia, Double porcentaje_ganancia, int tipo_producto, int existencia_minima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.fecha_compra = fecha_compra;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fabricante = fabricante;
        this.familia = familia;
        this.existencia = existencia;
        this.porcentaje_ganancia = porcentaje_ganancia;
        this.tipo_producto = tipo_producto;
        this.existencia_minima = existencia_minima;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Timestamp getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Timestamp fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Double getPorcentaje_ganancia() {
        return porcentaje_ganancia;
    }

    public void setPorcentaje_ganancia(Double porcentaje_ganancia) {
        this.porcentaje_ganancia = porcentaje_ganancia;
    }

    public int getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(int tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getExistencia_minima() {
        return existencia_minima;
    }

    public void setExistencia_minima(int existencia_minima) {
        this.existencia_minima = existencia_minima;
    }
    
    
}
