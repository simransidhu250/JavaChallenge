public class LinkListPalindrome {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[]){
        LinkListPalindrome ll = new LinkListPalindrome();

        //  Add elements
        
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(2);
        ll.addNodeAtHead(1);


        // print elements

        // ll.printList(head);

        // remove nth element

        System.out.println("The List is palindrome: "+ll.palindrome());

        // print elements


 
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

//-----------------Palindrome Number------------------------------------------------

    public boolean palindrome(){

        // Step 1: Find the mid

        Node slow = head;
        Node fast = head;

        // edge cases
        if(size == 0|| size ==1){
            return true;
        }

        // slow will be the mid
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the link list

        Node curr = slow;   // starting mid
        Node prev = null;
        Node nex = null;

        // reverse

        while(curr!=null){
            nex = curr;
            curr = curr.next;
            nex.next = prev;
            prev = nex;          
        }
        Node halfHead = prev;
        Node firstHead = head;

        // Step 3: Compare both the halves have same data

        while(halfHead != null ){
            if(firstHead.data  != halfHead.data){
                return false;
            }

           firstHead = firstHead.next;
           halfHead = halfHead.next;
        }

        return true;


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
