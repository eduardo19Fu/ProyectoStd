package prstd.modelos;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import prstd.controladores.CProducto;

/**
 *
 * @author Edfu-Pro
 */
public class Producto {
    
    private String codigo;
    private String nombre;
    private Double precio_compra;
    private Double precio_venta;
    private Date fecha_compra;
    private Date fecha_vencimiento;
    private int fabricante;
    private int familia;
    private int existencia_tienda;
    private int existencia_bodega;
    private Double porcentaje_ganancia;
    private int tipo_producto;
    private int existencia_minima_tienda;
    private int existencia_minima_bodega;
    
    private String nombre_fabricante;
    private String nombre_familia;
    
    public Producto(){
    }

    public Producto(String codigo, String nombre, Double precio_compra, Double precio_venta, Date fecha_compra, Date fecha_vencimiento, 
                    int fabricante, int familia, int existencia_tienda, int existencia_bodega,Double porcentaje_ganancia, int tipo_producto, int existencia_minima_tienda,
                    int existencia_minima_bodega,String nombre_fabricante, String nombre_familia) 
    
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.fecha_compra = fecha_compra;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fabricante = fabricante;
        this.familia = familia;
        this.existencia_tienda = existencia_tienda;
        this.existencia_bodega = existencia_bodega;
        this.porcentaje_ganancia = porcentaje_ganancia;
        this.tipo_producto = tipo_producto;
        this.existencia_minima_tienda = existencia_minima_tienda;
        this.existencia_minima_bodega = existencia_minima_bodega;
        this.nombre_fabricante = nombre_fabricante;
        this.nombre_familia = nombre_familia;
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

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
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

    public int getExistencia_tienda() {
        return existencia_tienda;
    }

    public void setExistencia_tienda(int existencia_tienda) {
        this.existencia_tienda = existencia_tienda;
    }
    
    public int getExistencia_bodega(){
        return existencia_bodega;
    }
    
    public void setExistencia_bodega(int existencia_bodega){
        this.existencia_bodega = existencia_bodega;
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

    public int getExistencia_minima_tienda() {
        return existencia_minima_tienda;
    }

    public void setExistencia_minima_tienda(int existencia_minima_tienda) {
        this.existencia_minima_tienda = existencia_minima_tienda;
    }
    
    public int getExsitencia_minima_bodega(){
        return existencia_minima_bodega;
    }
    
    public void setExistencia_minima_bodega(int existencia_minima_bodega){
        this.existencia_minima_bodega = existencia_minima_bodega;
    }
    
    public String getNombre_familia(){
        return nombre_familia;
    }
    
    public void setNombre_Familia(String nombre_familia){
        this.nombre_familia = nombre_familia;
    }
    
    public String getNombre_fabricante(){
        return nombre_fabricante;
    }
    
    public void setNombre_fabricante(String nombre_fabricante){
        this.nombre_fabricante = nombre_fabricante;
    }
    /*
        * Métodos controlador de la clase Producto  
    */
    public int crear(Producto producto){
        CProducto cp = new CProducto();
        return cp.registroProducto(producto);
    }
    
    public List<Producto> buscarProductos(){
        CProducto cp = new CProducto();
        return cp.buscarProductos();
    }
    
    public String calcularPrecioVenta(String precioCosto, String porcentaje) throws NumberFormatException{
        CProducto cp = new CProducto();
        return cp.calcularPrecioVenta(precioCosto, porcentaje);
    }
    
    public List<Producto> buscarProductos(String codigo){
        CProducto cp = new CProducto();
        return cp.buscarProductos(codigo);
    }
    
    public String getCodigo(Producto producto){
        CProducto cp = new CProducto();
        return cp.getCodigo(producto);
    }
}