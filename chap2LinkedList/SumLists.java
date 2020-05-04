
public class SumLists {
    static LinkedListNode addTwoNumbers(LinkedListNode n1, LinkedListNode n2) {
        int result = 0;
        int count = 0;
        LinkedListNode head = null;
        LinkedListNode previus = null;
        boolean moreOne = false;
        while(n1 != null || n2 != null) {
            if (n1 != null) {
                result+=(n1.data);
                n1 = n1.next;
            }
            if (n2 != null) {
                result+=(n2.data );
                n2 = n2.next;
            }
            if (moreOne) {
                result+=1;
                moreOne = false;
            }
            if(result >= 10) {
                result-=10;
                moreOne = true;
            }
            LinkedListNode r1 = new LinkedListNode(result, null, null);
            if(count == 0) {
                head = r1;
            } else {
                previus.setNext(r1);
            }
            previus = r1;
            count+=1;
            result = 0;
        }
        return head;
    }

    public static void main(String[] args) {

        LinkedListNode l1 = new LinkedListNode(7, null, null);
        LinkedListNode l2 = new LinkedListNode(1, null, null);
        LinkedListNode l3 = new LinkedListNode(6, null, null);
        LinkedListNode l4 = new LinkedListNode(5, null, null);
        LinkedListNode l5 = new LinkedListNode(9, null, null);
        LinkedListNode l6 = new LinkedListNode(2, null, null);
        l1.setNext(l2);
        l2.setNext(l3);
        l4.setNext(l5);
        l5.setNext(l6);

        LinkedListNode result = addTwoNumbers(l1, l4);
     
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}