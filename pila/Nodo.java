package pila;

public class Nodo<T> {
    
    // atributo
    private T valor;
    private Nodo<T> siguiente;

    // constructor
    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    // getter
    public T getValor() {
        return valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    // setter
    public void setValor(T valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
