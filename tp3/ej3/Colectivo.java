
/**
 * Write a description of class Colectivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Colectivo extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int asientos;
    private String tipo;

    /**
     * Constructor for objects of class Colectivo
     */
    public Colectivo()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setAsientos(int asientos){
        this.asientos = asientos;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getAsientos(){
        return this.asientos;
    }
    public String getTipo(){
        return this.tipo;
    }
}
