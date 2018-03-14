package listasenlazadas;

public class Nodo
{
    public String info;
    public Nodo link;
    
    public Nodo()
    {
        info = null;
        link = null;
    }
    
    public Nodo(String info)
    {
        this();
        this.info = info;
    }
    
    public Nodo(String info, Nodo link)
    {
        this(info);
        this.link = link;
    }
}
