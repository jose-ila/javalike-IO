
/**
 * Write a description of class moneda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moneda
{
    private String nombreMoneda;
    private double valPesos;
    public Moneda(String moneda, double valPesos)
    {
       this.nombreMoneda = moneda;
       setValPesos(valPesos);
    }
    
    public void setValPesos(double valor){
        this.valPesos = valor;
    }
    public double getValPesos(){
        return this.valPesos;
    }
    public double calcEnPesos(double monto){
        return getValPesos() * valPesos;
    }
}
