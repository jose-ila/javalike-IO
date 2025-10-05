import java.util.Date;

/**
 * Write a description of class Cobro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Cobro
{
    // instance variables - replace the example below with your own
    private BienPersonal bien;
    private Date fecha;
    
    public Cobro(){
        
    }
    public Cobro(BienPersonal bien, Date fecha)
    {
        setBien(bien);
        setFecha(fecha);
    }
    
    public void setBien(BienPersonal bien){
        this.bien = bien;
    }
    public BienPersonal getBien(){
        return this.bien;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Date getFecha(){
        return this.fecha;
    }
    
    public abstract double calcCobro(); 
}
