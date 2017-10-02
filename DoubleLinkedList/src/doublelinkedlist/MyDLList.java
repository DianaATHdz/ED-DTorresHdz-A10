/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author DianaAlessa
 */
public class MyDLList <T> {
    public NodeDL<T> first;
    public NodeDL<T> last;
    public NodeDL<T> pointer;
    int length;

    MyDLList() {
        first = null;
        last = null;
        pointer = null;
        length = 0;
    }

    MyDLList(T d) {
        NodeDL<T> node = new NodeDL<T>(d);
        first = node;
        last = node;
        pointer = null;
        length = 1;
    }

    boolean isEmpty() {
        return length == 0;
    }

    void insertFirst(T d) {
        NodeDL<T> node = new NodeDL<T>(d);
        if(isEmpty()){
            first = node;
            last = node;
        } else {
            node.next = first;
            first.prev = node;
            first = node;
        }
        length+=1;
    }
    void insertLast(T d){
        NodeDL<T> node = new NodeDL<T>(d);
        if(!isEmpty()){
            last.next=node;
            node.prev=last;
            last=node;
        }else{
            first=node;
            last=node;
        }
        length+=1;
    }
    void borrarInicio(){
        if(!isEmpty()){
            first.next.prev= null;
            first=first.next;
            length-=1;
        }
    }
    void borrarFinal(){
        if(!isEmpty()){
            last=last.prev;
            last.next= null;
            length-=1;
        }
    }
    void borrarNodo(T data){
        if(!isEmpty()){
            if(first.data==data){
                borrarInicio();
                length-=1;
                return;
            }
            if(last.data==data){
                borrarFinal();
                length-=1;
                return;
            }
            pointer=first;
            do{
                if(pointer.data==data){
                    pointer.prev.next=pointer.next;
                    pointer.next.prev=pointer.prev;
                    pointer= null;
                    length-=1;
                } else pointer=pointer.next;
            } while(pointer!= null);
        }
    }
    void muestraListaInicioFin(){
        if(!isEmpty()){
            pointer=first;
            System.out.println("First->");
            while(pointer!= null){
                System.out.println("[" + pointer.data + "]");
                pointer=pointer.next;
                if(pointer!= null){
                    System.out.println(" -> ");
                }
            }
            System.out.println("<- Last");
        }
    }

    void muestraListaFinInicio(){
        if(!isEmpty()){
            pointer=last;
            System.out.println("Last->");
            while(pointer!= null){
                System.out.println("[" + pointer.data + "]");
                pointer=pointer.prev;
                if(pointer!= null){
                    System.out.println(" -> ");
                }
            }
            System.out.println("<- Last");
        }
    }
}
