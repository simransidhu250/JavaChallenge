public class LinkListNthElement {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[]){
        LinkListNthElement ll = new LinkListNthElement();

        //  Add elements
        
        ll.addNodeAtHead(4);
        // ll.addNodeAtHead(3);
        // ll.addNodeAtHead(2);
        // ll.addNodeAtHead(1);


        // print elements

        ll.printList();

        // remove nth element

        System.out.println("The element removed is: "+ll.removeNthElement(4));

        // print elements

        ll.printList();

 
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

//-----------------Removing nth element------------------------------------------------

   public int removeNthElement(int n){
    Node temp = head;
    int data;
    int startPos = size -n;

    // If the index is out of bounds
    if(startPos<0){
        System.out.println("Invalid Index");
        return -1;
    }

    // If the list is empty
    if(size==0){
        size --;
        return -1;
    }

    // Element needs to be removed from head
    if(size==n){
        data = head.data;
        head = head.next;
        size --;
        return data;
    }

    for(int i=0; i<startPos-1; i++){
        temp = temp.next;
    }
    
    data = temp.next.data;
    temp.next = temp.next.next;
    size --;
    return data;
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
    
    public void printList(){
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

