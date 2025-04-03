/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 * Lista Enlazada Simple Circular
 * @author edgar arturo acevedo acosta 245769
 */
public class LESC {
    int tam=0;
    Nodo primero;

    /**
     * Constructor para agregar el primer elemento, en la lista 
     * @param primero el elemento que inicializa la lista
     */
    public LESC(Nodo primero) {
        this.primero = primero;
        primero.setSiguiente(primero);
        tam++;
    }

    /**
     * Constructor que inicializa en null y 0, que nadamas crea la lista sin elementos.
     */
    public LESC() {
        primero=null;
        tam=0;
    }
    
    /**
     * Nos permite conocer si la lista esta vacia o no,
     * @return regresa un verdadero si la lista esta vacia y falso si tiene algun objeto
     * Regresa un mensaje de si la lista esta vacía
     */
    public boolean isEmpty(){
        if(primero == null){
            System.out.println("La lista esta vacia");
        return true;
        }
        return false;
    }
    
    /**
     * Regresa la cantidad de elementos que conforman la lista
     * @return El numeno de elementos >=0
     */
    public int size(){
        return tam;
    }
    
    /**
     * Añade elementos al principio de la lista
     * @param dato el elemento (dato) que se desea añadir en la lista
     *  Manda una indicacion de que si se pudo agregar el elemento
     */
    public void addFirst(int dato) {
        Nodo aux = new Nodo(dato);
        if(isEmpty()){
            primero=aux;
            primero.setSiguiente(primero);
        }else{
            Nodo actual= primero;
            while(actual.getSiguiente() !=primero){
                actual=actual.getSiguiente();
            }
            aux.setSiguiente(primero);
            actual.setSiguiente(aux);
            primero=aux;
        }
        /*
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
        }*/
        System.out.println("Se agrego el elemento a la lista");
        tam++;
    }
    
    /**
     * Añade elementos al final de la lista 
     * @param dato el elemento que se quiere agregar 
     * Manda una indicacion de que si se pudo agregar el elemento
     */
    public void addLast(int dato){
        Nodo aux= new Nodo(dato);
        if(isEmpty()){
            primero=aux;
            primero.setSiguiente(primero);
        }else{
            Nodo actual=primero;
            while(actual.getSiguiente() !=primero){
                actual= actual.getSiguiente();
            }
            actual.setSiguiente(aux);
            aux.setSiguiente(primero);
        }
        System.out.println("Se agrego el elemento a la lista");
        tam++;
    }

    /**
     * Elimina el elemento al inicio de la lista
     * Verifica si la lista tiene elementos o solo un elemento
     * Manda un mensage de que si se pudo eliminar
     */
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }
        if (primero.getSiguiente() == primero) { 
            primero = null;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != primero) {
                actual = actual.getSiguiente();
            }
            primero = primero.getSiguiente();
            actual.setSiguiente(primero);
        }
        System.out.println("Se elimino el elemento a la lista");
        tam--;
    }
    
    /**
     * Elimina un elemento al final de la lista
     * Verifica si la lista tiene elementos o solo un elemento
     * Manda un mensage de que si se pudo eliminar
     */
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }if (primero.getSiguiente() == primero) { 
            primero = null;
        }else{
            Nodo aux=primero;
            Nodo anterior= null;
            while(aux.getSiguiente() != primero){
                anterior= aux;
                aux= aux.getSiguiente();
            }
            anterior.setSiguiente(primero);
        }
        System.out.println("Se elimino el elemento a la lista");
        tam--;
    }
    
    /**
     * Busca el elemento (dato) dentro de la lista
     * @param dato El dato del elemento que se busca en la lista
     * @return Regresa verdadero si el elemento esta en la lista y false si es el caso contrario
     */
    public boolean contains(int dato){
        if (isEmpty()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return false;
        }
        Nodo aux= primero.getSiguiente();
        do{
            if(aux.getDato()==dato){
                return true;
            }
            aux = aux.getSiguiente();
        }while(aux != primero.getSiguiente());
        return false;
    }
    
    /**
     * Busca un dato en la lista de elementos 
     * @param dato el dato que se esta buscando
     * @return Regresa el elemento que tenga ese dato
     */
    public Nodo getElement(int dato){
        if(isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }
        Nodo aux= primero;
        do{
            if(aux.getDato() == dato){
                return aux;
            }
            aux= aux.getSiguiente();
        }while(aux != primero);
        return null;
    }
    
    /**
     * Elimina todos los elementos de la lista
     * Manda un mensage de se ha eliminado la lista
     */
    public void clear(){
        primero=null;
        tam=0;
        System.out.println("La lista ha sido eliminada");
    }
    
    /**
     * Muestra en consola cada uno de los elementos de la lista
     * @return regresa la lista separada entre espacios 
     */
    public String toString(){
        if (isEmpty()) {
            return "La lista esta vacia";
        }
        StringBuilder resultado= new StringBuilder();
        // permite modificar la cadena sin crear nuevos objetos en memoria
        Nodo aux= primero;
        do{
            resultado.append(aux.getDato()).append(" -> ");
            aux= aux.getSiguiente();
        }while(aux !=primero);
        resultado.append("(LESC)");
        return resultado.toString();
    }
}
