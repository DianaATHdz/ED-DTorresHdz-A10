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
public class NodeDL <T> {
    public T data;
    NodeDL<T> prev;
    NodeDL<T> next;

    NodeDL(T d) {
        data = d;
        prev = null;
        next = null;
    }
    
}
