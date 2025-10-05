
/**
 * Write a description of class BienPersonal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BienPersonal
{
    // instance variables - replace the example below with your own
    private int id;
    private double valorFiscal;
    private String dueno;

    /**
     * Constructor for objects of class BienPersonal
     */
    public BienPersonal(int id, double val, String dueno)
    {
        setId(id);
        setValorFiscal(val);
        setDueno(dueno);
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    
    public void setValorFiscal(double val){
        this.valorFiscal = val;
    }
    public double getValorFiscal(){
        return this.valorFiscal;
    }
    
    public void setDueno(String dueno){
        this.dueno = dueno;
    }
    public String getDueno(){
        return this.dueno;
    }
    
    public abstract double calcCuotas();
    
    public abstract double calcAnual();
}
