import java.util.Vector;

/**
 * Write a description of class Pila here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pila
{
    
    private Vector<Elemento> elementos;
    
    public Pila(Vector<Elemento> vec)
    {
       setElementos(vec);
    }
    public Vector<Elemento> getElementos(){
        return this.elementos;
    }
    
    public void setElementos(Vector<Elemento> elems){
        this.elementos = elems;
    }
    
    public void apilar(Elemento elem){
        getElementos().add(elem);
    }
    
    public Elemento top(){
        return getElementos().firstElement();
    }
    public void desapilar(){
        getElementos().removeElementAt(getElementos().size() - 1);
    }
    
    public int size(){
        return getElementos().size();
    }
    public boolean isEmpty(){
        return getElementos().isEmpty();
    }
}
