package prstd.servicios;

public class ConectarServicio {

    private Conexion cbd;
    private static ConectarServicio instancia;

    public ConectarServicio() {
    }
    
    public static synchronized ConectarServicio getInstancia(){
        if(instancia == null){
            instancia = new ConectarServicio();
        }
        return instancia;
    }
    
    public Conexion getConexionDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String nombreclase = System.getProperty("dabaseclass");
        if(cbd == null){
            cbd = (Conexion) Class.forName("nombreclase").newInstance();
        }
        return cbd;
    }
}
