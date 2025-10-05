import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

/**
 * Write a description of class Cita here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cita
{
    private Date fecha;
    private Persona contacto;
    private Lugar lugar;
    private int importancia;
    private DateFormat formatter;
    public Cita(){
        fecha = new Date();
        lugar = new Lugar();
        contacto = new Persona();
        formatter = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void setCita(int importancia, String nombre, String lugar, String date) {
        this.importancia = importancia;
        this.contacto.setNombre(nombre);
        this.lugar.setLugar(lugar);
        try
        {
            this.fecha = (Date)formatter.parse(date);
        }
        catch (java.text.ParseException pe)
        {
            pe.printStackTrace();
        }
        
    }
}
