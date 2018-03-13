package prstd.modelos;

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
}
