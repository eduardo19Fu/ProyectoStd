package pruebas;

import java.util.Date;
import java.sql.Timestamp;
import prstd.controladores.CProducto;

/**
 *
 * @author Edfu-Pro
 */
public class PruebasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CUsuario uc = new CUsuario();
//        CPermiso cp = new CPermiso();
//        List<Usuario> lista = uc.consultar();
//        List<Permiso> listap = cp.listar();
//        Producto producto = new Producto();
//        for(int i = 0; i < listap.size(); i++){
//            System.out.println(producto.calcularPrecioVenta("10", "5"));
//        }
/*Prueba de clase para retornar total en letrass*/
//        Auxiliar aux = new Auxiliar();
//        String valor = "1555.50";
//        System.out.println(aux.Convertir(valor, true));
        CProducto cp = new CProducto();
        System.out.println(cp.calcularPrecioVenta("25.32", "50"));
        Timestamp tm = new Timestamp(new Date().getTime());
        System.out.println(tm);
    }
}
