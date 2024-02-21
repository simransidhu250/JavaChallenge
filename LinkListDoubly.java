public class LinkListDoubly {
    public static ListNode head = null;
    public static ListNode tail = null;
    public static int size = 0;
    public static void main(String args[]){
        LinkListDoubly ll = new LinkListDoubly();
        ll.addToHead(4);
    }
//--------------------Node class----------------------------------------------
    // Node class
    static class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
//---------------------Add node to head --------------------------------------------------

    public static void addToHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

//--------------------Print the doubly linked list--------------------------------------

    public void printList(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
    }
}
