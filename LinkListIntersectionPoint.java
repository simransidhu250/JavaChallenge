public class LinkListIntersectionPoint {
    public static ListNode headA = null;
    public static ListNode headB = null;
    public static void main(String args[]){
        // create the linked list
        LinkListIntersectionPoint l1 = new LinkListIntersectionPoint();

        // add values to linked list
        headA = l1.addToHead(headA, 7);
        headA = l1.addToHead(headA, 6);
        headA = l1.addToHead(headA, 5);
        headA = l1.addToHead(headA, 4);

        // print the linked list
        l1.printList(headA);

        // create the linked list
        LinkListIntersectionPoint l2 = new LinkListIntersectionPoint();
        headB = headA.next.next;
        headB = l2.addToHead(headB, 3);
        headB = l2.addToHead(headB, 2);
        headB = l2.addToHead(headB, 1);

        // print the linked list
        l1.printList(headB);
        



    }
//--------------------Node class----------------------------------------------
    // Node class
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
//---------------------Add node to head --------------------------------------------------

    public ListNode addToHead(ListNode head, int val){
        ListNode temp = new ListNode(val);

        // edge case
        if(head == null){
            head = temp;
            return head;
        }

        temp.next = head;
        head = temp;
        return head;
    }

//--------------------Print the linked list--------------------------------------

    public void printList(ListNode head){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
        System.out.println();
    }


}
