package prstd.modelos;

import java.util.List;
import prstd.controladores.CUsuario;

/**
 *
 * @author Edfu-Pro
 */
public class Usuario {
    
    private int idusuario;
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String estado;
    private String email;
    private String telefono;
    
    public Usuario(){
    }

    public Usuario(int idusuario, String usuario, String password, String nombre, String apellido, String estado, String email, String telefono) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /*
        * Métodos que devuelven las funcionas del controlador de Usuario. *
    */
    
    public boolean login(Usuario usuario){
        CUsuario cu = new CUsuario();
        return cu.hacerLogin(usuario);
    }
    
    public int crear(Usuario usuario){
        CUsuario cu = new CUsuario();
        return cu.crear(usuario);
    }
    
    public int actualizar(Usuario usuario){
        CUsuario cu = new CUsuario();
        return cu.actualizar(usuario);
    }
    
    public List<Usuario> listar(){
        CUsuario cu = new CUsuario();
        return cu.consultar();
    }
    
    public int consultarUsuario(String usuario){
        CUsuario cu = new CUsuario();
        return cu.consultarUsuario(usuario);
    }
    
    public int consultarUsuario(){
        CUsuario cu = new CUsuario();
        return cu.consultarUsuario();
    }
    
    public String getVendedor(){
        CUsuario cu = new CUsuario();
        return cu.getVendedor(usuario);
    }
}
