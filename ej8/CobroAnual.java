import java.util.Date;

/**
 * Write a description of class CobroAnual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CobroAnual extends Cobro
{

    public CobroAnual(BienPersonal bien, Date fecha)
    {
        super(bien, fecha);
    }
    
    public double calcCobro(){
       return super.getBien().calcAnual();
    }

}
