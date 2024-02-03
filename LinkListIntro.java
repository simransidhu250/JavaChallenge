public class LinkListIntro {

    public static Node head;
    public static Node tail;
    public static int size=0;
    public static void main(String args[]){
        LinkListIntro ll = new LinkListIntro();

        //  Add elements
        
        ll.addNodeAtHead(4);
        ll.addNodeAtHead(1);
        ll.addNodeAtTail(2);
        ll.addNodeAtTail(3);

        // print elements

        ll.printList();

        // Add the element in the midde

        // ll.addNodeAtMiddle(2, 9);
        ll.addNodeAtMiddle(4, 9);
        // ll.addNodeAtMiddle(5, 9);

        // print list

        ll.printList();

        // Removing element from head;
        ll.removeFirst();

        // print list
        ll.printList();

        // Removing element at last;
        ll.removeLast();;

        // print list
        ll.printList();

        // Iterative Search
        System.out.println("Key present at : "+ll.iterativeSearch(6));

    }

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


    // Add the element at tail

    public void addNodeAtTail(int data){

        // Create a newNode

        Node newNode = new Node(data);

        size++;

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

        // Add in the middle
    public void addNodeAtMiddle(int index, int data){
        if(size<index){
            System.out.println("Invalid index");
            return;
        }

        // if element is to be added on head
        if(index == 0){
            addNodeAtHead(data);
            return;
        }

        // Create a new node
        Node newNode = new Node(data);
        size++;

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

//-----------------Printing Elements------------------------------------------------

    // Print the elements in the list
    
    public void printList(){
        // preserve the head
        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }


 //-----------------Removing Elements------------------------------------------------

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty! Cannot remove the element");
            return;
        }

        // re -link 
        head= head.next;

        // size updated
        size--;

        // tail value updated
        if(size==0){
            tail =null;
        }

    }

    public void removeLast(){
        // when list is empty
        if(size == 0){
            System.out.println("List is empty! Cannot remove element");
            return;
        }
        // when list contains one element
        else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }

        int i = 0;
        Node temp = head;
        while (size-2>i) {  
            temp = temp.next;
            i++;
        }

        // re-link
        temp.next = null;

        // update tail
        tail = temp;
        size--;
    }

//-----------------Searching Elements------------------------------------------------
    public int iterativeSearch(int key){

        Node temp = head;

        for(int i=0; i<size; i++){
            if(temp.data== key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    
}
