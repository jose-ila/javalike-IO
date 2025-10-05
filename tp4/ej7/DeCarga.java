
/**
 * Write a description of class deCarga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeCarga extends Vagon
{
    private double Carga;
    
    public DeCarga(double peso, double Carga)
    {
        super(peso);
        setCarga(Carga);
    }
    
    public void setCarga(double carga){
        this.Carga = carga;
    }
    public double getCarga(){
        return this.Carga;
    }
    public double pesoTotal(){
        return super.getPeso() + getCarga();
    }
    public int cantPasajeros(){
        return 0;
    }
}
