package prstd.modelos;

import java.util.List;
import prstd.controladores.CFamilia;

/**
 *
 * @author Edfu-Pro
 */
public class Familia {
    
    private int idfamilia;
    private String nombre_familia;

    public Familia() {
    }

    public Familia(int idfamilia, String nombre_familia) {
        this.idfamilia = idfamilia;
        this.nombre_familia = nombre_familia;
    }

    public int getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(int idfamilia) {
        this.idfamilia = idfamilia;
    }

    public String getNombre_familia() {
        return nombre_familia;
    }

    public void setNombre_familia(String nombre_familia) {
        this.nombre_familia = nombre_familia;
    }
    
    /*
     * Metodos Controlador de la Clase Familia.
    */
    
    public List<Familia> listar(){
        CFamilia cf = new CFamilia();
        return cf.listar();
    }
    
    public int getId(String familia){
        CFamilia cf = new CFamilia();
        return cf.getId(familia);
    }
    
    public int registrar(Familia familia){
        CFamilia cf = new CFamilia();
        return cf.registrar(familia);
    }
    
    public int getMaxFamilia(){
        CFamilia cf = new CFamilia();
        return cf.getMaxFamilia();
    }
}
