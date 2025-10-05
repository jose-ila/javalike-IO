import java.util.Vector;

public abstract class Tour
{

    private String nombre;
    private double precio;
    private int capacidad;

    private Vector<Turista> turistas;
    public Tour(String nombre, double precio, Vector<Turista> turistas)
    {
        setNombre(nombre);
        setPrecio(precio);
        setTuristas(turistas);
    }
    
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter y Setter para precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y Setter para capacidad
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Getter y Setter para turistas
    public Vector<Turista> getTuristas() {
        return turistas;
    }
    public void setTuristas(Vector<Turista> turistas) {
        this.turistas = turistas;
    }
}
