package miPrincipal;
import java.util.Stack;

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
        System.err.println(p2.cima());
        p2.retirar();
        System.err.println(p2.cima());
        p2.retirar();
        System.err.println(p2.cima());
        p2.retirar();
        System.err.println(p2.cima());

        System.out.println("******************************");
        System.out.println("DEMOSTRACION DE LA CLASE STACK");
        System.out.println("******************************");

        Stack<Integer> p3 = new Stack<Integer>();
        p3.push(10);
        p3.push(20);
        p3.push(30);
        System.out.println("¿Esta la p3 vacia? "+p3.empty());
        System.out.println("El tamaño de p3 = "+p3.size());
        System.out.println("¿En que posicion se encuentra el elemento 20? "+p3.search(20));
        System.out.println("¿En que posicion se encuentra el elemento 25? "+p3.search(25));
        System.out.println("Cima de p3: "+p3.peek());
        p3.pop();
        System.out.println("Cima de p3: "+p3.peek());
        p3.pop();
        System.out.println("Cima de p3: "+p3.peek());
        p3.pop();
        
        if(!p3.empty()){
            System.out.println("Cima de p3: "+p3.peek());
        }
    }
}