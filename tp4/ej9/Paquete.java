import java.util.Vector;

/**
 * Write a description of class Paquete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paquete extends Tour
{
    // instance variables - replace the example below with your own
    private Vector<Simple> toursSimples;

    /**
     * Constructor for objects of class Paquete
     */
    public Paquete(String nombre, double precio, Vector<Turista> turistas, Vector<Simple> tours)
    {
        super(nombre, precio, turistas);
        setToursSimples(tours);
    }

    public Vector<Simple> getToursSimples(){
        return this.toursSimples;
    }
    public void setToursSimples(Vector<Simple> tours){
        this.toursSimples = tours ;
    }
    
}
