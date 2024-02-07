public class LinkListDetectCycle {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[]){
        LinkListDetectCycle ll = new LinkListDetectCycle();

        //  Add elements
        
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(1);


        // print elements

        ll.printList(head);






 
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

//-----------------Link List Cycle------------------------------------------------

    public void detectCycle(){
        
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
