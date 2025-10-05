import java.util.Date;

/**
 * Write a description of class Page here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Page
{
    // instance variables - replace the example below with your own
    private Date visiDate;
    private int size;
    private String code;
    private Direction webDir;
    public Page(Date date, int size, String code, Direction webDir)
    {
        setVisiDate(date);
        setSize(size);
        setCode(code);
        setWebDir(webDir);
    }
    
    public Date getVisiDate(){
        return this.visiDate;
    }
    public int getSize(){
        return this.size;
    }
    public String getCode(){
        return this.code;
    }
    public Direction getWebDir(){
        return this.webDir;
    }
    public void setVisiDate(Date date){
        this.visiDate = date;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setWebDir(Direction dir){
        this.webDir = dir;
    }
}
