
/**
 * Write a description of class DePasajero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DePasajero extends Vagon
{
    // instance variables - replace the example below with your own
    private int cantPasajeros;
    /**
     * Constructor for objects of class DePasajero
     */
    public DePasajero(double peso, int pasajeros)
    {
        // initialise instance variables
        super(peso);
        setCantPasajeros(pasajeros);
    }
    
    public int getCantPasajeros(){
        return this.cantPasajeros;
    }
    public void setCantPasajeros(int cant){
        this.cantPasajeros = cant;
    }
    public double pesoTotal(){
        return super.getPeso() + getCantPasajeros()*80;
    }
    public int cantPasajeros(){
        return getCantPasajeros();
    }
}
