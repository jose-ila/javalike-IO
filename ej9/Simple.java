import java.util.Vector;

/**
 * Write a description of class Simple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simple extends Tour
{
    private Vector<Atraccion> atracciones;
    private Guia guia;
    public Simple(Vector<Atraccion> atracciones, String nombre, double precio, Guia guia, Vector<Turista> turistas)
    {
        super(nombre, precio, turistas);
    }
    
        // Getter y Setter para atracciones
    public Vector<Atraccion> getAtracciones() {
        return atracciones;
    }
    public void setAtracciones(Vector<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }
    
    // Getter y Setter para guia
    public Guia getGuia() {
        return guia;
    }
    public void setGuia(Guia guia) {
        this.guia = guia;
    }
}
