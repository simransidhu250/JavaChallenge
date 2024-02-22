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
        // l1.printList(headA);

        headB = headA.next.next;
        headB = l1.addToHead(headB, 3);
        headB = l1.addToHead(headB, 2);
        headB = l1.addToHead(headB, 1);

        // print the linked list
        // l1.printList(headB);

        System.out.println(l1.getIntersectionNode().val);
        
    }

//---------------------- Intersection Point--------------------------------

    public ListNode getIntersectionNode(){
        // get the size
        int sizeA = getCount(headA);
        int sizeB = getCount(headB);
        
        // Skip some nodes to bring both heads to equal lengths
        while (sizeA>sizeB) {
            headA =headA.next;
            sizeA--;
        }
        while (sizeB>sizeA) {
            headB =  headB.next;
            sizeB--;
        }

        // Check if they meet
        while (headA!=headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        // Check if there is intersection point or not
        if(headA==null){
            return null;
        }
        else{
            return headA;
        }
    }

// --------------------Count number of nodes---------------------------
    public static int getCount(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
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
