
/**
 * Write a description of class Linea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Linea extends Figura
{
    // instance variables - replace the example below with your own
    private double largo;

    /**
     * Constructor for objects of class Linea
     */
    public Linea(double largo)
    {
        setLargo(largo);        
    }

    public double getLargo(){
        return this.largo;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    public String getNombreFigura(){
        return "linea";
    }
    public double getArea(){
        return 0;
    }
}
