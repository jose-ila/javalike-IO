import java.util.Vector;

/**
 * Write a description of class History here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class History
{
    // instance variables - replace the example below with your own
    private Vector<Page> pages;

    public History(Vector pages)
    {
        setPages(pages);
    }
    
    public Vector getPages(){
        return this.pages;
    }
    public void setPages(Vector pages){
        this.pages = pages;
    }
    public void addPages(Vector pages){
        this.pages.addAll(pages);
    }
    public void addPage(Page page){
        this.pages.add(page);
    }
    public void deletePages(){
        this.pages.clear();
    }
    public void deletePage(Page page){
        this.pages.remove(page);
    }
    public int getVisitedPageCount(){
        return this.pages.size();
    }
    public Page lastPage(){
        return this.pages.lastElement();
    }
    
}
