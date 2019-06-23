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
    private int cantidad;
    private Timestamp fecha_despacho;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Timestamp getFecha_despacho() {
        return fecha_despacho;
    }

    public void setFecha_despacho(Timestamp fecha_despacho) {
        this.fecha_despacho = fecha_despacho;
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
    
    public int anular(int no_documento){
        CNotaCredito cn = new CNotaCredito();
        return cn.anular(no_documento);
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
    
    public DefaultTableModel notasPendientes(int idcliente){
        CNotaCredito cn = new CNotaCredito();
        return cn.notasPendientes(idcliente);
    }
    
    public List<Object> consultar(String valor){
        CNotaCredito cn = new CNotaCredito();
        return cn.consultar(valor);
    }
    
    public javax.swing.JFrame imprimirPendientes(int idcliente, String estado){
        CNotaCredito cn = new CNotaCredito();
        return cn.imprimirPendientes(idcliente, estado);
    }
    
    public List<Object> notasFacturas(int idcliente){
        CNotaCredito cn = new CNotaCredito();
        return cn.notasFacturas(idcliente);
    }
    
    public List<Object> filtrarFacturas(int idcliente, int no_documento){
        CNotaCredito cn = new CNotaCredito();
        return cn.filtrarFacturas(idcliente, no_documento);
    }
    
    public List<Object> filtrarNotas(int idtransaccion){
        CNotaCredito cn = new CNotaCredito();
        return cn.filtrarNotas(idtransaccion);
    }
    
    public NotaCredito read(int idnota){
        CNotaCredito cn = new CNotaCredito();
        return cn.read(idnota);
    }
    
    public int despachoNotas(NotaCredito nc){
        CNotaCredito cn = new CNotaCredito();
        return cn.despachoNotas(nc);
    }
    
    public javax.swing.JFrame imprimirDespachadas(Date fecha_ini, Date fecha_fin){
        CNotaCredito cn = new CNotaCredito();
        return cn.imprimirDespachadas(fecha_ini, fecha_fin);
    }
    
    public List<Object> filtrarProducto(int transac, String nombre){
        CNotaCredito cn = new CNotaCredito();
        return cn.filtrarProducto(transac, nombre);
    }
}