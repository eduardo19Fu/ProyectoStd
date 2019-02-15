package prstd.modelos;

import java.util.List;
import prstd.controladores.CCliente;

/**
 *
 * @author Edfu-Pro
 */
public class Cliente {
    
    private int idcliente;
    private String nombre;
    private String nit;
    private String direccion;
    
    public Cliente(){
    }

    public Cliente(int idcliente, String nombre, String nit, String direccion) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /*
     *  Métodos Controlador de la clase Cliente   
    */
    
    public List<Cliente> consultar(){
        CCliente cliente = new CCliente();
        return cliente.consultar();
    } 
    
    public int eliminar(int idcliente){
        CCliente cliente = new CCliente();
        return cliente.eliminar(idcliente);
    }
    
    public int grabar(Cliente c){
        CCliente cliente = new CCliente();
        return cliente.grabar(c);
    }
    
    public List<Cliente> consultar(String parametro){
        CCliente cliente = new CCliente();
        return cliente.consultarNit(parametro);
    }
    
    public int getMaxCliente(){
        CCliente cliente = new CCliente();
        return cliente.getMaxCliente();
    }
    
    public Cliente buscarNit(String nit){
        CCliente cliente = new CCliente();
        return cliente.buscarNit(nit);
    }
    
    public boolean comprobarCliente(String nit){
        CCliente cliente = new CCliente();
        return cliente.comprobarCliente(nit);
    }
    
    public int consultarCliente(String nit){
        CCliente cliente = new CCliente();
        return cliente.consultarCliente(nit);
    }
    
    public Cliente consultarCliente(int idcliente){
        CCliente cliente = new CCliente();
        return cliente.consultarCliente(idcliente);
    }
    
    public int actualizar(Cliente c){
        CCliente cliente = new CCliente();
        return cliente.actualizar(c);
    }
    
    public Cliente cargarCliente(String nit){
        CCliente cliente = new CCliente();
        return cliente.cargarCliente(nit);
    }
}
