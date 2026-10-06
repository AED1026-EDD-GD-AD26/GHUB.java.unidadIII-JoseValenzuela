package pila;
public class Nodo {
    //atributo
    private T valor;
    private Nodo<T> siguiente;

    //constructores
    public Nodo(){
        this.valor = null;
        this.Nodo = null;
    }
    //getter
    public T getValor(){
        return valor;
    }
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //setter
    public void setValor(T valor){
        this.valor = valor;
    }
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}
