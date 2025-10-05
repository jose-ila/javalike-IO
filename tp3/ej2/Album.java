import java.util.Vector;

/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Vector fotos;

    /**
     * Constructor for objects of class Album
     */
    public Album(Vector fotos)
    {   
        setFotos(fotos);
    }
    
    public Vector getFotos(){
        return this.fotos;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFotos(Vector fotos){
        this.fotos = fotos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void defNombre(String nombre){
        setNombre(nombre);
    }
    public void agregarFoto(Foto foto){
        getFotos().add(foto);
    }
    public void agregarFotos(Vector fotos) {
        getFotos().addAll(fotos);
    }
    public int obtenerCant(){
        return getFotos().size();
    }
    public void limpiar(){
        getFotos().clear();
    }
    public void eliminarFoto(Foto f){
        getFotos().remove(f);
    }
}
