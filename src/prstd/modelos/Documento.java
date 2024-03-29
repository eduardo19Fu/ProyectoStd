package prstd.modelos;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import prstd.controladores.CFactura;
import prstd.controladores.CProforma;

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
    private String estado;
    private int tipo_documento;
    private String correlatvio_sat;
    private String certificacion_sat;
    private String serie_sat;
    private String mensaje_sat;
    private String fecha_certificacion_sat;

    public Documento(){
    }
    
    public Documento(int idtransaccion, int no_documento, Timestamp fecha_emision, Double total, int idcliente, int idvendedor, 
            String estado,String serie, int tipo_documento, String correlativo_sat, String certificacion_sat, String serie_sat, String mensaje_sat,
            String fecha_certificacion_sat) {
        
        this.idtransaccion = idtransaccion;
        this.no_documento = no_documento;
        this.fecha_emision = fecha_emision;
        this.total = total;
        this.idcliente = idcliente;
        this.idvendedor = idvendedor;
        this.serie = serie;
        this.estado = estado;
        this.tipo_documento = tipo_documento;
        this.correlatvio_sat = correlativo_sat;
        this.certificacion_sat = certificacion_sat;
        this.serie_sat = serie_sat;
        this.mensaje_sat = mensaje_sat;
        this.fecha_certificacion_sat = fecha_certificacion_sat;
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
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
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

    public String getCorrelatvio_sat() {
        return correlatvio_sat;
    }

    public void setCorrelatvio_sat(String correlatvio_sat) {
        this.correlatvio_sat = correlatvio_sat;
    }

    public String getCertificacion_sat() {
        return certificacion_sat;
    }

    public void setCertificacion_sat(String certificacion_sat) {
        this.certificacion_sat = certificacion_sat;
    }

    public String getSerie_sat() {
        return serie_sat;
    }

    public void setSerie_sat(String serie_sat) {
        this.serie_sat = serie_sat;
    }

    public String getMensaje_sat() {
        return mensaje_sat;
    }

    public void setMensaje_sat(String mensaje_sat) {
        this.mensaje_sat = mensaje_sat;
    }

    public String getFecha_certificacion_sat() {
        return fecha_certificacion_sat;
    }

    public void setFecha_certificacion_sat(String fecha_certificacion_sat) {
        this.fecha_certificacion_sat = fecha_certificacion_sat;
    }
    
    
    
    /*
        Métodos de controlado de documento
    */
    
    public int getMaxTransaccion(){
        CFactura cf = new CFactura();
        return cf.getMaxTransaccion();
    }
    
    public Documento buscarFactura(int idtransaccion){
        return new CFactura().buscarFactura(idtransaccion);
    }
    
    public int crearFactura(Documento documento){
        CFactura cf = new CFactura();
        return cf.crearFactura(documento);
    }
    
    public List<Documento> consultarClientesVarios(){
        CFactura cf = new CFactura();
        return cf.consultarClientesVarios();
    }
    
    public List<Documento> consultarTransacciones(){
        CFactura cf = new CFactura();
        return cf.consultarTransacciones();
    }
    
    public List<Documento> consultarTransacciones(Date fechaIni, Date fechaFin){
        CFactura cf = new CFactura();
        return cf.consultarTransacciones(fechaIni, fechaFin);
    }
    
    public List<Documento> consultarTransacciones(String no_factura){
        CFactura cf = new CFactura();
        return cf.consultarTransacciones(no_factura);
    }
    
    public int detalleFactura(DefaultTableModel modelo, int transaccion, String serie){
        CFactura cf = new CFactura();
        return cf.detalleFactura(modelo, transaccion, serie);
    }
    
    public int actualizarExistencias(DefaultTableModel modelo){
        CFactura cf = new CFactura();
        return cf.actualizarExistencias(modelo);
    }
    
    public int anular(int transac, int no_factura, String serie){
        CFactura cf = new CFactura();
        return cf.anular(transac, no_factura, serie);
    }
    
    public int restaurarExistencias(int idtransaccion, int no_docuemento, String serie){
        CFactura cf = new CFactura();
        return cf.restaurarExistencias(idtransaccion, no_docuemento, serie);
    }
    
    public javax.swing.JFrame imprimir(int transac, int factura, String serie, double total) throws SQLException{
        CFactura cf = new CFactura();
        return cf.imprimir(transac, factura, serie, total);
    }
    
    public javax.swing.JFrame imprimir2(int transac, int factura, String serie, double total) throws SQLException{
        CFactura cf = new CFactura();
        return cf.imprimir2(transac, factura, serie, total);
    }
    
    public int insert(Documento documento){
        CProforma proforma = new CProforma();
        return proforma.insert(documento);
    }
    
    public int insertDetalle(DefaultTableModel modelo, int transaccion, String serie){
        CProforma proforma = new CProforma();
        return proforma.insertDetalle(modelo, transaccion, serie);
    }
    
    public javax.swing.JFrame imprimirProforma(int transac, int factura, String serie, double total){
        CProforma proforma = new CProforma();
        return proforma.imprimirProforma(transac, factura, serie, total);
    }
    
    public javax.swing.JFrame imprimirSimple(int transac, int factura, String serie, double total){
        CProforma proforma = new CProforma();
        return proforma.imprimirSimple(transac, factura, serie, total);
    }
    
    public double totalDocumento(int idtransaccion){
        CFactura cf = new CFactura();
        return cf.totalDocumento(idtransaccion);
    }
    
    public javax.swing.JFrame imprimir(int usuario, Date fecha){
        CFactura cf = new CFactura();
        return cf.imprimir(usuario, fecha);
    }
    
    public List<Documento> consultarProformas(){
        CProforma cp = new CProforma();
        return cp.consultar();
    }
    
    public List<Documento> consultarProformas(String no_proforma){
        CProforma cp = new CProforma();
        return cp.consultar(no_proforma);
    }
    
    public List<Documento> consultarProformas(Date fechaIni, Date fechaFin){
        CProforma cp = new CProforma();
        return cp.consultar(fechaIni, fechaFin);
    }
    
    public int anularProforma(int transaccion){
        CProforma cp = new CProforma();
        return cp.delete(transaccion);
    }
    
    public javax.swing.JFrame ventas_mensuales(String mes, int anho){
        CFactura cf = new CFactura();
        return cf.ventas_mensuales(mes, anho);
    }
    
    public Documento consultar(int idtransaccion){
        CProforma cp = new CProforma();
        return cp.consultar(idtransaccion);
    }
    
    public List<DetalleDocumento> getDetalleProforma(int idtransaccion){
        CProforma cp = new CProforma();
        return cp.getDetalleProforma(idtransaccion);
    }
}
