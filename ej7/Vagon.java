
/**
 * Write a description of class Vagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vagon
{
    // instance variables - replace the example below with your own
    private double peso;
    public Vagon(double peso)
    {
        setPeso(peso);
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }    
    public abstract double pesoTotal();
    public abstract int cantPasajeros();
}
