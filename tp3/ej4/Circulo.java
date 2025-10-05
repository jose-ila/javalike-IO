
/**
 * Write a description of class Circulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    // instance variables - replace the example below with your own
    private double radio;

    /**
     * Constructor for objects of class Circulo
     */
    public Circulo(double radio)
    {
        setRadio(radio);
    }

    public double getRadio(){
        return this.radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getArea(){
        return this.radio*this.radio*Math.PI;
    }
    public String getNombreFigura(){
        return "Circulo";
    }
}
