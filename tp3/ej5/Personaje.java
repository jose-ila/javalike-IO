
/**
 * Write a description of class Personaje here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Personaje
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class Personaje
     */
    public Personaje(String nombre)
    {
        setNombre(nombre);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
