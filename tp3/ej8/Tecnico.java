import java.util.Date;

/**
 * Write a description of class Tecnico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tecnico extends Empleado
{
    // instance variables - replace the example below with your own
    private String titulo;

    /**
     * Constructor for objects of class Tecnico
     */
    public Tecnico(String nombre, String dni, String direccion, Date fecha, String sexo,String funcion, String titulo, double salario)
    {
        super(nombre, dni, direccion, fecha, sexo,funcion, salario);
        setTitulo(titulo);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public double calcularSalario(){
        return getSalario();
    }
    
    
}
