import java.util.Vector;

public class Empresa
{
    // instance variables - replace the example below with your own
    private Vector<Empleado> empleados;

    /**
     * Constructor for objects of class Empresa
     */
    public Empresa(Vector emp)
    {
        setEmpleados(emp);
    }

    public Vector getEmpleados(){
        return empleados;
    }
    public void setEmpleados(Vector emp){
        this.empleados = emp;
    }
    
    public double montoTotal(){
        double monto = 0;
        for(Empleado empleado: empleados){
            monto+= empleado.getSalario();
        }
        return monto;
    }
}
