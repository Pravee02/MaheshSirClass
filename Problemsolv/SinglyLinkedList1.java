public class SinglyLinkedList1
{


     static void printList(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ->");
            node = node.next;
        }
    }

    static Node insertAtBigining(int data, Node head)
    {
        Node startNode = new Node();
        startNode.data = data;
        startNode.next = null;

         startNode.next = head;   //this is valid 
         head = startNode; // this is not vaid why , head variable of Node data type and in main method head is also a Node data type 

         return startNode;


    }

    static void insertAtEnd(int data, Node head)
    {
        Node endNewNode = new Node();
        endNewNode.data = data;
        endNewNode.next = null;

        Node temp = head;
        while(temp.next != null )
        {
         
        temp = temp.next;  

        }
        temp.next = endNewNode;
    }


    static void insertAtMiddle(int data, Node head)   //10 - 100 - 101 - 102 - 103 - 600
          {                                           //               *   insert here center of 101 and 102 is 999
            Node middleNewNode = new Node();

            middleNewNode.data = data;
            middleNewNode.next = null;
            Node temp = head;

            while(temp.data != 101)
            {
                temp = temp.next;
                

            }
            middleNewNode.next = temp.next;
                temp.next =  middleNewNode;


          }




    




    public static void main(String[] args)
    {
       
        Node  firstnode = new Node();
        Node  secondnode = new Node();
        Node  thirdnode = new Node();
       
        Node head = firstnode;

        firstnode.data = 101;
        firstnode.next = null;
        firstnode.next = secondnode;


        secondnode.data = 102;
        secondnode.next = null;
        secondnode.next = thirdnode;

        thirdnode.data = 103;
        thirdnode.next = null;
        
       System.out.println("predefined linked list");
        printList(head);
        
        System.out.println();
        System.out.println("\nafter inserting new node at bigining");
        head = insertAtBigining(10, head);
        printList(head);


        System.out.println();
        System.out.println("\nafter inserting a new node at end");
        insertAtEnd(600, head);
        printList(head); 

        System.out.println();
        System.out.println("\nafter inserting a new node at middele ");
        insertAtMiddle(999 , head );
        printList(head);
    }

    
}