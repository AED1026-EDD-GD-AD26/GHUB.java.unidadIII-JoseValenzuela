package listaDoble;

public class ListaDoble<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    public ListaDoble(){
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
            cabeza = nuevo;
        }else{
            //agregar al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            //ahora se introduce esta linea porque se actualiza la liga 
            //anterior de nuevo
            nuevo.setAnterior(aux);
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
                //esta enlaza la cabeza anterior por la nueva cabeza
                cabeza.setAnterior(nuevo);
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }else{
                //el nodo a insertar va al final
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    nuevo.setAnterior(aux);
                }else{
                    //el nodo a insertar esta en medio
                    Nodo<T> aux = cabeza;
                    for(int i = 0; i <= pos-2; i++){
                        aux = aux.getSiguiente();
                        
                    }
                    Nodo<T>siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                    nuevo.setAnterior(aux); //nueva
                    siguiente.setAnterior(nuevo); //nueva
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
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
                tamanio--;
            }else{ //eliminar en medio o al final
                Nodo<T> aux = cabeza;
                for(int i = 0; i < pos-1 ; i++){
                    aux = aux.getSiguiente();

                }
                Nodo<T> prox = aux.getSiguiente();
                if(prox.getSiguiente() != null){
                    prox.getSiguiente().setAnterior(aux);
                    aux.setSiguiente(prox.getSiguiente());
            }else{
                //es el ultimo nodo
                aux.setSiguiente(null);
                }
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
