
/**
 * Write a description of class Cuadrado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    // instance variables - replace the example below with your own
    private double lado;
    
    /**
     * Constructor for objects of class Cuadrado
     */
    public Cuadrado(double lado)
    {   
        setLado(lado);
    }
    
    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public String getNombreFigura(){
        return "Cuadrado";
    }
    public double getArea(){
        return this.lado * this.lado;
    }
}
