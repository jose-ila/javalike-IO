
/**
 * Write a description of class Guia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guia extends Persona
{

    private int numMatricula;  
    public Guia(String nombre, int edad, int numMatricula)
    {
        super(nombre, edad);
        setMatricula(numMatricula);
    }

    public int getMatricula(){
        return this.numMatricula;
    }
    public void setMatricula(int mat){
        this.numMatricula = mat;
    }
}

