
/**
 * Write a description of class Camion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Camion extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int tara;
    private int largo;

    /**
     * Constructor for objects of class Camion
     */
    public Camion()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getLargo(){
        return this.largo;
    }
    public int getTara(){
        return this.tara;
    }
    public void setTara(int tara){
        this.tara = tara;
    }
    public void setLargo(int largo){
        this.largo = largo;
    }
}

