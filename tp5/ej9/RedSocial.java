import java.util.Vector;

/**
 * Write a description of class redSocial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedSocial
{
    // instance variables - replace the example below with your own
    private Vector<Observable> usuarios;

    /**
     * Constructor for objects of class redSocial
     */
    public RedSocial(Vector<Observable> usuarios)
    {
       this.usuarios = usuarios;
    }
    public Vector<Observable> getUsuarios()
    {
        return this.usuarios;
    }
    public void anadirUsuario(Observable usuario){
        getUsuarios().add(usuario);
    }
}
