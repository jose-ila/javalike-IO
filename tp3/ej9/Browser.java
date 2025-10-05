import java.util.Vector;

/**
 * Write a description of class Browser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Browser
{
    // instance variables - replace the example below with your own
    private Page currentPage;
    private History history;
    private Vector<Direction> favs;

    /**
     * Constructor for objects of class Browser
     */
    public Browser(Page currentP, History his, Vector favs)
    {
        setCurrentPage(currentP);
        setHistory(his);
        setFavs(favs);
    }
    
    public Page getCurrentPage(){
        return this.currentPage;
    }
    public History getHistory(){
        return this.history;
    }
    public Vector getFavs(){
        return this.favs;
    }
    public void setCurrentPage(Page page){
        this.currentPage = page;
    }
    public void setHistory(History history){
        this.history = history;
    }
    public void setFavs(Vector favs){
        this.favs = favs;
    }
}
