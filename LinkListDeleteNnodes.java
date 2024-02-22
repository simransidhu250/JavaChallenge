public class LinkListDeleteNnodes {
    public static ListNode head = null;
    public static ListNode tail = null;
    public static int size = 0;

    public static void main(String args[]){
        LinkListDeleteNnodes ll = new LinkListDeleteNnodes();

        // add nodes tot eh link list
        for(int i=10; i>0;i--){
            ll.addToHead(i);
        }

        // print linked list
        ll.printList();

        ll.retainSkip(3, 2);
        
        // print linked list
        ll.printList();


    }
//-----------------------Retain and Skip Nodes-------------------------------

    public void retainSkip(int m, int n){
        int count = 0;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(count<=m){
                if(prev==null){
                    prev=curr=null;
                    return;
                }
                prev.next = curr;
                prev = curr;
            }

            curr = curr.next;
            if(count==m+n){
                count = 1;
            }else{
                count++;
            }
        }
    }

//--------------------Node class----------------------------------------------
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

    public void addToHead(int val){
        ListNode temp = new ListNode(val);
        size++;

        // edge case
        if(head == null){
            head= tail = temp;
            return;
        }

        temp.next = head;
        head.prev = temp;
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
