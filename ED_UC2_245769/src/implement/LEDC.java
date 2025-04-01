/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;



/**
 *
 * @author edgar arturo acevedp acosta
 */
public class LEDC {
    int tam=0;
    Nodo primero;

    public LEDC(Nodo primero) {
        this.primero = primero;
        primero.setSiguiente(primero);
        primero.setAnterior(primero);
        
        tam++;
    }
    public void addFirst(Nodo dato) {
        
        if (tam == 1) {
            dato.setSiguiente(primero);
            primero.setSiguiente(dato);
            primero.setAnterior(dato);
            dato.setAnterior(primero);
            primero=dato;
            tam++;
        }else if(tam>1){
            dato.setSiguiente(primero);
            dato.setAnterior(primero);
            primero.getAnterior().setSiguiente(dato);
            primero.setAnterior(dato);
        }
        tam++;
    }
    
    public boolean isEmpty(){
        return primero == null;
    } 
    
    public int size(){
        return tam;
    }
    
    public void addLast(int dato){
        if(isEmpty()){
            return;
        }
        Nodo aux= new Nodo(dato);
        Nodo ult= primero.getAnterior();
        
        aux.setSiguiente(primero);
        aux.setAnterior(ult);
        ult.setSiguiente(aux);
        primero= aux;
        tam++;
    }
    
    public void removeFirst(){
        if(isEmpty()){
            return;
        }if (tam==1){
            primero=null;
        }else{
            Nodo ult= primero.getAnterior();
            primero= primero.getSiguiente();
            ult.setSiguiente(primero);
        }
        tam--;
    }
    
    public void removeLast(){
        if(isEmpty()){
            return;
        }if (tam==1){
            primero=null;
        }else{
            Nodo ult= primero.getAnterior();
            Nodo aux=ult.getAnterior();
            aux.setSiguiente(primero);
            primero.setAnterior(aux);
        }
        tam--;
    }
    
    public boolean contains(int dato){
        if(isEmpty()){
            return false;
        }
        Nodo aux=primero;
        do{
            if(aux.getDato()== dato){
                return true;
            }
        }while(aux != primero);
        return false;
    }
    
    public Nodo getElement(int dato){
        if(isEmpty()){
            return null;
        }
        Nodo aux=primero;
        do{
            if(aux.getDato() == dato){
                return aux;
            }
            aux= aux.getSiguiente();
        }while(aux != primero);
        return null;
    }
    
    public String toString(){
        if(isEmpty()){
            return "La lista esta vacia";
        }
        StringBuilder resultado= new StringBuilder();
        // permite modificar la cadena sin crear nuevos objetos en memoria
        Nodo aux= primero;
        do{
            resultado.append(aux.getDato()).append(" ");
            aux= aux.getSiguiente();
        }while(aux != primero);
        return resultado.toString();
    }
}
