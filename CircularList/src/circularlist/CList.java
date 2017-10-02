/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlist;

/**
 *
 * @author DianaAlessa
 */
public class CList {
    
public class CircularList <T> {
    public T data;
    public CircularList <T> pivot;
    public CircularList <T> pointer;
    int length;
    private CircularList<T> next;
    public CircularList <T> first;
    public CircularList <T> last;

    
    //Constructor
    CircularList (){
    pivot=pointer=null;
    length=0;
    }
    
    CircularList (T d){
    CircularList <T> node = new CircularList <T> (d);
    pivot=node.next=node;
    length ++;
    }
    
    //No existe destructor en java
    
    //Está vacía?
        boolean isEmpty() {
            return length==0;
        }
    //Insertar
        void insert(T d) {
    CircularList <T> node = new CircularList <T> (d);
        if (isEmpty()){
           pivot=node.next=node;
         }else {
             node.next=pivot.next;
             pivot.next=node;
    }
    length ++;
}
    //Eliminar nodo
        void deleteNode(T d) {
             if (!isEmpty()){
                  pointer = pivot;
                    for (int i=1; i<=length; i++){
                        if(pointer.next.data==d){
                            pointer.next = pointer.next.next;
                             if(pivot.data==d) {
                                 pivot = pointer;
                            }length--;
                        pointer=null;
                i=length+1;
                    }
                pointer=pointer.next;
                }
    }//No hay nada que borrar, adiós!
}
       //Vaciar lista
        void deleteList() {
            pointer=null;
        }
        
        //Imprimir
          void showList(){
            pointer=pivot;
            System.out.print("first->");
            for (int i=0; i<length; i++){
            System.out.print("["+pointer.data.toString()+"]->"); //Se pone toString para imprimir la lista de cadenas y no solo un entero (direccion de memoria)
            pointer = pointer.next;
             }
            System.out.println("<-last");
          }
    }
}



