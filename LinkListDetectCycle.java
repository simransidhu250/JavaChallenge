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

        // Create cycle in link list

        Node temp = head;

        while (temp.next!=null) {
            temp = temp.next;
        }

        temp.next = head;


        // print elements

        // ll.printList(head);

        // Check if there is cycle or not

        System.out.println("Is there a cycle in link list? "+ll.detectCycle());




 
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

    public boolean detectCycle(){
       Node fastNode = head;
       Node slowNode = head;

       while(fastNode!=null){
        fastNode = fastNode.next.next;
        slowNode = slowNode.next;

        // check if there is cycle
        if(fastNode == slowNode){
            return true;
        }
       }
       return false;
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
