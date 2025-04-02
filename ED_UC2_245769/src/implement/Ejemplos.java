/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 *
 * @author edgar
 */
public class Ejemplos {

    public Ejemplos() {
    }
    public void ejemploLES(){
        Nodo a = new Nodo(1);
        Nodo b = new Nodo(2);
        Nodo c = new Nodo(3);
        
        Nodo d = new Nodo(13);
        Nodo e = new Nodo(21);
        System.out.println("...");
        System.out.println("Creamos 5 elementos que tienen un dato diferente");
        System.out.println("...");
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        System.out.println("Creamos una lista");
        
        System.out.println("...");
        System.out.println("Verificamos si la lista esta vacia");
        System.out.println(lista.isEmpty());
        System.out.println("...");
        System.out.println("Agregaremos los primeros elementos al principio de la lista");
        lista.addFirst(a);
        lista.addFirst(b);
        lista.addFirst(c);
        lista.addFirst(d);
        lista.addLast(e);
        System.out.println("...");
        System.out.println("Comprobamos: ");
        lista.toString();
        System.out.println("");
        System.out.println("...");
        System.out.println("Bien, ahora borraremos el primer elemento de la lista");
        lista.removeFirst();
        
        System.out.println("Comprobemos: ");
        lista.toString();
        
        System.out.println("Excelente, ahora agregaremos un nodo al principio de la lista");
        System.out.println("Y otro al final de la lista");
        lista.addFirst(new Nodo(7));
        lista.addLast(new Nodo(42));
        System.out.println("Comprobamos: ");
        lista.toString();
        System.out.println("");
        System.out.println("...");
        
        System.out.println("Ups... me equivoque, no queria agregar el ultimo elemento ");
        System.out.println("Tendremos que borrar el ultimo elemento");
        lista.removeLast();
        System.out.println("Comprobamos: ");
        lista.toString();
        System.out.println("");
        
        System.out.println("Cuantos elementos tendra la lista: ");
        System.out.println("");
        System.out.println("tamaño: " + lista.Size());
        System.out.println("---");
        
        System.out.println("Fin del ejemplo");
    }
    public void ejemploLDE(){
        System.out.println("...");
        System.out.println("Creamos 5 elementos que tienen un dato diferente");
        System.out.println("...");
        LED lista = new LED();
        System.out.println("Creamos una lista");
        
        System.out.println("...");
        System.out.println("Verificamos si la lista esta vacia");
        System.out.println(lista.isEmpty());
        System.out.println("...");
        System.out.println("Agregaremos los primeros elementos al principio de la lista");
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addLast(5);
        lista.addLast(15);
        System.out.println("...");
        System.out.println("Comprobamos: ");
        System.out.println(lista.Tostring());
        System.out.println("...");
        System.out.println("Bien, ahora borraremos el primer elemento de la lista");
        lista.removeFirst();
        System.out.println("Comprobemos: ");
        System.out.println(lista.Tostring());
        
        System.out.println("Excelente, ahora agregaremos un nodo al principio de la lista");
        System.out.println("Y otro al final de la lista");
        lista.addFirst(13);
        lista.addLast(21);
        System.out.println("Comprobamos: ");
        System.out.println(lista.Tostring());
        System.out.println("...");
        
        System.out.println("Ups... me equivoque, no queria agregar el ultimo elemento ");
        System.out.println("Tendremos que borrar el ultimo elemento");
        lista.removeLast();
        System.out.println(lista.Tostring());
        System.out.println("Cuantos elementos tendra la lista: ");
        System.out.println("");
        System.out.println("tamaño: " + lista.size());
        System.out.println("---");
        
        System.out.println("Fin del ejemplo");
    }
    public void ejemploLESC(){
        System.out.println("...");
        System.out.println("Creamos 5 elementos que tienen un dato diferente");
        System.out.println("...");
        LESC lista = new LESC();
        System.out.println("Creamos una lista");
        
        System.out.println("...");
        System.out.println("Verificamos si la lista esta vacia");
        System.out.println(lista.isEmpty());
        System.out.println("...");
        System.out.println("Agregaremos los primeros elementos al principio de la lista");
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addLast(5);
        lista.addLast(15);
        System.out.println("...");
        System.out.println("Comprobamos: ");
        System.out.println(lista.toString());
        System.out.println("...");
        System.out.println("Bien, ahora borraremos el primer elemento de la lista");
        lista.removeFirst();
        
        System.out.println("Comprobemos: ");
        System.out.println(lista.toString());
        
        System.out.println("Excelente, ahora agregaremos un nodo al principio de la lista");
        System.out.println("Y otro al final de la lista");
        lista.addFirst(13);
        lista.addLast(21);
        System.out.println("Comprobamos: ");
        System.out.println(lista.toString());
        System.out.println("...");
        
        System.out.println("Ups... me equivoque, no queria agregar el ultimo elemento ");
        System.out.println("Tendremos que borrar el ultimo elemento");
        lista.removeLast();
        System.out.println("Comprobamos: ");
        System.out.println(lista.toString());
        System.out.println("Cuantos elementos tendra la lista: ");
        System.out.println("");
        System.out.println("tamaño: " + lista.size());
        System.out.println("---");
        
        System.out.println("Fin del ejemplo");
    }
    public void ejemploLEDC(){
        System.out.println("...");
        System.out.println("Creamos 5 elementos que tienen un dato diferente");
        System.out.println("...");
        LEDC lista = new LEDC();
        System.out.println("Creamos una lista");
        
        System.out.println("...");
        System.out.println("Verificamos si la lista esta vacia");
        System.out.println(lista.isEmpty());
        System.out.println("...");
        System.out.println("Agregaremos los primeros elementos al principio de la lista");
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addLast(3);
        lista.addLast(5);
        lista.addLast(15);
        System.out.println("...");
        System.out.println("Comprobamos: ");
        System.out.println(lista.ToString());
        System.out.println("...");
        System.out.println("Bien, ahora borraremos el primer elemento de la lista");
        lista.removeFirst();
        
        System.out.println("Comprobemos: ");
        System.out.println(lista.ToString());
        
        System.out.println("Excelente, ahora agregaremos un nodo al principio de la lista");
        System.out.println("Y otro al final de la lista");
        lista.addFirst(13);
        lista.addLast(21);
        
        System.out.println("Comprobamos: ");
        System.out.println(lista.ToString());
        System.out.println("...");
        
        System.out.println("Ups... me equivoque, no queria agregar el ultimo elemento ");
        System.out.println("Tendremos que borrar el ultimo elemento");
        lista.removeLast();
        
        System.out.println("...");
        System.out.println(lista.ToString());
        System.out.println("Cuantos elementos tendra la lista: ");
        System.out.println("");
        System.out.println("tamaño: " + lista.size());
        System.out.println("---");
        
        System.out.println("Fin del ejemplo");
        
        
        System.out.println("Imagina que buscamos un elemento que tenga un 1 como dato");
        System.out.println(lista.contains(1));
        
        System.out.println("Que pasa si quiero un elemento con cierto dato");
        System.out.println("Borramos la lista");
        lista.Clear();
        System.out.println("Comprobamos: ");
        System.out.println(lista.ToString());
    }
}
