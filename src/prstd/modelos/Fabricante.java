package prstd.modelos;

import java.util.List;
import prstd.controladores.CFabricante;

/**
 *
 * @author Edfu-Pro
 */
public class Fabricante {
    
    private int idfabricante;
    private String nombre_fabricante;
    private String Observaciones;

    public Fabricante() {
    }

    public Fabricante(int idfabricante, String nombre_fabricante, String Observaciones) {
        this.idfabricante = idfabricante;
        this.nombre_fabricante = nombre_fabricante;
        this.Observaciones = Observaciones;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getNombre_fabricante() {
        return nombre_fabricante;
    }

    public void setNombre_fabricante(String nombre_fabricante) {
        this.nombre_fabricante = nombre_fabricante;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    
    public List<Fabricante> listar(){
        CFabricante cf = new CFabricante();
        return cf.listar();
    }
    
    public int getId(String fabricante){
        CFabricante cf = new CFabricante();
        return cf.getId(fabricante);
    }
    
    public int registrar(Fabricante fabricante){
        CFabricante cf = new CFabricante();
        return cf.registrar(fabricante);
    }
    
    public int getMaxFabricante(){
        CFabricante cf = new CFabricante();
        return cf.getMaxFabricante();
    }
    
    public String getNombre(int id){
        CFabricante cf = new CFabricante();
        return cf.getNombre(id);
    }
}
