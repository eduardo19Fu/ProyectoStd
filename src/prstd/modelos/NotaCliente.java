package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class NotaCliente {
    private NotaCredito nota_credito;
    private int idcliente;

    public NotaCliente() {
    }

    public NotaCliente(NotaCredito nota_credito, int idcliente) {
        this.nota_credito = nota_credito;
        this.idcliente = idcliente;
    }

    public NotaCredito getNota_credito() {
        return nota_credito;
    }

    public void setNota_credito(NotaCredito nota_credito) {
        this.nota_credito = nota_credito;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
}
