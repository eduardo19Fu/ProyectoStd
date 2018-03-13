package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class ClienteMayor extends Cliente{
    
    private int idclienteMayor;
    private String telefono;
    private String email;
    private int idcliente;

    public ClienteMayor() {
    }

    public ClienteMayor(int idcliente, String nombre, String nit, String direccion) {
        super(idcliente, nombre, nit, direccion);
    }

    public int getIdclienteMayor() {
        return idclienteMayor;
    }

    public void setIdclienteMayor(int idclienteMayor) {
        this.idclienteMayor = idclienteMayor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    
    
}
