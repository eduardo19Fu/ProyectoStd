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
    
    public int grabar(int idusuario, DefaultTableModel modelo){
        CRoles cr = new CRoles();
        return cr.grabar(idusuario, modelo);
    }
    
}
