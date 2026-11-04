package listaDoble;

public class Nodo<T> {
    
    // atributo
    private T valor;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;

    // constructor
    public Nodo() {
        this.valor = null;
        this.siguiente = null;
        this.anterior = null;
    }

    // getter
    public T getValor() {
        return valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public Nodo<T> getAnterior(){
        return anterior;
    }

    // setter
    public void setValor(T valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo<T> anterior){
        this.anterior = anterior;
    }
}
