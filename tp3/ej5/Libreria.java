import java.util.Vector;

/**
 * Write a description of class Libreria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libreria
{
    // instance variables - replace the example below with your own
    private Vector<Libro> libros;

    /**
     * Constructor for objects of class Libreria
     */
    public Libreria(Vector libros)
    {
        setLibros(libros);
    }
    
    public void setLibros(Vector libros){
        this.libros = libros;
    }
    public Vector getLibros(){
        return this.libros;
    }
    
    public void agregarLibro(Libro lib){
        this.libros.add(lib);
    }
    
    public void eliminarLibro(Libro lib){
        this.libros.remove(lib);
    }
    public int cantLibros(){
        return this.libros.size();
    }
    public int cantTotalCopias(){
        int cantTotal= 0;
        for(Libro libro: libros){
            cantTotal += libro.getStock();
        }
        return cantTotal;
    }
}
