
/**
 * Write a description of class SeguidorConcreto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeguidorConcreto extends Observer
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SeguidorConcreto
     */
    public SeguidorConcreto(String nombre, Observable seguido)
    {
        super(nombre, seguido);
    }

    public void recibirNotificacion(String publi){
        System.out.println(publi);
    }
}
