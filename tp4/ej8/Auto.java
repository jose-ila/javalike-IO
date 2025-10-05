
/**
 * Write a description of class Auto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Auto extends BienPersonal
{
    public Auto(int id, double val, String dueno)
    {
        super(id, val, dueno);
    }

    public double calcAnual(){
        return (super.getValorFiscal()*0.05)-(super.getValorFiscal()*0.05)*0.10;
    }
    public double calcCuotas(){
        return (super.getValorFiscal()*0.05);
    }
}
