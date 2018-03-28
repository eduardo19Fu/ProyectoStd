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
    
    public List<Cliente> consultar(String n){
        CCliente cliente = new CCliente();
        return cliente.consultarNit(n);
    }
}
