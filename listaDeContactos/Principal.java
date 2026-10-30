package listaDeContactos;

import lista.PosicionIlegalException;
import lista.Lista;

public class Principal {
    public static void main(String[] args) {
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            
            ldc.agregarContacto("Fernando", "Castro", "Las manzanas 50 ote. Culiacan Sinaloa", "fernando@gmail.com", "6671121234", "6677343454");
            ldc.agregarContacto("Alejandro", "Valenzuela", "Blvd. Insurgentes 1240, Col. Centro, Culiacan Sinaloa", "alejandro.valenzuela@gmail.com", "6672345678", "6678901234");
            ldc.agregarContacto("Maria Fernanda", "Rios", "Paseo Niños Héroes 455, Col. Las Quintas, Culiacan Sinaloa", "mafe.rios@hotmail.com", "6673456789", "6679012345");
            ldc.agregarContacto("Jesus Alberto", "Duarte", "Av. Álvaro Obregón 1820 Sur, Col. Guadalupe, Culiacan Sinaloa", "jduarte@yahoo.com", "6674567890", "6670123456");

            Lista<Contacto> lista = ldc.mostrarTodosLosContactos();
            System.out.println("Mostrar todos los contactos");
            for(int i = 0; i < lista.getTamanio(); i++){
                System.out.println(i+" .-"+lista.getValor(i));
            }

            //buscar contacto
            Contacto con = ldc.buscarContacto("Federica", "perez");
            if(con != null){
                System.out.println("CONTACTO ENCONTRADO"+con.toString());
            }else{
                System.out.println("CONTACTO NO ENCONTRADO");
            }

            //eliminar contacto
            if(ldc.eliminarContacto("Fernando", "Castro")){
                System.out.println("CONTACTO ELIMINADO");
            }else{
                System.out.println("CONTACTO ELIMINADO");
            }

            //agregar de nuevo a fernando
            ldc.agregarContacto("Fernando", "Castro", "Las manzanas 50 ote. Culiacan Sinaloa", "fernando@gmail.com", "6671121234", "6677343454");
            lista = ldc.mostrarTodosLosContactos();
            System.out.println("MUESTRO TODOS LOS CONTACTOS:");
            for(int i = 0; i < lista.getTamanio(); i++){
                System.out.println(i+" .-"+lista.getValor(i).toString());
            }

            //modificar un contacto existente
            if(ldc.modificarContacto("Fernando", "Castro", "Las manzanas 50 ote. Culiacan Sinaloa", "fernando@gmail.com", "6671121234", "6677343454")){

            }else{
                System.out.println("NO FUE POSIBLE MODIFICAR EL CONTACTO");
            }
            lista = ldc.mostrarTodosLosContactos();
            System.out.println("MUESTRO TODOS LOS CONTACTOS");
            for(int i = 0; i < lista.getTamanio(); i++){
                System.out.println(i+" .-"+lista.getValor(i).toString());
            }
            
        }catch(PosicionIlegalException e){
            System.out.println("ocurrio un error: "+e.getMessage());
        }
    }
}
