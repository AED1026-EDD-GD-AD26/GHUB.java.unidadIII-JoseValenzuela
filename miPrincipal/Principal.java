package miPrincipal;
import logica.Persona;
import pila.Pila;

public class Principal {

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("DEMOSTRACION DE USO CLASE PILA");
        System.out.println("******************************");
        Pila<Integer> p1 = new Pila<Integer>();
        System.out.println("¿La pila p1 esta vacia? "+p1.esVacia());
        p1.apilar(10);
        System.out.println("¿La pila p1 esta vacia? "+p1.esVacia());
        System.out.println("Tamano de p1 despues de apilar 10:"+p1.getTamanio());
        p1.apilar(5);
        System.out.println("¿La pila p1 esta vacia? "+p1.esVacia());
        System.out.println("Tamano de p1 despues de apilar 5:"+p1.getTamanio());
        p1.apilar(20);
        System.out.println("¿La pila p1 esta vacia? "+p1.esVacia());
        System.out.println("Tamano de p1 despues de apilar 20: "+p1.getTamanio());
        System.out.println("La cima de p1 = "+p1.cima());
        p1.retirar();
        System.out.println("La cima despues de retirar = "+p1.cima());
        p1.retirar();
        System.out.println("La cima despues de retirar = "+p1.cima());
        p1.retirar();
        System.out.println("La cima despues de retirar = "+p1.cima());

        Persona per1 = new Persona("Haziel", 22);
        Persona per2 = new Persona("Lola", 27);

        Pila<Persona> p2 = new Pila<Persona>();
        p2.apilar(per1);
        p2.apilar(per2);
        p2.apilar(new Persona("Tracy", 25));
        //seguir con mas opciones de la pila de personas
    }
}