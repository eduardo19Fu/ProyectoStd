package prstd.modelos;

import java.util.List;
import prstd.controladores.CPermiso;

/**
 *
 * @author Edfu-Pro
 */
public class Permiso {
    
    private int idpermiso;
    private String permiso;
    private String estado;

    public Permiso(){
        
    }
    
    public Permiso(int idpermiso, String permiso, String estado) {
        this.idpermiso = idpermiso;
        this.permiso = permiso;
        this.estado = estado;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /*
        * Invocación de los metodos de controlador a través del modelo
    */
    public List<Permiso> listar(){
        CPermiso cp = new CPermiso();
        return cp.listar();
    }
    
    public int editar(Permiso permiso){
        CPermiso cp = new CPermiso();
        return cp.editar(permiso);
    }
    
    public int crear(Permiso permiso){
        CPermiso cp = new CPermiso();
        return cp.crear(permiso);
    }
    
    public int getIdPermiso(String permiso){
        CPermiso cp = new CPermiso();
        return cp.getIdPermiso(permiso);
    }
    
    public String getNombrePermiso(int id){
        CPermiso cp = new CPermiso();
        return cp.getNombrePermiso(id);
    }
}
