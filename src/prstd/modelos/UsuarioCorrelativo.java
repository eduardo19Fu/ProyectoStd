/*
 * Clase encargada de manera el modelo del Correlativo del Cada usuario creado para vender.
 */
package prstd.modelos;

import prstd.controladores.CUsuarioCorrelativo;

/**
 *
 * @author Edfu-Pro
 */
public class UsuarioCorrelativo extends Usuario{
    
    private int idusuario;
    private String serie;
    private int correlativo_ini;
    private int correlativo_fin;
    private int correlativo_act;
    private int tipo_correlativo;
    
    public UsuarioCorrelativo(){
        
    }

    @Override
    public int getIdusuario() {
        return idusuario;
    }

    @Override
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCorrelativo_ini() {
        return correlativo_ini;
    }

    public void setCorrelativo_ini(int correlativo_ini) {
        this.correlativo_ini = correlativo_ini;
    }

    public int getCorrelativo_fin() {
        return correlativo_fin;
    }

    public void setCorrelativo_fin(int correlativo_fin) {
        this.correlativo_fin = correlativo_fin;
    }

    public int getCorrelativo_act() {
        return correlativo_act;
    }

    public void setCorrelativo_act(int correlativo_act) {
        this.correlativo_act = correlativo_act;
    }

    public int getTipo_correlativo() {
        return tipo_correlativo;
    }

    public void setTipo_correlativo(int tipo_correlativo) {
        this.tipo_correlativo = tipo_correlativo;
    }
    
    
    /*
        Métodos del comunicación con el controlador de Usuario Correlativo
    */
    
    public int grabar(UsuarioCorrelativo uc){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.grabar(uc);
    }
    
    public boolean verificarUsuario(int idusuario){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.verificarUsuario(idusuario);
    }
    
    public boolean verificarProforma(int idusuario){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.verificarProforma(idusuario);
    }
    
    public UsuarioCorrelativo getActual(int idusuario){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.getActual(idusuario);
    }
    
    public UsuarioCorrelativo getProformaActual(int idusuario){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.getProformaActual(idusuario);
    }
    
    public int avanzaCorrelativo(int id, int correlativo, int tipo){
        CUsuarioCorrelativo uco = new CUsuarioCorrelativo();
        return uco.avanzaCorrelativo(id, correlativo, tipo);
    }
    
}
