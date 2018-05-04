package prstd.modelos;

/**
 *
 * @author Edfu-Pro
 */
public class NotaTransaccion {
    
    private NotaCredito nota;
    private Documento documento;

    public NotaTransaccion() {
    }

    public NotaTransaccion(NotaCredito nota, Documento documento) {
        this.nota = nota;
        this.documento = documento;
    }

    public NotaCredito getNota() {
        return nota;
    }

    public void setNota(NotaCredito nota) {
        this.nota = nota;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
