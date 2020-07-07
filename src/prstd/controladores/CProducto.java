package prstd.controladores;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import prstd.modelos.Producto;
import prstd.servicios.ConexionDos;

/**
 *
 * @author Edfu-Pro
 */
public class CProducto {
    
    private Producto producto;
    private ConexionDos conexion;
    private Connection connection;
    private JasperReport reporte;
    
    public CProducto(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int actualizarProducto(Producto producto){
        String sql = "update tbl_producto set nombre_producto = ?, precio_compra = ?, precio_venta = ?,fecha_compra = ?,fecha_vencimiento = ?,idfabricante = ?,idfamilia = ?,"
                    + "stuckTienda = ?,stuckBodega = ?,porcentaje_ganancia = ?,stuck_minimo_tienda = ?,stuck_minimo_bodega = ?,estado = ? "
                    + "where codigo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombre().toUpperCase());
            ps.setDouble(2, producto.getPrecio_compra());
            ps.setDouble(3, producto.getPrecio_venta());
            ps.setDate(4, new java.sql.Date(producto.getFecha_compra().getTime()));
            if(producto.getFecha_vencimiento() != null)
                ps.setDate(5, new java.sql.Date(producto.getFecha_vencimiento().getTime()));
            else
                ps.setDate(5, null);
            ps.setInt(6, producto.getFabricante());
            ps.setInt(7, producto.getFamilia());
            ps.setInt(8, producto.getExistencia_tienda());
            ps.setInt(9, producto.getExistencia_bodega());
            ps.setDouble(10, producto.getPorcentaje_ganancia());
            ps.setInt(11, producto.getExistencia_minima_tienda());
            ps.setInt(12, producto.getExsitencia_minima_bodega());
            ps.setString(13, producto.getEstado());
            ps.setString(14, producto.getCodigo().toUpperCase());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int registroProducto(Producto productos){
        String sql = "insert into tbl_producto values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, productos.getCodigo().toUpperCase());
            ps.setString(2, productos.getNombre().toUpperCase());
            ps.setDouble(3, productos.getPrecio_compra());
            ps.setDouble(4, productos.getPrecio_venta());
            ps.setDate(5, new java.sql.Date(productos.getFecha_compra().getTime()));
            System.out.println("");
            if(productos.getFecha_vencimiento() != null)
                ps.setDate(6, new java.sql.Date(productos.getFecha_vencimiento().getTime()));
            else
                ps.setDate(6, null);
            ps.setInt(7, productos.getFabricante());
            ps.setInt(8, productos.getFamilia());
            ps.setInt(9, productos.getExistencia_tienda());
            ps.setInt(10, productos.getExistencia_bodega());
            ps.setDouble(11, productos.getPorcentaje_ganancia());
            ps.setInt(12, productos.getExistencia_minima_tienda());
            ps.setInt(13, productos.getExsitencia_minima_bodega());
            ps.setString(14, productos.getEstado());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int eliminarProducto(String codProducto){
        return 0;
    }
    
    public List<Producto> buscarProductos(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega, p.estado "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where p.estado != 'DESCONTINUADO'";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                producto.setEstado(rs.getString(14));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Producto> buscarProductos(String codigo){
        List<Producto> lista = new ArrayList<>();
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where p.codigo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Producto buscarProducto(String codigo){
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega, p.estado "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where p.codigo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            producto = new Producto();
            producto.setCodigo(rs.getString(1));
            producto.setNombre(rs.getString(2));
            producto.setPrecio_compra(rs.getDouble(3));
            producto.setPrecio_venta(rs.getDouble(4));
            producto.setFecha_compra(rs.getTimestamp(5));
            producto.setFecha_vencimiento(rs.getDate(6));
            producto.setNombre_fabricante(rs.getString(7));
            producto.setNombre_Familia(rs.getString(8));
            producto.setExistencia_tienda(rs.getInt(9));
            producto.setExistencia_bodega(rs.getInt(10));
            producto.setPorcentaje_ganancia(rs.getDouble(11));
            producto.setExistencia_minima_tienda(rs.getInt(12));
            producto.setExistencia_minima_bodega(rs.getInt(13));
            producto.setEstado(rs.getString(14));
            rs.close();
            ps.close();
            connection.close();
            return producto;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String getEstadoProducto(String codigo){
        String sql = "select estado from tbl_producto where codigo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String valor = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return valor;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // Método de filtro para la ventana de Productos
    // Pretende filtrar los valores dependiendo del valor ingresado.
    public List<Producto> filtrarProductos(String valor){
        List<Producto> lista = new ArrayList<>();
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega, p.estado "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where p.nombre_producto like ? or p.codigo like ? or p.estado like ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + valor + "%");
            ps.setString(2, "%" + valor + "%");
            ps.setString(3, "%" + valor + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                producto.setEstado(rs.getString(14));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String getCodigo(Producto producto){
        String sql = "select codigo from tbl_producto where nombre_producto = ?";
        String codigo;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getString(1);
            rs.close();
            ps.close();
            connection.close();
            return codigo;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    
    public int escogerUbicacion(String ubicacion, String codigo){
        String sql = "";
        switch(ubicacion){
            case "TIENDA":
                sql = "select stuckTienda from tbl_producto where codigo = ?";
                break;
            case "BODEGA":
                sql = "select stuckBodega from tbl_producto where codigo = ?";
                break;
            default:
                break;
        }
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int stuck = rs.getInt(1);
            rs.close();
            ps.close();
            connection.close();
            return stuck;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int altaProducto(String ubicacion,String codigo, int stuck){
        String sql = "";
        switch(ubicacion){
            case "TIENDA":
                sql = "update tbl_producto set stuckTienda = stuckTienda + ? where codigo = ?";
                break;
            case "BODEGA":
                sql = "update tbl_producto set stuckBodega = stuckBodega + ? where codigo = ?";
                break;
            default:
                break;
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, stuck);
            ps.setString(2, codigo);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public String calcularPrecioVenta(String precioCosto, String porcentaje) throws NumberFormatException, ArithmeticException{
        double precioc = Double.parseDouble(precioCosto);
        double percent = (Double.parseDouble(porcentaje)/100); // Convertimos el entero en un valor de porcentaje al dividirlo dentro de 100%.
        
        double preciov =  (precioc*percent) + precioc; // Almacenamos el resultado en una nueva variable la cual sirve como precioVenta.
        
        BigDecimal bd = new BigDecimal(preciov); // Creamos una variable BigDecimal para almacenar el precioVenta.
        bd = bd.setScale(2,RoundingMode.HALF_UP); // Decidimos el formato de redondeo y la cantidad de decimales que deseamos.

        String precio = String.format("%.2f",bd.doubleValue()); // Devolvemos el valor resultante como un String.
        String[] partes = precio.split(Pattern.quote(".")); // Separa el valor del precio en componentes usando el . como separador
        String entero = partes[0]; // Variable que almacena el valor entero.
        String decimal = partes[1]; // Variable que almacena el valor decimal.
        int valor1 = Integer.parseInt(String.valueOf(decimal.charAt(0))); // guarda el primer digito despues del punto decimal.
        int valor2 = Integer.parseInt(String.valueOf(decimal.charAt(1))); // guarda el segundo digito despues del punto decimal.
        int valor3 = Integer.parseInt(entero); // guarda la parte entera del valor ingresado antes del punto decimal.
        String nvalor = "";
        
        if(valor2 >= 1 && valor2 <= 4){ // Si el valor del segundo dígito del decimal se encuentra entre 1 y 4
            valor2 = 5; // Le damos el valor de 5 al segundo decimal cuando la desicion devuelve verdadero
            nvalor = String.valueOf(valor1) + String.valueOf(valor2); // Concatena el primer y segundo decimal
            precio = entero + "." + nvalor; // Concatena el valor entero 
        }else if(valor2 >= 6 && valor2 <= 9){
            valor2 = 0;
            if(valor1 == 9){
                valor1 = 0;
                valor3 += 1;
            }else{
                valor1 += 1;
            }
            nvalor = String.valueOf(valor1) + String.valueOf(valor2);
            precio = String.valueOf(valor3) + "." + nvalor;
        }
        return precio;
    }
    
    public String calcularDescuento(String nprecio){
        
        double preciov = Double.parseDouble(nprecio);
        
        BigDecimal bd = new BigDecimal(preciov); // Creamos una variable BigDecimal para almacenar el precioVenta.
        bd = bd.setScale(2,RoundingMode.HALF_UP); // Decidimos el formato de redondeo y la cantidad de decimales que deseamos.

        String precio = String.format("%.2f",bd.doubleValue()); // Devolvemos el valor resultante como un String.
        String[] partes = precio.split(Pattern.quote(".")); // Separa el valor del precio en componentes usando el . como separador
        String entero = partes[0]; // Variable que almacena el valor entero.
        String decimal = partes[1]; // Variable que almacena el valor decimal.
        int valor1 = Integer.parseInt(String.valueOf(decimal.charAt(0))); // guarda el primer digito despues del punto decimal.
        int valor2 = Integer.parseInt(String.valueOf(decimal.charAt(1))); // guarda el segundo digito despues del punto decimal.
        int valor3 = Integer.parseInt(entero); // guarda la parte entera del valor ingresado antes del punto decimal.
        String nvalor = "";
        
        if(valor2 >= 1 && valor2 <= 4){ // Si el valor del segundo dígito del decimal se encuentra entre 1 y 4
            valor2 = 5; // Le damos el valor de 5 al segundo decimal cuando la desicion devuelve verdadero
            nvalor = String.valueOf(valor1) + String.valueOf(valor2); // Concatena el primer y segundo decimal
            precio = entero + "." + nvalor; // Concatena el valor entero 
        }else if(valor2 >= 6 && valor2 <= 9){
            valor2 = 0;
            if(valor1 == 9){
                valor1 = 0;
                valor3 += 1;
            }else{
                valor1 += 1;
            }
            nvalor = String.valueOf(valor1) + String.valueOf(valor2);
            precio = String.valueOf(valor3) + "." + nvalor;
        }
        return precio;
    }
    
    public String redondearPrecio(double precio){
        BigDecimal bd = new BigDecimal(precio);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        
        return String.valueOf(bd);
    }
    
    public List<Producto> buscarNombre(String nombre){
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where p.nombre_producto like ? and p.estado != 'DESCONTINUADO'";
        List<Producto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Producto> buscarFamilia(String familia){
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where fa.nombre_familia like ? and p.estado != 'DESCONTINUADO'";
        List<Producto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + familia + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Producto> buscarFabricante(String fabricante){
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia "
                    + "where f.nombre_fabricante like ? and p.estado != 'DESCONTINUADO'";
        List<Producto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + fabricante + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio_compra(rs.getDouble(3));
                producto.setPrecio_venta(rs.getDouble(4));
                producto.setFecha_compra(rs.getTimestamp(5));
                producto.setFecha_vencimiento(rs.getDate(6));
                producto.setNombre_fabricante(rs.getString(7));
                producto.setNombre_Familia(rs.getString(8));
                producto.setExistencia_tienda(rs.getInt(9));
                producto.setExistencia_bodega(rs.getInt(10));
                producto.setPorcentaje_ganancia(rs.getDouble(11));
                producto.setExistencia_minima_tienda(rs.getInt(12));
                producto.setExistencia_minima_bodega(rs.getInt(13));
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public int descontinuar(String codigo){
        String sql = "update tbl_producto set estado = 'DESCONTINUADO' where codigo = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public javax.swing.JFrame reportTienda(){
        try {
            this.reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\productosDisponibles.jrxml");
            JasperPrint print = JasperFillManager.fillReport(this.reporte, null,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Productos en Tienda agotados");
            jv.setVisible(true);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            connection.close();
            return jv;
        } catch (JRException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error en generación de reporte",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public javax.swing.JFrame reportBodega(){
        try {
            this.reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"\\src\\prstd\\reports\\productosBodega.jrxml");
            JasperPrint print = JasperFillManager.fillReport(this.reporte, null,connection);
            JasperViewer jv = new JasperViewer(print,false);
            jv.setVisible(true);
            jv.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            connection.close();
            return jv;
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error en generación de reporte",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public int actualizarExistencia(String codigo, int cantidad, int bandera){
        String sql = "";
        int rs = 0;
        switch(bandera){
            case 1:
                sql = "update tbl_producto set stuckTienda = stuckTienda - ? where codigo = ?";
                break;
            case 2:
                sql = "update tbl_producto set stuckBodega = stuckBodega - ? where codigo = ?";
                break;
            default:
                break;
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setString(2, codigo);
            rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
