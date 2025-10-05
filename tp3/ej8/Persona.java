import java.util.Date;

/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String DNI;
    private String direccion;
    private Date fechaNac;
    private String sexo;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni, String direccion, Date fecha, String sexo)
    {
        setNombre(nombre);
        setDNI(dni);
        setDireccion(direccion);
        setFechaNac(fecha);
        setSexo(sexo);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
