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
        Contacto con = buscarContacto(nombres, apellidos);
        if(con == null){
            Contacto nuevo = new Contacto(nombres, apellidos, direccion, correo, telefono, celular);
            contactos.agregar(nuevo);
            return true;
        }else{
            return false;
        }
    }

    //busca un contacto dado sus nombres y apellidos retorna el contacto
    //si lo encuentra y null en caso contrario
    public Contacto buscarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        for(int i = 0; i < contactos.getTamanio(); i++){
            Contacto con = contactos.getValor(i);
            if(con.getNombres().equalsIgnoreCase(nombres) && con.getApellidos().equalsIgnoreCase(apellidos)){
                return con;
            }
        }
        return null;
    }

    //elimina un contacto de la lista dado sus nombres y apellidos
    //siempre y cuando exista un contacto con ese nombre y 
    //apellido y retorna true y sino retorna un false
    public boolean eliminarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres,apellidos);
        if(con != null){
            for(int i = 0; i < contactos.getTamanio(); i++){
                con = contactos.getValor(i);
                if(con.getNombres().equalsIgnoreCase(nombres) && con.getApellidos().equalsIgnoreCase(apellidos)){
                    contactos.remover(i);
                }
            }
            return true;
        }else{
            return false;
        }
    }

    //modifica los datos de un contacto dado sus nombres y apellidos
    //si el ususario existe se modifica con los datos y retorna true
    //si no se modifica y retorna false
    public boolean modificarContacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con == null){
            return false;
        }else{
            return true;
        }
    }
}
