import java.util.Date;
import java.util.Vector;

/**
 * Write a description of class CuentaBancaria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class CuentaBancaria
{
    // instance variables - replace the example below with your own
    private String titular;
    private double saldo;
    private int maxExtr;
    private Date fechaCrea;
    private int cantExt;
    private Vector<Transaccion> transacciones;
    private Moneda moneda;
    public CuentaBancaria(String nombre, double saldo, int max, Date fecha, Vector tr)
    {
        setTitular(nombre);
        setSaldo(saldo);
        setMaxExtr(max);
        setFechaCrea(fecha);
        setCantExt(0);
        setTransacciones(tr);
    }
    public void setTransacciones(Vector tr){
        this.transacciones = tr;
    }
    public Vector getTransacciones(){
        return this.transacciones;
    }
    public int getCantExt(){
        return this.cantExt;
    }
    public void setCantExt(int cant){
        this.cantExt = cant;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getMaxExtr(){
        return this.maxExtr;
    }
    public Date getFechaCrea(){
        return this.fechaCrea;
    }
    public Moneda getMoneda(){
        return this.moneda;
    }
    public void setMoneda(Moneda mon){
        this.moneda = mon;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo( double saldo){
        this.saldo = saldo;
    }
    public void setMaxExtr(int max){
        this.maxExtr = max;
    }
    public void setFechaCrea(Date fecha){
        this.fechaCrea = fecha;
    }
    public void agregarTransaccion(Transaccion tr){
        this.transacciones.add(tr);
    }
    public Transaccion crearTransaccion(double monto, String tipo){
        Transaccion nuevaTr= new Transaccion(new Date(), monto, tipo);
        
        return nuevaTr;
    }
    public void extraer(double monto){
        if(getCantExt() <= getMaxExtr()){
           setSaldo(getSaldo() - monto);
           agregarTransaccion(crearTransaccion(monto, "extraccion"));
           setCantExt(getCantExt() + 1 );
        }else{
            System.out.println("Se llego a la cantidad maxima de extracciones.");
        }
        
    }
    public void depositar(double monto){
        setSaldo(getSaldo() + monto);
        agregarTransaccion(crearTransaccion(monto, "deposito"));
    }
    public String nombreTitular(){
        return getTitular();
    }
    public double consultarSaldo(){
        return getMoneda().calcEnPesos(getSaldo());
    }
}
