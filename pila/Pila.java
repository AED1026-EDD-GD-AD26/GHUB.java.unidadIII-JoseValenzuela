package pila;

public class Pila<T> {

    //atributos
    private Nodo<T> cabeza;
    private int tamanio;

    //cosntructores
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }

    //getter y setter
    public int getTamanio(){
        return tamanio;
    }
    
    //metodos personalizado
    public boolean esVacia(){
        return (cabeza == null);
    }

    public T cima(){
        if (!esVacia()) {
            return cabeza.getValor();
        }else{
            return null;
        }
    }

    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        tamanio++;
        
    }

    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
}
