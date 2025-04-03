/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

/**
 * Lista Doblemente Enlazada
 * @author edgar arturo acevedo acosta 245769
 */
public class LED {
    public Nodo primero, anterior;
    public int tam;
    
   
    /**
     *  Constructor de la lista doblemente enlazada
     *  los elementos del nodo: primero y anterior se inicializa con null y 0 que seria lo mismo.
     *  
     */
    public LED() {
        primero =null;
        anterior=null;
        tam=0;
    }
    
    /**
     *  Nos permite conocer si la lista esta vacia o no,
     * @return regresa un verdadero si la lista esta vacia y falso si tiene algun objeto
     *  Regresa un mensaje de si la lista esta vacía
     * 
     */
    public boolean isEmpty(){
        if(primero == null){
            System.out.println("La lista esta vacia");
        return true;
        }
        return false;
    }
    
    /**
     *  Regresa la cantidad de elementos que conforman la lista
     * @return El numeno de elementos >=0
     */
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
    
    /**
     *  Añade elementos al principio de la lista
     * @param dato el elemento (dato) que se desea añadir en la lista
     *  Manda una indicacion de que si se pudo agregar el elemento
     */
    public void addFirst(int dato){
        Nodo aux =new Nodo(dato); 
        if(isEmpty()){
            primero= aux;
            anterior= aux;
        }else{
            aux.setSiguiente(primero);
            primero.setAnterior(aux);
            primero=aux;
        }
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
        if(primero==null){
            primero=aux;
            anterior= aux;
        }else{
            anterior.setSiguiente(aux);
            aux.setAnterior(anterior);
            anterior= aux;
        }
        System.out.println("Se agrego el elemento a la lista");
        tam++;
    }
    
    /**
     * Elimina el elemento al inicio de la lista
     * Verifica si la lista tiene elementos o solo un elemento
     * Manda un mensage de que si se pudo eliminar
     */
    public void removeFirst(){
        if(primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(primero.getSiguiente() ==null){
            primero=null;
        }else{
            primero= primero.getSiguiente();
            primero.setAnterior(null);
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
        if(primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(primero.getSiguiente() ==null){
            primero=null;
        }else{
            Nodo aux= primero;
            while(aux.siguiente != null){
                aux= aux.siguiente;
            }
            // Elimina la referencia hacia delante
            aux.getAnterior().setSiguiente(null);
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
        Nodo aux= primero;
        while(aux != null){
            if(aux.getDato()==dato){
                return true;
            }
            aux= aux.getSiguiente();
        }
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
    public void Clear(){
        primero= null;
        anterior=null;
        System.out.println("La lista ha sido eliminada");
    }
    
    /**
     * Muestra en consola cada uno de los elementos de la lista
     * @return regresa la lista separada entre espacios 
     */
    public String Tostring(){
        if (primero==null) {
            return "La lista esta vacia";
        }
        StringBuilder resultado= new StringBuilder("[");
        // permite modificar la cadena sin crear nuevos objetos en memoria
        Nodo aux= primero;
        while(aux != null){
            resultado.append(aux.getDato());
            if(aux.getSiguiente() != null){
                resultado.append(" <-> ");
            }
            aux= aux.getSiguiente();
        }
        resultado.append(" (LDE)");
        return resultado.toString();
        
    }
}
