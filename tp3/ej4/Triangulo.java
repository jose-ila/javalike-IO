
/**
 * Write a description of class Triangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    // instance variables - replace the example below with your own
    private double base;
    private double altura;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo(double base, double altura)
    {
        // initialise instance variables
        setBase(base);
        setAltura(altura);
    }
    
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getArea(){
        return (this.base*this.altura)/2;
    }
    public String getNombreFigura() {
        return "triangulo";
    }
}
