package prstd.modelos;

import javax.swing.table.DefaultTableModel;
import prstd.controladores.CNotaTransaccion;

/**
 *
 * @author Edfu-Pro
 */
public class NotaTransaccion {
    
    private int nota;
    private int documento;

    public NotaTransaccion() {
    }

    public NotaTransaccion(int nota, int documento) {
        this.nota = nota;
        this.documento = documento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public int crear(DefaultTableModel modelo, int transaccion){
        CNotaTransaccion cn = new CNotaTransaccion();
        return cn.crear(modelo, transaccion);
    }
}
