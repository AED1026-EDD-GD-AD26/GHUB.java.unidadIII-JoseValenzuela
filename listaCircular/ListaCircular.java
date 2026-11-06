package listaCircular;

public class ListaCircular<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    public ListaCircular(){
        cabeza = null;
        tamanio = 0;
    }

    //devuelve el tamaño de la lista
    public int getTamanio(){
        return tamanio;
    }

    public boolean esVacia(){
        return (cabeza==null);
    }

    //agrega un nuevo elemento al fianl de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }else{
            //agregar al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza); //el siguiente del final apunta a la cabeza
        }
        tamanio++;
    }

    //inserta un nuevo nodo en la lista
    //instroduciendo el valor agregar y la
    //posicion que ocupa
    public void insertar(T valor, int pos)throws PosicionIlegalException{

        if(pos >= 0 && pos <= tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if(pos == 0){
                //Buscar el ultimo nodo
                Nodo<T> ultimo = cabeza;
                while (ultimo.getSiguiente() != cabeza) {
                    ultimo = ultimo.getSiguiente();
                }
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                //Enlazar el ultimo con la cabeza
                ultimo.setSiguiente(cabeza);
            }else{
                //el nodo a insertar va al final
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() != cabeza){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    //enlazar el ultimo la cabezqa 
                    nuevo.setSiguiente(cabeza);
                }else{
                    //el nodo a insertar esta en medio
                    Nodo<T> aux = cabeza;
                    for(int i = 0; i <= pos-2; i++){
                        aux = aux.getSiguiente();
                        
                    }
                    Nodo<T>siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;

        }else{
            throw new PosicionIlegalException();
        }

    }

    //devuelve el valor de una determinada posicion
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos >= 0 && pos < tamanio){
            T valor;
            if(pos == 0){
                valor = cabeza.getValor();
                return valor;
            }else{
                Nodo<T> aux = cabeza;
                for(int i = 0; i <= pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
            }
            return valor;

        }else{
            throw new PosicionIlegalException();
        }
    }

    //elimina un nodo en una posicion determinada
    public void remover(int pos) throws PosicionIlegalException{
        if(pos >= 0 && pos< tamanio){
            if(pos == 0){
                //eliminar al principio de la lista
                //buscar el ultimo nodo para enlazarlo con el nuevo nodo
                Nodo<T> ultimo = cabeza;
                while (ultimo.getSiguiente() != cabeza) {
                    ultimo = ultimo.getSiguiente();
                }
                //desplaza la cabeza con el siguiente nodo 
                cabeza = cabeza.getSiguiente();
                //enlazamos el ultimo nodo con la nueva cabeza
                ultimo.setSiguiente(cabeza);
                tamanio--;
            }else{ //en medio y al final
                Nodo<T> aux = cabeza;
                for(int i = 0; i < pos-1 ; i++){
                    aux = aux.getSiguiente();

                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        }else{
            throw new PosicionIlegalException();
        }
    }

    //elimina todos los nodos de la lista
    public void limpiar(){
        cabeza = null;
        tamanio = 0;
    }
}
