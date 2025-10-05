import java.util.Vector;

/**
 * Write a description of class Observable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Observable
{
       
    private String nombre;
    private Vector<Observer> seguidores;
    /**
     * Constructor for objects of class Observable
     */
    public Observable(String n, Vector<Observer> seguidores)
    {
        setNombre(n);
        setSeguidores(seguidores);
    }
    
    public Vector<Observer> getSeguidores(){
        return this.seguidores;
    }
    public void setSeguidores(Vector<Observer> seguidores){
        this.seguidores = seguidores;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void notificar(String publicacion){
        for(Observer o: getSeguidores()){
            o.recibirNotificacion(publicacion);
        }
    }
    public void anadirSeguidor(Observer seguidor){
        getSeguidores().add(seguidor);
    }
}
