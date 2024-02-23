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

        // if both keys data are same
        if(m==n){
            return;
        }


        // find first key

        ListNode curr1 = head;
        ListNode prev1 = null;

        while(curr1!=null && curr1.val!=m){
            prev1 = curr1;
            curr1 = curr1.next;
        }


        // find Second key

        ListNode curr2 = head;
        ListNode prev2 = null;
        while(curr2!=null && curr2.val!=n){
            prev2 = curr2;
            curr2 = curr2.next;
        }

        // case 1: we did not find one of the keys or both of the keys
        if(curr1==null || curr2==null){
            return;
        }

        // if the head node is key

        if(prev1!=null){
            prev1.next = curr2;
        }
        else{
            head = curr2;
        }

        if(prev2!=null){
            prev2.next = curr1;
        }
        else{
            head = curr1;
        }

        // set links
        ListNode temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
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
