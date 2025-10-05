
/**
 * Write a description of class Vehiculo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  Vehiculo
{
    // instance variables - replace the example below with your own
    private boolean encendido;
    private int velocidad; 

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo()
    {
        this.encendido = false;
        this.velocidad = 0;
    }
    
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }
    public boolean getEncendido(){
        return encendido;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public void encender(){
        setEncendido(true);
    }
    public void apagar(){
        setEncendido(false);
    }
    public void acelerar(){
        
    }
    public void frenar(){
        
    }
}
