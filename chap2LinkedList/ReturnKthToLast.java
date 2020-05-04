
public class ReturnKthToLast {
    static LinkedListNode kthToLast(LinkedListNode n, int kth) {
        int count = 1;
        if(n == null || kth == 0) {
            return null;
        }
        else {
            LinkedListNode head = n;
            LinkedListNode prev= null;
            while(head != null) {
                if(count == kth) {
                    prev.next = null;
                    return head;
                }
                prev = head;
                head = head.next;
                count+=1;
            }
            return null;
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

    
        LinkedListNode x = kthToLast(l1, 5);
     
        while(x != null) {
            System.out.println(x.data);
            x = x.next;
        }   
    }
}