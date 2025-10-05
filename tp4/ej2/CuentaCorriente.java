import java.util.Date;
import java.util.Vector;

/**
 * Write a description of class CuentaCorriente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaCorriente extends CuentaBancaria
{
    // instance variables - replace the example below with your own
    private int limite;
    private int cantExt;

    /**
     * Constructor for objects of class CuentaCorriente
     */
    public CuentaCorriente(String nombre, double saldo, int max, Date fecha, int lim,Vector tr)
    {
        super(nombre, saldo, max, fecha,tr);
        setCantExt(0);
        setLimite(lim);
    }
    public int getCantExt(){
        return this.cantExt;
    }
    public int getLimite(){
        return this.limite;
    }
    public void setCantExt(int c){
        this.cantExt = c;
    }
    public void setLimite(int lim){
        this.limite = lim;
    }
    public void extraer(double monto){
        if(monto < super.getSaldo()){
            super.extraer(monto);
        }else{
            if(getCantExt() <= getLimite() && monto > super.getSaldo()){
                super.extraer(monto);
                setCantExt(getCantExt() + 1);
            }else{
                System.out.println("Se alcanzo el limite de extracciones por encima del saldo");
            }  
        }
        
    }
}
