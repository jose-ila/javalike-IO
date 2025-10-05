import java.util.Vector;

/**
 * Write a description of class editorFiguras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class editorFiguras
{
    // instance variables - replace the example below with your own
    private Vector<Figura> figuras;

    /**
     * Constructor for objects of class editorFiguras
     */
    public editorFiguras(Vector figuras)
    {
        // initialise instance variables
        setFiguras(figuras);
    }

    public Vector getFiguras(){
        return this.figuras;
    }
    public void setFiguras(Vector figuras){
        this.figuras = figuras;
    }
    public void agregarFiguras(Vector figuras){
        this.figuras.addAll(figuras);
    }
    public void eliminarFiguras(){
        this.figuras.clear();
    }
    public void agregarFigura(Figura fig){
        this.figuras.add(fig);
    }
    public void eliminarFigura(Figura fig){
        this.figuras.remove(fig);
    }
    public void pintar(String color){
        for(Figura figura: figuras){
            figura.pintar(color);
        }
    }
    public double calcularArea(){
        double areaTotal = 0;
        for(Figura figura : figuras){
            areaTotal += figura.getArea();
        }
        return areaTotal;
    }
}
