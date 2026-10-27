package miPrincipal;

import java.util.Stack;
import cola.Cola;
import lista.Lista;
import lista.PosicionIlegalException;
import logica.Persona;
import pila.Pila;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Hashtable;
import java.text.ParseException;
import java.util.Enumeration;
import lista.Lista;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

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

        System.out.println("*****************************");
        System.out.println("DEMOSTRACION DE LA CLASE COLA");
        System.out.println("*****************************");

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

        System.out.println("***************************************************");
        System.out.println("DEMOSTRACION DE USO TABLAS DE DISPERSION: HASHTABLE");
        System.out.println("***************************************************");

        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        //instancia a las personas que queremos almacenar
        Persona per10 = new Persona("Pablo", 33, "Argentino");
        Persona per11 = new Persona("Juan", 25, "Mexicano");
        Persona per12 = new Persona("Pedro",28,"Español");
        //agregar a las personas a la tabla
        tabla.put(per10.getNombre(), per10);
        tabla.put(per11.getNombre(), per11);
        tabla.put(per12.getNombre(), per12);
        //operacion analizadora
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));
        System.out.println(tabla.get("Pablo"));

        System.out.println(tabla.get("Simon"));

        String aux;
        Enumeration<String> claves = tabla.keys();
        while (claves.hasMoreElements()) {
            aux = claves.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
        }
        System.out.println();

        System.out.println("**********************************************");
        System.out.println("DEMOSTRACION DE UNA LISTA SIMPLEMENTE ENLAZADA");
        System.out.println("**********************************************");

        Lista<Integer> lista_enteros = new Lista<>();
        lista_enteros.agregar(10);
        lista_enteros.agregar(25);
        lista_enteros.agregar(30);
        try{
        //imprimir elementos
        System.out.println("Dato que esta en laposicion 2: "+lista_enteros.getValor(2));
        System.out.println("Dato que esta en laposicion 2: "+lista_enteros.getValor(1));
        System.out.println("Dato que esta en laposicion 2: "+lista_enteros.getValor(0));
        lista_enteros.insertar(30, 3);
        System.out.println("Dato que esta en laposicion 3: "+lista_enteros.getValor(3));
        lista_enteros.insertar(12, 1);
        System.out.println("Recorrer todos los elementos de lista: ");
        for(int i = 0; i < lista_enteros.getTamanio(); i++){
            System.out.println("Elemento: "+i+" : "+lista_enteros.getValor(i));
        }
        lista_enteros.remover(1);

        for(int i = 0; i < lista_enteros.getTamanio(); i++){
            System.out.println("Elemento: "+i+" : "+lista_enteros.getValor(i));
        }
        lista_enteros.remover(3);

        for(int i = 0; i < lista_enteros.getTamanio(); i++){
            System.out.println("Elemento: "+i+" : "+lista_enteros.getValor(i));
        }
        lista_enteros.limpiar();

        System.out.println("Recorrer todos los elementos de la lista despues de limpiar");
        for(int i = 0; i < lista_enteros.getTamanio(); i++){
            System.out.println("Elemento: "+i+" : "+lista_enteros.getValor(i));
        }

        }catch(PosicionIlegalException e){
            System.out.println(e.getMessage());
        }

        System.out.println("**********************************************");
        System.out.println("DEMOSTRACION DE USO DE: LinkedList y ArrayList");
        System.out.println("**********************************************");
        
        try{
            List<Integer> lista_enteros2 = new LinkedList<>();
            List<Integer> lista_enteros3 = new ArrayList<>();
            //agregar elementos a la lista enlazada
            lista_enteros2.add(12);
            lista_enteros2.add(15);
            lista_enteros2.add(20);
            System.out.println("Dato en la posicion 0: "+lista_enteros2.get(0));
            System.out.println("Dato en la posicion 1: "+lista_enteros2.get(1));
            System.out.println("Dato en la posicion 2: "+lista_enteros2.get(2));
            lista_enteros2.add(1,13);
            lista_enteros2.add(3,16);
            System.out.println("Recorre la lista despues de las inserciones");
            for(int i = 0; i < lista_enteros2.size(); i++){
                System.out.println("Dato en la posicion "+i+" : "+lista_enteros2.get(i));
            }
            lista_enteros2.remove(0);
            lista_enteros2.remove(3);
            System.out.println("Recorre la lista despues de las eliminaciones");
            for(int i = 0; i < lista_enteros2.size(); i++){
                System.out.println("Dato en la posicion "+i+" : "+lista_enteros2.get(i));
            }
            System.out.println("Recorre la lista utilizando iteradores");
            for(Integer aux1 : lista_enteros2){
                System.out.println("Dato: "+aux1);
            }

            //insertar algunos elementos al arrayList
            lista_enteros3.add(10);
            lista_enteros3.add(15);
            lista_enteros3.add(24);
            System.out.println("Recorre el ArrayList");
            for(int i = 0; i < lista_enteros3.size(); i++){
                System.out.println("Dato en la posicion "+i+" : "+lista_enteros3.get(i));
            }
            //modificar un elemento
            lista_enteros3.set(0,100);
            System.out.println("El elemento 0, despues del reemplazo: "+lista_enteros3.get(0));
            //System.out.println("Valor del elemento 4: "+lista_enteros3.get(3));
            System.out.println(lista_enteros3.indexOf(15));
            System.out.println(lista_enteros3.indexOf(150));
            System.out.println(lista_enteros3.getLast());
            System.out.println(lista_enteros3.getFirst());

        }catch(Exception e){
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
}