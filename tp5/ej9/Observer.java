
/**
 * Write a description of class Observer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Observer
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Observable seguido;
    /**
     * Constructor for objects of class Observer
     */
    public Observer(String n, Observable seguido)
    {
        // initialise instance variables
        this.nombre = n;
        setSeguido(seguido);
    }
    public void setSeguido(Observable seguido){
        this.seguido = seguido;
    }
    public Observable getSeguido(){
        return this.seguido;
    }
    public abstract void recibirNotificacion(String publicacion);
}
