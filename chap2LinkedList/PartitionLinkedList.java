
public class PartitionLinkedList {
    static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;
        while(node != null) {
            LinkedListNode next = node.next;
            node.next = null;
            if(node.data < x) {
                if(beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }
                else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }
            else {
                if(afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                }
                else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }
        if(beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
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

        LinkedListNode x = partition(l1, 5);
     
        while(x != null) {
            System.out.println(x.data);
            x = x.next;
        }
    }
}