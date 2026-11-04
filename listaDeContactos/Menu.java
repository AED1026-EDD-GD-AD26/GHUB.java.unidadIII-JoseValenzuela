package listaDeContactos;

import lista.Lista;
import lista.PosicionIlegalException;
import java.util.Scanner;

public class Menu {
    private final ListaDeContactos listaDeContactos;
    private final Scanner scanner;

    public Menu(){
        listaDeContactos = new ListaDeContactos();
        scanner = new Scanner(System.in);
    }

    public void iniciar(){
        try{
        boolean salir = false;
        while(!salir){
            mostrarOpciones();
            int opcion = leerEntero("Seleccione una opcion valida");
            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    modificarContacto();
                    break;
                case 4:
                    buscarContacto();
                    break;
                case 5:
                    mostrarTodosLosContactos();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Sliendo del sistema");
                    break;
                default:
                    System.out.println("Intentalo de nuevo");
                    break;
            }
        }
    }catch(PosicionIlegalException e){
        System.out.println(e.getMessage());
        }
    }

    private void mostrarOpciones(){
        System.out.println("**********MENU LISTA DE CONTACTOS**********");
        System.out.println("1.- Agregar contacto");
        System.out.println("2.- Eliminar contacto");
        System.out.println("3.- Modificar contacto");
        System.out.println("4.- Buscar contacto");
        System.out.println("5.- Mostrar todos los contactos");
        System.out.println("0.- Salir");
    }

    private void agregarContacto()throws PosicionIlegalException{
        String nombres;
        String apellidos;
        while (true) {
            nombres = leerTexto("Proporciona nombre: ");
            apellidos = leerTexto("Proporciona apellidos: ");
            if(listaDeContactos.buscarContacto(nombres, apellidos) == null){
                break;
            }else{
                System.out.println("El nombre: "+nombres+" y apellido: "+apellidos+" ya existen, intente de nuevo");
            }
        }

        String direccion = leerTexto("Proporciona la direcion: ");
        String correco = leerTexto("Proporciona el correo electronico: ");
        String telefono = leerTexto("Proporciona el telefono: ");
        String celular = leerTexto("Proporciona el celular: ");

        if(listaDeContactos.agregarContacto(nombres, apellidos, direccion, correco, telefono, celular)){
            System.out.println("El contacto se agrego correctamente");
        }else{
            System.out.println("No fue posible agregar el contacto");
        }
    }

    private void eliminarContacto()throws PosicionIlegalException{
        String nombres;
        String apellidos;
        Contacto con;
        while (true) {
            nombres = leerTexto("Proporciona nombre: ");
            apellidos = leerTexto("Proporciona apellidos: ");
            con = listaDeContactos.buscarContacto(nombres, apellidos);
            if(con != null){
                break;
            }else{
                System.out.println("El nombre: "+nombres+" y apellido: "+apellidos+" no existen, intente de nuevo");
            }
        }

        if(listaDeContactos.eliminarContacto(nombres, apellidos)){
            System.out.println("El contacto se elimino correctamente");
        }else{
            System.out.println("No fue posible eliminar el contacto");
        }
    }

    private void modificarContacto()throws PosicionIlegalException{
        String nombres;
        String apellidos;
        Contacto con;

        while (true) {
            nombres = leerTexto("Proporciona nombre: ");
            apellidos = leerTexto("Proporciona apellidos: ");
            con = listaDeContactos.buscarContacto(nombres, apellidos);
            if(con == null){
                System.out.println("El contacto no existe, intente de nuevo");
            }else{
                break;
            }
        }

        String direccion = leerTexto("Nueva direcion: ");
        String correco = leerTexto("Nuevo correo electronico: ");
        String telefono = leerTexto("Nuevo telefono: ");
        String celular = leerTexto("Nuevo celular: ");

        if(listaDeContactos.modificarContacto(nombres, apellidos, direccion, correco, telefono, celular)){
            System.out.println("El contacto se modifico correctamente");
        }else{
            System.out.println("No fue posible modificar el contacto");
        }
    }

    private void buscarContacto() throws PosicionIlegalException {
    String nombres = leerTexto("Proporciona nombre: ");
    String apellidos = leerTexto("Proporciona apellidos: ");

    Contacto con = listaDeContactos.buscarContacto(nombres, apellidos);

    if (con != null) {
        System.out.println("Contacto encontrado:");
        System.out.println(con.toString());
    } else {
        System.out.println("No se encontro el contacto.");
        }
    }

    private void mostrarTodosLosContactos()throws PosicionIlegalException{
        Lista<Contacto> lista = listaDeContactos.mostrarTodosLosContactos();
        for(int i = 0; i < lista.getTamanio(); i++){
            System.out.println(" - "+lista.getValor(i).toString());
        }
    }

    private int leerEntero(String mensaje){
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un numero entero");
            scanner.next();
            System.out.println(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private String leerTexto(String mensaje) {
        System.out.println(mensaje);
        String valor = scanner.nextLine();
        return valor;
    }
}
