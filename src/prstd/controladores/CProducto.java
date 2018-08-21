package prstd.controladores;

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
    
    public CProducto(){
        conexion = new ConexionDos();
        connection = conexion.getConnection();
    }
    
    public int actualizarProducto(Producto producto){
        String sql = "update tbl_producto set nombre_producto = ?, precio_compra = ?, precio_venta = ?,fecha_compra = ?,fecha_vencimiento = ?,idfabricante = ?,idfamilia = ?,"
                    + "stuckTienda = ?,stuckBodega = ?,porcentaje_ganancia = ?,stuck_minimo_tienda = ?,stuck_minimo_bodega = ? "
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
            ps.setString(13, producto.getCodigo().toUpperCase());
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int registroProducto(Producto productos){
        String sql = "insert into tbl_producto values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
            int rs = ps.executeUpdate();
            ps.close();
            connection.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int eliminarProducto(String codProducto){
        return 0;
    }
    
    public List<Producto> buscarProductos(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select p.codigo, p.nombre_producto, p.precio_compra, p.precio_venta, p.fecha_compra, p.fecha_vencimiento, f.nombre_fabricante, fa.nombre_familia,"
                    + "p.stuckTienda, p.stuckBodega, p.porcentaje_ganancia, p.stuck_minimo_tienda, p.stuck_minimo_bodega "
                    + "from tbl_producto p "
                    + "inner join tbl_fabricante f on p.idfabricante = f.idfabricante "
                    + "inner join tbl_producto_familia fa on p.idfamilia = fa.idproducto_familia ";
        
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
                lista.add(producto);
            }
            rs.close();
            ps.close();
            connection.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            return null;
        }
    }
    
    public Producto buscarProducto(String codigo){
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
            rs.close();
            ps.close();
            connection.close();
            return producto;
        } catch (SQLException ex) {
            Logger.getLogger(CProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            return 0;
        }
    }
    
    public String calcularPrecioVenta(String precioCosto, String porcentaje) throws NumberFormatException, ArithmeticException{
        double precioc = Double.parseDouble(precioCosto);
        double percent = (Double.parseDouble(porcentaje)/100); // Convertimos el entero en un valor de porcentaje al dividirlo dentro de 100%.
        
        double preciov =  (precioc*percent) + precioc; // Almacenamos el resultado en una nueva variable la cual sirve como precioVenta.
        
        BigDecimal bd = new BigDecimal(preciov); // Creamos una variable BigDecimal para almacenar el precioVenta.
        bd = bd.setScale(2,RoundingMode.HALF_UP); // Decidimos el formato de redondeo y la cantidad de decimales que deseamos.
        
        return String.format("%.2f",bd.doubleValue()); // Devolvemos el valor resultante como un String.
    }
    
    public String redondearPrecio(double precio){
        BigDecimal bd = new BigDecimal(precio);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        
        return String.valueOf(bd);
    }
}
