import java.util.Vector;

/**
 * Write a description of class Cola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cola
{
    // instance variables - replace the example below with your own
    private Vector<Elemento> elementos;

    /**
     * Constructor for objects of class Cola
     */
    public Cola(Vector<Elemento> vec)
    {
        setElementos(vec);
    }

    public void setElementos(Vector<Elemento> vec){
        this.elementos = vec;
    }
    
    public Vector<Elemento> getElementos(){
        return this.elementos;
    }
    
    public void encolar(Elemento elem){
        getElementos().add(elem);
    }
    public Elemento desencolar(){
        return getElementos().remove(0);
    }
    public boolean isEmpty(){
        return getElementos().isEmpty();
    }
    public int size(){
        return getElementos().size();
    }
    public Elemento first(){
        return getElementos().firstElement();
    }
    public Elemento last(){
        return getElementos().lastElement();
    }
}
