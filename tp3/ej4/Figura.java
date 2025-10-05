
/**
 * Write a description of class Figura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  Figura
{
    // instance variables - replace the example below with your own
    private String color;

    /**
     * Constructor for objects of class Figura
     */
    public Figura()
    {
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    
    public abstract double getArea();
    
    public abstract String getNombreFigura();
    
    public void pintar(String color){
        setColor(color);
        System.out.println("Pintando " + getNombreFigura() + " de color " + color );
    }
    
    
}
