public class LinkListIntro {
    public static void main(String args[]){
        LinkListIntro ll = new LinkListIntro();
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







    
}
