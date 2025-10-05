import java.util.Vector;

/**
 * Write a description of class Folder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Folder extends FileSystem
{
    // instance variables - replace the example below with your own
    private Vector<FileSystem> elements;

    /**
     * Constructor for objects of class Folder
     */
    public Folder(String name,Vector<FileSystem> elems)
    {
        super(name);
        setElements(elems);
    }
    
    public void setElements(Vector<FileSystem> v){
        this.elements = v;
    }
    public Vector<FileSystem> getElements(){
        return this.elements;
    }
    public void add(Folder f){
        elements.add(f);
    }
    public void add(File f){
        elements.add(f);
    }
    
    public void remove(Folder f){
        elements.remove(f);
    }
    public void remove(File f){
        elements.remove(f);
    }
    
    public float size(){
        float totalSize = 0;
        for(FileSystem f:getElements()){
            totalSize += f.size();
        }
        return totalSize;
    }
    
}
