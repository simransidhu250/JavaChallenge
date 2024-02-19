public class LinkListZigZag {
   public static Node head;
   public static Node tail;
   public static int size=0;

   public static void main(String args[]){
       LinkListZigZag ll= new LinkListZigZag();

       //  Add elements
       
      //  ll.addNodeAtHead(6);
       ll.addNodeAtHead(5);
       ll.addNodeAtHead(4);
       ll.addNodeAtHead(3);
       ll.addNodeAtHead(2);
       ll.addNodeAtHead(1);

       // print elements

       ll.printList(head);

       // Zig Zag
       ll.zigZag(head);

       // print elements

       ll.printList(head);
       

   }

//-----------------Zig Zag------------------------------------------------

   public Node zigZag(Node head){

       // base case

       if(head == null || head.next == null){
           return head;
       }

       //  find mid
       Node mid  = findMid(head);

       // reverse the link list
       Node rightHead = mid.next;
       mid.next= null;
       rightHead = reverseList(rightHead);


       // Zig Zag Pattern

       printPattern(head, rightHead);

       return head;

  }
  
   static Node reverseList(Node rightHead){

      // reverse the list
      Node prev= null;
      Node next = null;
      while(rightHead!=null){
         next = rightHead.next;
         rightHead.next = prev; 
         prev = rightHead;
         rightHead = next;   
      }
      rightHead = prev;
      return rightHead;
   }

   static Node findMid(Node newList){
       Node slow=newList;
       Node fast =newList.next; // NOTE:-------------------we need last element of first half as middle--------
       // two pointer approach
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
   }

   static void printPattern(Node leftHead, Node rightHead){
       Node nextLeft = leftHead;
       Node nextRight = rightHead;

       // printing zig zag pattern
       while(leftHead!=null && rightHead!=null){
          nextLeft = leftHead.next;
          nextRight = rightHead.next;
          leftHead.next = rightHead;
          rightHead.next = nextLeft;
          leftHead = nextLeft;
          rightHead = nextRight;
           
       }
   }

  



//-----------------Creating node data type------------------------------------------------

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
