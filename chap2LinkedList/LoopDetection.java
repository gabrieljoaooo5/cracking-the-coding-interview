import java.util.*;
import java.util.ArrayList;

public class LoopDetection {
    static LinkedListNode loop(LinkedListNode n) {
        ArrayList nodes = new ArrayList();
        while(n != null) {
            if(nodes.contains(n)) {
                return n;
            }
            nodes.add(n);
            n = n.next;
        }
        return n;
    }

    public static void main(String[] args) {

        LinkedListNode l1 = new LinkedListNode(7, null, null);
        LinkedListNode l2 = new LinkedListNode(1, null, null);
        LinkedListNode l3 = new LinkedListNode(7, null, null);
        LinkedListNode l4 = new LinkedListNode(5, null, null);
        LinkedListNode l5 = new LinkedListNode(9, null, null);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l3);

        LinkedListNode result = loop(l1);
        System.out.println(result.data);
    }
}