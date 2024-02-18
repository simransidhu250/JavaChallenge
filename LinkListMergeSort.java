public class LinkListMergeSort {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[]){
        LinkListMergeSort ll= new LinkListMergeSort();

        //  Add elements
        
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(3);
        ll.addNodeAtHead(4);
        ll.addNodeAtHead(5);

        // print elements

        ll.printList(head);

        // Merge Sort
        
        ll.mergeSort(head);
 
    }

//-----------------Merge Sort------------------------------------------------

    public static Node mergeSort(Node head){

        //  find mid
        Node mid  = findMid();

        // Divide the link list into two halves
        Node rightHead = mid.next;
        Node leftHead = head;
        mid.next = null;

        leftHead = mergeSort(leftHead);
        rightHead = mergeSort(rightHead);

        // merge

        merge(leftHead, rightHead);

        return head;
    }
    static Node findMid(){
        Node slow=head, fast =head;
        // two pointer approach
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



   



//-----------------Creating node data type------------------------------------------------

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//-----------------Adding Elements------------------------------------------------

    // Add element at the head

    public  void addNodeAtHead(int data){
        
        // create a new node

        Node newNode = new Node(data);
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
    
    public void printList(Node head){
        // preserve the head
        Node temp = head;
        if(size ==0){
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
