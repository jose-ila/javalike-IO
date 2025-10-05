
/**
 * Write a description of class Direction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Direction
{
    // instance variables - replace the example below with your own
    private String protocol;
    private String domain;
    private String path;
    private int port;
    
    public Direction(String protocol, String domain, String path, int port)
    {
        setProtocol(protocol);
        setDomain(domain);
        setPath(path);
        setPort(port);
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
