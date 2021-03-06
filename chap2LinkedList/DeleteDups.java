import java.util.*;

public class DeleteDups {
    static void delete(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previus = null;
        while (n != null) {
            if(set.contains(n.data)) {
                previus.next = n.next;
            } else {
                set.add(n.data);
                previus = n;
            }
            n = n.next;
        }
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
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l6);
        l6.setNext(l7);

        delete(l1);
     
        while(l1 != null) {
            System.out.println(l1.data);
            l1 = l1.next;
        }
    }
}