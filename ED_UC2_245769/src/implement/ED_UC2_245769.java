/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement;

/**
 *
 * @author edgar
 */
public class ED_UC2_245769 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo a = new Nodo(1);
        Nodo b = new Nodo(2);
        Nodo c = new Nodo(3);
        
        Nodo d = new Nodo(13);
        Nodo e = new Nodo(21);
        
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        
        lista.isEmply();
        
        lista.addFirst(a);
        lista.addFirst(b);
        lista.addFirst(c);
        
        lista.addFirst(new Nodo(7));
        lista.addLast(new Nodo(42));
        
        lista.toString();
        

        System.out.println("tamaño: " + lista.Size());
        System.out.println("---");
        
        lista.removeFirst();
        lista.removeLast();
        
        
        System.out.println("tamaño: " + lista.Size());

        lista.isEmply();
    }
    
}
