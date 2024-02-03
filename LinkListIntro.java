public class LinkListIntro {
    public static void main(String args[]){
        LinkListIntro ll = new LinkListIntro();

        //  Add elements
        
        addNodeAtHead(0);
        addNodeAtHead(1);
        addNodeAtTail(2);
        addNodeAtTail(3);

        // print elements

        printList();
    }

    public static Node head;
    public static Node tail;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    // Add element at the head

    public static void addNodeAtHead(int data){
        
        // create a new node

        Node newNode = new Node(data);

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


    // Add the element at tail

    public static void addNodeAtTail(int data){

        // Create a newNode

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        // set the link
        tail.next = newNode;
    }

    public static void printList(){
        // preserve the head
        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }


    
}
