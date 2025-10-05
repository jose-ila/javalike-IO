
/**
 * Write a description of class Contador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contador
{
    // instance variables - replace the example below with your own
    private int valor;

    /**
     * Constructor for objects of class Contador
     */
    public Contador()
    {
    }
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valorNuevo){
        this.valor = valorNuevo;
    }
    public void iniciar(){
        iniciar(0);
    }
    public void iniciar(int n){
        setValor(n);
    }
    public void sumar(){
        sumar(1);
    }
    public void sumar( int n){
        setValor(getValor() + n) ;
    }
    public void restar(){
        restar(1);
    }
    public void restar(int n){
        setValor(getValor() - n);
    }
}
