
/**
 * Write a description of class File here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class File extends FileSystem
{
    // instance variables - replace the example below with your own
    private float size;

    /**
     * Constructor for objects of class File
     */
    public File(String name)
    {
        super(name);
    }
    
    public void setSize( float s){
        this.size = s;
    }
    public float getSize(){
        return this.size;
    }
    
    public float size(){
        return getSize();
    }

    
}
