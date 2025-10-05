import java.util.Vector;

/**
 * Write a description of class Sistema here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sistema
{
    // instance variables - replace the example below with your own
    private Vector<Tour> tours;


    public Sistema(Vector<Tour> tours)
    {
        setTours(tours);
    }

    public Vector<Tour> getTours(){
        return this.tours;
    }
    public void setTours(Vector<Tour> tours){
        this.tours = tours;
    }
    public double valorDeTodosLosTours(){
       int total = 0;
       for (Tour t: getTours()){
           total += t.getPrecio();
       }
       return total;
    }
    public int cantidadTotalDeTuristas(){
        int total = 0;
        for(Tour t: getTours()){
            total += t.getTuristas().size(); 
        }
        return total;
    }
    public double valorDe(Tour tour){
        for(Tour t: getTours()){
            if(t.equals(tour)){
                return t.getPrecio();
            }
        }
        return -1;
    }
}
