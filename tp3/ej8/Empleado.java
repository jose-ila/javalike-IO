import java.util.Date;

/**
 * Write a description of class Empleado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Empleado extends Persona
{
    // instance variables - replace the example below with your own
    private double salario;
    private String funcion;
    public Empleado(String nombre, String dni, String direccion, Date fecha, String sexo,String funcion, double salario)
    {
        super(nombre, dni, direccion, fecha, sexo);
        setFuncion(funcion);
        setSalario(salario);
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setFuncion(String funcion){
        this.funcion = funcion;
    }
    public String getFuncion(){
        return this.funcion;
    }
    public abstract double calcularSalario();
}
