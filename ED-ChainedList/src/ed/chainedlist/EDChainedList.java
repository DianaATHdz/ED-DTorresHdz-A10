/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.chainedlist;

/**
 *
 * @author DianaAlessa
 */
public class EDChainedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList <String> Lista = new MyList();   
        Lista.insertFirst("10");
        Lista.showList();
        Lista.insertLast("200");
        Lista.showList();
        Lista.insertFirst("101");
        Lista.showList();
        Lista.deleteNode("200");
        Lista.showList();
        
    }   
}
