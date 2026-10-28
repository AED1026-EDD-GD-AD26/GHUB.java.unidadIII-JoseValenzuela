package listaDeContactos;

import lista.Lista;
import lista.PosicionIlegalException;

public class ListaDeContactos {
    //atributos
    private Lista<Contacto> contactos;
    
    //constructos
    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }

    //metodos
    //retorna una lista de todos los contactos
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }

    //agregar un nuevo contacto a la lista, si todavia no hay ningun contacto
    //con ese nombre y apellido
    public boolean agregarContacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular)throws PosicionIlegalException{
        Contacto con = new Contacto(nombres, apellidos, direccion, correo, telefono, celular);

    }

    //busca un contacto dado sus nombres y apellidos retorna el contacto
    //si lo encuentra y null en caso contrario
    public Contacto buscarContacto(String nombres, String apellidos)throws PosicionIlegalException{

    }
}
