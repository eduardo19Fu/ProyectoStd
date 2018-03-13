package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class Rol {
    
    private int idrol;
    private String rol;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
