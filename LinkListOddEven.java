public class LinkListOddEven {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void main(String args[]){
        LinkListOddEven ll = new LinkListOddEven();

        //  Add elements
        ll.addNodeAtHead(6);    
        ll.addNodeAtHead(1);
        ll.addNodeAtHead(4);
        ll.addNodeAtHead(5);
        ll.addNodeAtHead(10);
        ll.addNodeAtHead(12);
        ll.addNodeAtHead(8);

        // print list

        ll.printList(head);
    }

    public void OddEven(){
        Node lefthead = null;
        Node temp1 = head;

        // if the linked list is empty
        if(head == null){
            return;
        }

        // found first odd element
        while (lefthead!=null && temp1!=null) {
            if(temp1.data%2 !=0){
                lefthead = temp1;
            }
            temp1 = temp1.next;
        }
        
 
        Node righthead = null;
        Node temp2 = head;


        // found first even element
        while (righthead!=null && temp1!=null) {
            if(temp1.data%2 ==0){
                lefthead = temp1;
            }
            temp1 = temp1.next;
        }

        if(lefthead!=null){
            Node temp = lefthead.next;
            while(temp!=null){
                if(temp1.data%2 !=0){
                    temp= temp1;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }
        }


        Node temp3 = righthead.next;
        while(temp3==null){
            if(temp1.data%2 !=0){
                temp2= temp3;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }




 



    }
//------------------Node Class------------------------------------------------

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
