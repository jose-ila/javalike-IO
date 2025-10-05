import java.util.Date;

/**
 * Write a description of class CobroCuotas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CobroCuotas extends Cobro
{
    
    private int cantCuotas;
    
    public CobroCuotas(BienPersonal bien, Date fecha, int cuotas)
    {
        super(bien, fecha);
        setCuotas(cuotas);
    }

    public void setCuotas(int cuotas){
        this.cantCuotas = cuotas;
    }
    public int getCuotas(){
        return this.cantCuotas;
    }
    public double calcCobro(){
        return super.getBien().calcCuotas()/getCuotas();
    }
}
