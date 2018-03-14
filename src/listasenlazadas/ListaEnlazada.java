package listasenlazadas;

public class ListaEnlazada
{
    private Nodo primerNodo;
    private Nodo ultimo;
    private int size;
    
    public ListaEnlazada()
    {
        primerNodo = null;
        ultimo = null;
        size = 0;
    }
    public void addFinal(String informacion) {
        Nodo p = new Nodo(informacion);
        if (primerNodo == null) {
            primerNodo = p;
        } else {
            ultimo.link = p;
        }
        ultimo = p;
        size++;
    }
    public void addPrincipio(String informacion) {
        Nodo p = new Nodo(informacion);
        if (primerNodo == null) {
            ultimo = p;
        } else {
            p.link = primerNodo;
        }
        primerNodo = p;
        size++;
    }
    public String get(int index) {
        Nodo p = primerNodo;
        for (int i = 0; i < index; i++) {
            p = p.link;
        }
        return p.info;
    }
    
    public Nodo getNodo(int index) {
        if (index >= size()) return null;
        Nodo p = primerNodo;
        for (int i = 0; i < index; i++) {
            p = p.link;
        }
        return p;
    }
    public boolean remove(int index)
    {
        Nodo actual = getNodo(index);
        if (actual == null) return false;
        if (index == 0)
            primerNodo = primerNodo.link;
        else
        {
            Nodo anterior = getNodo(index-1);
            anterior.link = actual.link;
            size--;
            return true;
        }
        return false;
    }
    
    public boolean remove(String info)
    {
        if (primerNodo.info.equals(info))
        {
            primerNodo = primerNodo.link;
        }else
        {
            Nodo anterior = primerNodo;
            Nodo actual = anterior.link;
            while (!actual.info.equals(info)) {
                anterior = anterior.link;
                actual = actual.link;
            }
            anterior.link = actual.link;
            size--;
        }
        return true;
    }
    
    public int size()
    {
        return size;
    }
}
