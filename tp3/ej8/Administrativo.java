import java.util.Date;

/**
 * Write a description of class Administrativo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrativo extends Empleado
{
    // instance variables - replace the example below with your own
    private int categoria;
    private int antiguedad;
    /**
     * Constructor for objects of class Administrativo
     */
    public Administrativo(String nombre, String dni, String direccion, Date fecha, String sexo,String funcion,int categoria, int antiguedad, double salario)
    {
        super(nombre, dni, direccion, fecha, sexo,funcion, salario);
    }

    public double calcularSalario(){
        return (getSalario()*this.categoria) + ((getSalario() * this.antiguedad)/4);
    }
}
