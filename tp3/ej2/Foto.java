
/**
 * Write a description of class Foto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Foto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int tamano;
    /**
     * Constructor for objects of class Foto
     */
    public Foto()
    {
        nombre = "asds";
        tamano = 3323;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTamano(int tamano){
        this.tamano = tamano;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTamano(){
        return this.tamano;
    }
    
    
}
