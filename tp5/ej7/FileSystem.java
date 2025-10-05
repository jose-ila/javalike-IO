
/**
 * Write a description of class FileSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class FileSystem
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class FileSystem
     */
    public FileSystem(String name)
    {
        setName(name);
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public abstract float size();
}
