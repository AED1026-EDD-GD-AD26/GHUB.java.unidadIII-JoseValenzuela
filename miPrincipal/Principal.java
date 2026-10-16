package miPrincipal;

import java.util.Stack;
import cola.Cola;
import logica.Persona;
import pila.Pila;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

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

        System.out.println("******************************");
        System.out.println("DEMOSTRACION DE LA CLASE COLA");
        System.out.println("******************************");

        Cola<Integer> cola = new Cola<Integer>();
        System.out.println("¿La cola esta vacia? "+cola.esVacia());
        cola.encolar(10);
        cola.encolar(35);
        cola.encolar(12);
        cola.encolar(7);
        System.out.println("¿La cola esta vacia? "+cola.esVacia());
        System.out.println("Tamaño de cola: "+cola.getTamanio());
        System.out.println("El siguiente elemento a atender: "+cola.frente());
        cola.desencolar();
        System.out.println("El siguiente elemento a atender: "+cola.frente());
        cola.desencolar();
        cola.desencolar();
        System.out.println("El siguiente elemento a atender: "+cola.frente());
        System.out.println("Tamaño de cola: "+cola.getTamanio());
        cola.desencolar();
        System.out.println("El siguiente elemento a atender: "+cola.frente());
        System.out.println("Tamaño de cola: "+cola.getTamanio());

        Cola<Persona> colaPersona = new Cola<Persona>();
        Persona pers1 = new Persona("Maria", 5);
        Persona pers2 = new Persona("Juan", 3);
        Persona pers3 = new Persona("Emilio", 2);

        colaPersona.encolar(pers3);
        colaPersona.encolar(pers1);
        colaPersona.encolar(pers2);
        System.out.println("Al frente de la cola cola esta: "+colaPersona.frente());
        colaPersona.desencolar();
        System.out.println("Al frente de la cola cola esta: "+colaPersona.frente());

        System.out.println("*****************************************");
        System.out.println("DEMOSTRACION DE USO DE LA INTERFACE QUEUE");
        System.out.println("*****************************************");

        Queue<String> micola = new LinkedList<String>() ;
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        System.out.println("Tamaño de micola: "+micola.size());
        System.out.println("Proximo elemento a atender: "+micola.peek());
        System.out.println("Atiendo y despacho al elemento de la cola: "+micola.remove());
        System.out.println("Proximo elemento a atender: "+micola.peek());
        System.out.println("Atiendo y despacho al elemento de la cola: "+micola.remove());
        System.out.println("Proximo elemento a atender: "+micola.peek());
        System.out.println("Atiendo y despacho al elemento de la cola: "+micola.remove());
        System.out.println("Proximo elemento a atender: "+micola.peek());

        Queue<Persona> colaGente = new LinkedList<>();
        colaGente.add(pers1);
        colaGente.add(pers2);
        colaGente.add(pers3);
        System.out.println("La persona: "+pers2.toString()+" se encuentra en la cola? "+colaGente.contains(pers2));
        while (!colaGente.isEmpty()) {
            System.out.println("Proximo elemento a atender: "+colaGente.remove());
        }
        System.out.println("Tamaño de colaGente: "+colaGente.size());
        System.out.println("La persona: "+pers2.toString()+" se encuentra en la cola? "+colaGente.contains(pers2));

        Queue<Integer> colaPrio = new PriorityQueue<Integer>();
        colaPrio.add(10);
        colaPrio.add(5);
        colaPrio.add(3);
        colaPrio.add(1);
        System.out.println("Proximo elemento en salir: "+colaPrio.peek());

    }
}