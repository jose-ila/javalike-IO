
/**
 * Write a description of class AireAcondicionado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    private int tempMax;
    private int tempAct;
    private boolean encendido;
    
    public AireAcondicionado(){
        this.encendido = false;
        this.tempMax = 36;
    }
    
    public int getTempMax() {
        return this.tempMax;
    }
    public void setTempAct(int n){
        this.tempAct = n;
    }
    public int getTempAct(){
        return this.tempAct;
    }
    public boolean getEncendido(){
        return this.encendido;
    }
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }
    
    public void encender(){
        setEncendido(true);
    }
    public void apagar(){
        setEncendido(false);
    }
    
    public void subirTemp(int n){
        if (getEncendido() == true && n<36){
           setTempAct(getTempAct() + n); 
        }else{
            if(n>36){
                System.out.println("La temperatura es mayor a la maxima");
            }else{
                System.out.println("El aire acondicionado esta apagado");
            }
        }
    }
    public void bajarTemp(int n){
        subirTemp(n*-1);
    }
}
