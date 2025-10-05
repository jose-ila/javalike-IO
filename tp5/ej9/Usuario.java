import java.util.Vector;

/**
 * Write a description of class Usuario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Usuario extends Observable
{

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre, Vector<Observer> seguidores)
    {
        // initialise instance variables
        super(nombre, seguidores);
    }

    public void publicar(String publicacion){
        super.notificar(publicacion);
    }
}
