/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 * Lista Doblemente Enlazada
 * @author edgar
 */
public class LED {
    public Nodo primero, anterior;
    public int tam;
    
    public LED() {
        primero= anterior =null;
        tam=0;
    }
    
    public boolean isEmpty(){
        return primero == null;
    }
    
    public int size(){
        return tam;
        /*
        int tamaño=0;
        Nodo aux=primero;
        while(aux !=null){
            tamaño++;
            aux= aux.siguiente;
        }
        return tamaño;*/
    } 
    
    public void addFirst(int dato){
        Nodo aux =new Nodo(dato); 
        if(isEmpty()){
            primero= anterior= aux;
          
        }else{
            aux.setSiguiente(primero);
            primero.setAnterior(aux);
            primero=aux;
        }
        tam++;
    }
    
    public void addLast(int dato){
        Nodo aux= new Nodo(dato);
        if(primero==null){
            primero= anterior= aux;
        }else{
            anterior.setSiguiente(aux);
            aux.setAnterior(anterior);
            anterior= aux;
        }
    }
    
    public void removeFirst(){
        if(primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(primero.siguiente ==null){
            primero=null;
        }else{
            primero= primero.siguiente;
            primero.anterior= null;
        }
    }
    
    public void removeLast(){
        if(primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(primero.siguiente ==null){
            primero=null;
        }else{
            Nodo aux= primero;
            while(aux.siguiente != null){
                aux= aux.siguiente;
            }
            // Elimina la referencia hacia delante
            aux.anterior.siguiente= null;
        }
    }
    
    public boolean contains(int dato){
        Nodo aux= primero;
        while(aux != null){
            if(aux.dato==dato){
                return true;
            }
            aux= aux.siguiente;
        }
        return false;
    }
    
    public void Clear(){
        primero= null;
        System.out.println("La lista ha sido eliminada");
    }
    
    public String tostring(){
        if(primero==null){
            return "La lista esta vacia";
        }
        StringBuilder resultado= new StringBuilder();
        // permite modificar la cadena sin crear nuevos objetos en memoria
        Nodo aux= primero;
        while(aux != null){
            resultado.append(aux.dato).append(" - ");
            aux=aux.siguiente;
        }
        resultado.append("null");
        return resultado.toString();
        
    }
}
