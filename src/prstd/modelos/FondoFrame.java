package prstd.modelos;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FondoFrame extends JFrame{
    
    private final FondoPanel fondo;
    
    public FondoFrame(){
        fondo = new FondoPanel();
        setContentPane(fondo);
        setExtendedState(MAXIMIZED_BOTH);
        //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/vidal/imgs/icono_ventana_4.png"));
        //setIconImage(icon);
    }
    
    public void setImagen(String nombreImagen){
        fondo.setImagen(nombreImagen);
    }
    
    public void setImagen(Image nuevaImagen){
        fondo.setImagen(nuevaImagen);
    }
    
    public void setComponent(Component componente){
        fondo.add(componente);
    }
}
