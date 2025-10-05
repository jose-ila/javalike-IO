import java.util.Date;

/**
 * Write a description of class transaccion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaccion
{
    // instance variables - replace the example below with your own
    private Date fecha;
    private double monto;
    private String tipoTran;
    /**
     * Constructor for objects of class transaccion
     */
    public Transaccion(Date fecha, double monto, String tipo)
    {
        setFecha(fecha);
        setMonto(monto);
        setTipoTran(tipo);
    }
     
    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipoTran() {
        return tipoTran;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setTipoTran(String tipoTran) {
        this.tipoTran = tipoTran;
    }
}
