package prstd.modelos;

import prstd.controladores.CDatosEmisor;
import prstd.modelos.Emisor;

/**
 *
 * @author Edfu-Pro
 */
public class Emisor {
    
    private Integer id;
    private String codigo_postal;
    private String correo_emisor;
    private String departamento;
    private String municipio;
    private String direccion;
    private String nit;
    private String nombre_comercial;
    private String nombre_emisor;
    
    public Emisor(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCorreo_emisor() {
        return correo_emisor;
    }

    public void setCorreo_emisor(String correo_emisor) {
        this.correo_emisor = correo_emisor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public String getNombre_emisor() {
        return nombre_emisor;
    }

    public void setNombre_emisor(String nombre_emisor) {
        this.nombre_emisor = nombre_emisor;
    }
    
    /***** METODOS CONTROLADOR ******/
    public Emisor datosEmisor(){
        return new CDatosEmisor().consultar();
    }
}
