public class LinkListIntro {
    public static void main(String args[]){
        LinkListIntro ll = new LinkListIntro();

        //  Add elements
        
        ll.addNodeAtHead(0);
        ll.addNodeAtHead(1);
        ll.addNodeAtTail(2);
        ll.addNodeAtTail(3);

        // print elements

        ll.printList();

        // Add the element in the midde

        ll.addNodeAtMiddle(2, 9);

        // print list

        ll.printList();
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

    public  void addNodeAtHead(int data){
        
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

    public void addNodeAtTail(int data){

        // Create a newNode

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        // set the link
        tail.next = newNode;

        // tail is new node now

        tail = newNode;
    }

    public void printList(){
        // preserve the head
        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }


    // Add in the middle
    public void addNodeAtMiddle(int index, int data){
        // if element is to be added on head
        if(index == 0){
            addNodeAtHead(data);
            return;
        }

        // Create a new node
        Node newNode = new Node(data);

        int i=0;
        Node temp= head;

        // Iterate to reach to index previous to where the element needs to be added
        while (i<index-1) {
            temp = temp.next;
            i++;
        }

        // Set the links
        newNode.next = temp.next;
        temp.next = newNode;



    }

    
}
