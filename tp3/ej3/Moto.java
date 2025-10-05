
/**
 * Write a description of class Moto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moto extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int cilindrada;
    private String tipo;

    /**
     * Constructor for objects of class Moto
     */
    public Moto()
    {
        // initialise instance variables
    }

    public int getCilindrada(){
        return this.cilindrada;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
