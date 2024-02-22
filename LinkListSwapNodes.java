public class LinkListSwapNodes {
    public static ListNode head = null;
    public static int size = 0;

    public static void main(String args[]){
        LinkListSwapNodes ll = new LinkListSwapNodes();

        // add nodes to the link list
        for(int i=10; i>0;i--){
            ll.addToHead(i);
        }

        // print linked list
        ll.printList();

        ll.swap(3, 6);
        ll.printList();

    }
    //Swap nodes function
    public void swap(int m, int n){
        ListNode curr = head;
        ListNode prev1 = null;
        ListNode prev2 = null;
        ListNode key1 = null;
        ListNode key2 = null;

        // if both keys data are same
        if(m==n){
            return;
        }

        // find previous of key1
        while (curr!=null&& curr.val!=m) {
            if(curr.val == m){
                key1 = prev1; 
            }
            prev1 = curr;
            curr = curr.next;  
        }

        // find previous of key2
        while (curr!=null&& curr.val!=n) {
            if(curr.val== n){
                key2 = prev2;
            }
            prev2 = curr;
            curr = curr.next;  
        }


        ListNode temp = key1.next;
        key1.next = key2.next;
        key2.next = temp;
        temp = key1.next.next;
        key1.next.next = key2.next.next;
        key2.next.next = temp;
        // System.out.println(temp.val);
        // System.out.println(key1.next.val);
    }

//--------------------Node class----------------------------------------------
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
//---------------------Add node to head --------------------------------------------------

    public void addToHead(int val){
        ListNode temp = new ListNode(val);
        size++;

        // edge case
        if(head == null){
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }
//--------------------Print the linked list--------------------------------------

    public void printList(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
