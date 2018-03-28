package pruebas;

import java.util.List;
import prstd.controladores.CUsuario;
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
        List<Usuario> lista = uc.consultar();
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getUsuario());
        }
    }
    
}
