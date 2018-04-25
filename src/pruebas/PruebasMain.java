package pruebas;

import java.util.List;
import prstd.controladores.CPermiso;
import prstd.controladores.CUsuario;
import prstd.modelos.Permiso;
import prstd.modelos.Producto;
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
//        CUsuario uc = new CUsuario();
//        CPermiso cp = new CPermiso();
//        List<Usuario> lista = uc.consultar();
//        List<Permiso> listap = cp.listar();
//        Producto producto = new Producto();
//        for(int i = 0; i < listap.size(); i++){
//            System.out.println(producto.calcularPrecioVenta("10", "5"));
//        }
        PruebasMain pm = new PruebasMain();
        pm.pruebaproducto();
    }
    
    public void pruebaproducto(){
        Producto producto = new Producto();
        producto.setCodigo("788801");
        producto.setNombre("Pegamento");
        producto.setFecha_compra(new java.util.Date());
        producto.setFecha_vencimiento(null);
        producto.setFamilia(1);
        producto.setFabricante(1);
        producto.setPrecio_compra(10.00);
        producto.setPorcentaje_ganancia(0.05);
        producto.setPrecio_venta((10.00*0.05));
        producto.setExistencia_tienda(25);
        producto.setExistencia_minima_tienda(5);
        producto.setExistencia_bodega(200);
        producto.setExistencia_minima_bodega(25);
        
        producto.crear(producto);
    }
}
