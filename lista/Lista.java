package lista;

public class Lista<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    public Lista(){
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
                //el nodo a insertar esta al comienzo de la lsita
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
    public void remover(int pos){

    }
}
