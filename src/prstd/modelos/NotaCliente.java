package prstd.modelos;

import javax.swing.table.DefaultTableModel;
import prstd.controladores.CNotaCliente;

/**
 *
 * @author Edfu-Pro
 */
public class NotaCliente {
    private int nota_credito;
    private int idcliente;

    public NotaCliente() {
    }

    public NotaCliente(int nota_credito, int idcliente) {
        this.nota_credito = nota_credito;
        this.idcliente = idcliente;
    }

    public int getNota_credito() {
        return nota_credito;
    }

    public void setNota_credito(int nota_credito) {
        this.nota_credito = nota_credito;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    public int crear(DefaultTableModel modelo, int idcliente){
        CNotaCliente cc = new CNotaCliente();
        return cc.crear(modelo, idcliente);
    }
}
