package pruebas;

import java.util.List;
import prstd.controladores.CPermiso;
import prstd.controladores.CUsuario;
import prstd.modelos.Permiso;
import prstd.modelos.Usuario;

/**
 *
 * @author Edfu-Pro
 */
public class PruebasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CUsuario uc = new CUsuario();
        CPermiso cp = new CPermiso();
        List<Usuario> lista = uc.consultar();
        List<Permiso> listap = cp.listar();
        for(int i = 0; i < listap.size(); i++){
            System.out.println(listap.get(i).getPermiso());
        }
    }
    
}
