package prstd.modelos;

import java.util.ArrayList;
import java.util.List;
import prstd.controladores.CRol;

/**
 *
 * @author Edfu-Pro
 */
public class Rol {
    
    private int idrol;
    private String rol;
    private String descripcion;
    private String estado;

    public Rol(){
    }
    
    public Rol(int idrol, String rol, String estado) {
        this.idrol = idrol;
        this.rol = rol;
        this.estado = estado;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public List<Rol> consultar(){
        CRol rols = new CRol();
        List<Rol> lista = new ArrayList<>();
        lista = rols.consultar();
        return lista;
    }
    
    public int consultar(String rol){
        CRol cr = new CRol();
        return cr.consultar(rol);
    }
}
