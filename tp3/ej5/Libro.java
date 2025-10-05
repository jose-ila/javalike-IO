import java.util.Date;
import java.util.Vector;

/**
 * Write a description of class Libro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private String titulo;
    private String autor;
    private Date fechaPubl;
    private Vector<Personaje> personajes;
    private int stock; 
    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, String autor,Vector personajes, Date fecha, int stock)
    {
        setTitulo(titulo);
        setAutor(autor);
        setFecha(fecha);
        setPersonajes(personajes);
        setStock(stock);
    }
    public void setPersonajes(Vector personajes){
        this.personajes = personajes;
    }
    public Vector getPersonajes(){
        return this.personajes;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
     public void setAutor(String autor){
        this.autor = autor;
    }
     public void setFecha(Date fecha){
        this.fechaPubl = fecha;
    }
     public void setStock(int stock){
        this.stock = stock;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public Date getFecha(){
        return this.fechaPubl;
    }
    public int getStock(){
        return this.stock;
    }
}
