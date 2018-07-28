package prstd.modelos;

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
}
