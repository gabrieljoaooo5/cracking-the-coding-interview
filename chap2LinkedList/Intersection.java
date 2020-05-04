import java.util.*;
import java.util.ArrayList;

public class Intersection {
    static LinkedListNode intersectionLinkedLists(LinkedListNode n1, LinkedListNode n2) {
        ArrayList nodesL1 = new ArrayList();
        ArrayList nodesL2 = new ArrayList();
        while (n1 != null && n2 != null) {
            if(n1 != null) {
                if(nodesL2.contains(n1)) {
                    return n1;
                }
                nodesL1.add(n1);
                n1 = n1.next;
            }
            if(n2 != null) {
                if(nodesL1.contains(n2)) {
                    return n2;
                }
                nodesL2.add(n2);
                n2 = n2.next;
            }
        }
        return n1;
    }

    public static void main(String[] args) {

        LinkedListNode l1 = new LinkedListNode(3, null, null);
        LinkedListNode l2 = new LinkedListNode(5, null, null);
        LinkedListNode l3 = new LinkedListNode(8, null, null);
        LinkedListNode l4 = new LinkedListNode(5, null, null);
        LinkedListNode l5 = new LinkedListNode(10, null, null);
        LinkedListNode l6 = new LinkedListNode(2, null, null);
        LinkedListNode l7 = new LinkedListNode(1, null, null);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l7);
        l4.setNext(l5);
        l5.setNext(l6);
        l6.setNext(l7);
        
        LinkedListNode x = intersectionLinkedLists(l1, l4);
        System.out.println(x.data);
    }
}