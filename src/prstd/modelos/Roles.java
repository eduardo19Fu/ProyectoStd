/*
 * Modelo que sirve para la asignación usuario-rol.
 */
package prstd.modelos;

import javax.swing.table.DefaultTableModel;
import prstd.controladores.CRoles;

/**
 *
 * @author Edfu-Pro
 */
public class Roles {

    private int idrol;
    private int idusuario;
    
    public Roles() {
    }

    public Roles(int idrol, int idusuario) {
        this.idrol = idrol;
        this.idusuario = idusuario;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    /*
        * Métodos controlador 
    */
    
    public int grabar(int idusuario, DefaultTableModel modelo){
        CRoles cr = new CRoles();
        return cr.grabar(idusuario, modelo);
    }
    
}
