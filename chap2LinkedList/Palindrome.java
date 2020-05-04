
public class Palindrome {
    static boolean isPalindrome(LinkedListNode n1) {
        String result = "";
        String reverseResult = "";
        while(n1 != null) {
            result+=String.valueOf(n1.data);
            reverseResult = String.valueOf(n1.data) + reverseResult;
            n1 = n1.next;
        }
        return result.equals(reverseResult);
    }

    public static void main(String[] args) {

        LinkedListNode l1 = new LinkedListNode(7, null, null);
        LinkedListNode l2 = new LinkedListNode(1, null, null);
        LinkedListNode l3 = new LinkedListNode(7, null, null);
        LinkedListNode l4 = new LinkedListNode(5, null, null);
        LinkedListNode l5 = new LinkedListNode(9, null, null);
        LinkedListNode l6 = new LinkedListNode(2, null, null);
        l1.setNext(l2);
        l2.setNext(l3);
        l4.setNext(l5);
        l5.setNext(l6);

        boolean truthResult = isPalindrome(l1);
        boolean falseResult = isPalindrome(l4);

        System.out.println("Truth Result: " + truthResult);
        System.out.println("False Result: " + falseResult);
    }
}