import java.util.Vector;

/**
 * Write a description of class Tren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tren
{
    // instance variables - replace the example below with your own
    private Locomotora locomotora;
    private Vector<Vagon> vagones;
    /**
     * Constructor for objects of class Tren
     */
    public Tren(Vector<Vagon> vags, Locomotora loc)
    {
        setLocomotora(loc);
        setVagones(vags);
    }
    
    public void setLocomotora(Locomotora loc){
        this.locomotora = loc;
    }
    public Locomotora getLocomotora(){
        return this.locomotora;
    }
    public void setVagones(Vector<Vagon> vag){
        this.vagones = vag;
    }
    public Vector<Vagon> getVagones(){
        return this.vagones;
    }
    
    public double pesoTotalDelTren(){
        double pesoTotalVagones= 0;
        for(Vagon vagon: getVagones()){
            pesoTotalVagones+= vagon.pesoTotal();
        }
        
        return pesoTotalVagones + getLocomotora().getPeso();
    }
    public double calcularPotenciaNecesaria(double peso, double velocidad) {
        // Coeficiente de resistencia al rodamiento (para una vía férrea típica)
        double coeficienteRodamiento = 0.002;
        // Aceleración debida a la gravedad en m/s²
        double gravedad = 9.81;
        // Calcular la fuerza de resistencia al rodamiento
        double fuerzaRodamiento = coeficienteRodamiento * peso * gravedad;
        // Calcular la potencia necesaria en vatios
        double potenciaNecesaria = fuerzaRodamiento * velocidad;
        // Convertir la potencia necesaria a HP
        potenciaNecesaria /= 746.0;
        return potenciaNecesaria;
    }
    public boolean puedeMover(double peso, double velocidad){
        // Calcular la potencia necesaria para mover el peso a la velocidad deseada
        double potenciaNecesaria = calcularPotenciaNecesaria(peso, velocidad);
        // Verificar si la potencia de la locomotora es suficiente
        return getLocomotora().getPotenciaMax() >= potenciaNecesaria;
    }
    public int cantDePasajeros(){
       int cant = 0;
       for(Vagon vagon: getVagones()){
           cant+= vagon.cantPasajeros();
       }
       return cant;
    }
    
}
