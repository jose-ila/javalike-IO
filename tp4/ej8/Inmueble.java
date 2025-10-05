
/**
 * Write a description of class Inmueble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inmueble extends BienPersonal
{
    public Inmueble(int id, double val, String dueno)
    {
        super(id, val, dueno);
    }

    public double calcAnual(){
        return (super.getValorFiscal()*0.03)-(super.getValorFiscal()*0.03)*0.10;
    }
    public double calcCuotas(){
        return (super.getValorFiscal()*0.03);
    }
}
