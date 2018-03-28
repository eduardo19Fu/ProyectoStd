package prstd.modelos;

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
    
    public Usuario(){
    }

    public Usuario(int idusuario, String usuario, String password, String nombre, String apellido, String estado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
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
    
}
