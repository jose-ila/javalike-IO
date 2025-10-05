import java.util.Date;
import java.util.Vector;

/**
 * Write a description of class cajaAhorro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CajaAhorro extends CuentaBancaria
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class cajaAhorro
     */
    public CajaAhorro(String nombre, double saldo, int max, Date fecha,Vector tr)
    {
        super(nombre, saldo, max, fecha, tr);
    }

    public void extraer(double monto){
        if(monto <= super.getSaldo()){
            super.extraer(monto);
        }else{
            System.out.println("El monto es mayor al saldo");
        }
    }
}
