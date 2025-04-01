/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 *
 * @author edgar
 */
public class LESC {
    int tam=0;
    Nodo primero;

    public LESC(Nodo primero) {
        this.primero = primero;
        primero.setSiguiente(primero);
        tam++;
    }

    public boolean isEmpty(){
        return primero==null;
    }
    
    public int size(){
        return tam;
    }
    
    public void addFirst(int dato) {
        Nodo aux = new Nodo(dato);
        if (tam == 1) {
            aux.setSiguiente(primero);
            primero.setSiguiente(aux);
            primero=aux;
            
        }else if(tam>1){
            Nodo actual=primero;
            while(actual.getSiguiente()!=primero){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(aux);
            primero=aux;
        }
        tam++;
    }
    
    public void addLast(int dato){
        Nodo aux= new Nodo(dato);
        if(isEmpty()){
            primero=aux;
            primero.siguiente=primero;
        }else{
            Nodo actual=primero;
            while(actual.siguiente !=primero){
                actual= actual.siguiente;
            }
            actual.siguiente= aux;
            aux.siguiente=primero;
        }
        tam++;
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }
        if (primero.siguiente == primero) { 
            primero = null;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != primero) {
                actual = actual.siguiente;
            }
            primero = primero.siguiente;
            actual.siguiente = primero;
        }
        tam--;
    }
    
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }if (primero.siguiente == primero) { 
            primero = null;
        }else{
            Nodo aux=primero;
            Nodo anterior= null;
            while(aux.siguiente != primero){
                anterior= aux;
                aux= aux.siguiente;
            }
            anterior.siguiente=primero;
        }
        tam--;
    }
    
    public boolean contains(int dato){
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return false;
        }
        Nodo aux= primero;
        do{
            if(aux.dato==dato){
                return true;
            }
            aux = aux.siguiente;
        }while(aux != primero);
        return false;
    }
    
    public int getElement(int dato){
        if(dato<0 || dato >= tam){
            System.out.println("Dato fuera del rango");
            return 0;
        }
        Nodo aux= primero;
        for (int i = 0; i < dato; i++) {
            aux= aux.siguiente;
        }
        return aux.dato;
    }
    
    public void clear(){
        primero=null;
        tam=0;
        System.out.println("La lista ha sido eliminada");
    }
    
    public String toString(){
        if (isEmpty()) {
            return"La lista está vacía, no se puede eliminar.";
        }
        StringBuilder resultado= new StringBuilder();
        // permite modificar la cadena sin crear nuevos objetos en memoria
        Nodo aux= primero;
        do{
            resultado.append(aux.dato).append(" ->");
            aux= aux.siguiente;
        }while(aux !=null);
        resultado.append("(LESC)");
        return resultado.toString();
    }
    
}
