public class LinkListMergeKList {
    public static ListNode head;
    public static ListNode tail;
    public static int size=0;
    public static void main(String args[]){
        
    }

    public ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode mergedList = null;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<=l2.val){
            mergedList = l1;
            mergedList.next = mergeLists(l1.next, l2);
            return mergedList;
        }
        else{
            mergedList =l2;
             mergedList.next = mergeLists(l1, l2.next);
             return mergedList;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged = null;
        for(int i=0; i<lists.length;i++){
            merged = mergeLists(merged, lists[i]);
        }
        return merged;
    }
    //-------------Node class-----------------------------------------------------+
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }

    }
    //-----------------Adding Elements------------------------------------------------

    // Add element at the head

    public  void addNodeAtHead(int data){
        
        // create a new node

        ListNode newNode = new ListNode(data);
        size++;

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        } 

        // set the link of new node to current head

        newNode.next = head;

        // set the head node to the new node

        head = newNode;
    }

//-----------------Printing Elements------------------------------------------------

    // Print the elements in the list
    
    public void printList(ListNode head){
        // preserve the head
        ListNode temp = head;
        if(size ==0){
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
