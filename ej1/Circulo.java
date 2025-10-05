
/**
 * Write a description of class circulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circulo
{
    // instance variables - replace the example below with your own
    private Punto centro;
    private double radio;
    
    Circulo(){
        centro = new Punto();
    
    }
    
    public void setCentro(double x , double y){
        this.centro.setPunto(x,y);
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void ampliarRadio(double n){
        setRadio(getRadio() + n);
    }
    public double area(){
        return (Math.PI * Math.pow(getRadio(),2) );
    }
    public void trasladar(double x, double y){
        setCentro(x, y);
    }
}

