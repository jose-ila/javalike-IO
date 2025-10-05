
/**
 * Write a description of class Atraccion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atraccion
{
   private String nombre;
    private String direccion;
    private String descripcion;

    // Constructor
    public Atraccion(String nombre, String direccion, String descripcion) {
        setNombre(nombre);
        setDireccion(direccion);
        setDescripcion(descripcion);
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
