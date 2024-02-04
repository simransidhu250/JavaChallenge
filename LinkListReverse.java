public class LinkListReverse {
    public static Node head;

    public static void main(String args[]){
        LinkListReverse ll = new LinkListReverse();

        //  Add elements
        
        ll.addNodeAtHead(4);
        ll.addNodeAtHead(3);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(1);


        // print elements

        ll.printList();

        // reverse the list

        ll.reverseList();

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

//-----------------Reverse List------------------------------------------------

public void reverseList(){
    Node prev = null;
    Node curr = head;
    while(head.next != null){
        curr = head;
        head = head.next;
        curr.next = prev;
        prev = curr;
    }
    head.next = prev;

}
//-----------------Adding Elements------------------------------------------------

    // Add element at the head

    public  void addNodeAtHead(int data){
        
        // create a new node

        Node newNode = new Node(data);


        if(head == null){
            head = newNode;
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
    
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
