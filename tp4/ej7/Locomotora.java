
/**
 * Write a description of class Locomotora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Locomotora
{
    // instance variables - replace the example below with your own
    private double velMax;
    private double potenciaMax;
    private double pesoMax;
    private double consumo;
    private double peso;
    /**
     * Constructor for objects of class Locomotora
     */
    public Locomotora(double velMax,double potenciaMax,double consumo,double peso)
    {
        setVelMax(velMax);
        setPotenciaMax(potenciaMax);
        setConsumo(consumo);
        setPeso(peso);
    }
    // Getter and Setter for velMax
    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    // Getter and Setter for potenciaMax
    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }
    // Getter and Setter for consumo
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    // Getter and Setter for peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double cantidadDeLitrosNecesarios(int km){
        return getConsumo() * km;
    }
}
