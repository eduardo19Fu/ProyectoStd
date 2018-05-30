/*
 * Modelo que funciona para manejar la relacion rol-permiso.
 */
package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class Permisos {
    
    private int idpermiso;
    private int idrol;
    private int usuario;

    public Permisos() {
    }

    public Permisos(int idpermiso, int idrol, int usuario) {
        this.idpermiso = idpermiso;
        this.idrol = idrol;
        this.usuario = usuario;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
