
/**
 * Write a description of class Punto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto 
{
    private double x;
    private double y;
    
    public Punto(){
    }
    
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setPunto(double x, double y){
        this.x = x;
        this.y = y;        
    }
    public void sumarValor(double n){
        sumarPunto(n, n);
    }
    public void sumarPunto(double x, double y){
        setX(getX() + x);
        setY(getY() + y);
    }
    public void distanciaDe(double x, double y){
        System.out.println(Math.sqrt(Math.pow((getX()-x),2) + Math.pow((getY()- y),2)));
    }
    public void distanciaOrigen(){
        distanciaDe(0,0);
    }
}

