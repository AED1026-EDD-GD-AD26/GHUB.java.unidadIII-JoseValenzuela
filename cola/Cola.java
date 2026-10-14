package cola;

public class Cola<T> {
    //atributos cabeza que apunta al primer elemento de la cola
    private Nodo<T> cabeza;
    //atributo cola, que apunta al ultimo elemto de la cola
    private Nodo<T> cola;
    //almacena el total de elementos de la cola 
    private int tamanio;
    //constuctor por defecto
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }

    //devolver el tamanio de la cola
    public int getTamanio(){
        return tamanio;
    }

    //verifica si la cola esta vacia
    public boolean esVacia(){
        return (cabeza == null);
    }

    //encolar un elemento nuevo
    public void encolar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //se enlaza el campo siguiente de la cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser nuevo
            cola = nuevo;
        }
        tamanio++;
    }
}
