// public class SinglyLinkedList1
// {


//      static void printList(Node node)
//     {
//         while(node!=null)
//         {
//             System.out.print(node.data+" ->");
//             node = node.next;
//         }
//     }

//     static Node insertAtBigining(int data, Node head)
//     {
//         Node startNode = new Node();
//         startNode.data = data;
//         startNode.next = null;

//          startNode.next = head;   //this is valid 
//          head = startNode; // this is not vaid why , head variable of Node data type and in main method head is also a Node data type 

//          return startNode;


//     }

//     static void insertAtEnd(int data, Node head)
//     {
//         Node endNewNode = new Node();
//         endNewNode.data = data;
//         endNewNode.next = null;

        
//         Node temp = head;
//         while(temp.next != null )
//         {
         
//         temp = temp.next;  

//         }
//         temp.next = endNewNode;
//     }


//     static void insertAtMiddle(int data, Node head)   //10 - 100 - 101 - 102 - 103 - 600
//           {                                           //               *   insert here center of 101 and 102 is 999
//             Node middleNewNode = new Node();

//             middleNewNode.data = data;
//             middleNewNode.next = null;
//             Node temp = head;

//             while(temp.data != 101)
//             {
//                 temp = temp.next;
                

//             }
//             middleNewNode.next = temp.next;
//                 temp.next =  middleNewNode;


//           }




    




//     public static void main(String[] args)
//     {
       
//         Node  firstnode = new Node();
//         Node  secondnode = new Node();
//         Node  thirdnode = new Node();
       
//         Node head = firstnode;

//         firstnode.data = 101;
//         firstnode.next = null;
//         firstnode.next = secondnode;


//         secondnode.data = 102;
//         secondnode.next = null;
//         secondnode.next = thirdnode;

//         thirdnode.data = 103;
//         thirdnode.next = null;
        
//         System.out.println("predefined linked list");
//         printList(head);
        
//         System.out.println();
//         System.out.println("\nafter inserting new node at bigining");
//         head = insertAtBigining(10, head);
//         printList(head);


//         System.out.println();
//         System.out.println("\nafter inserting a new node at end");
//         insertAtEnd(600, head);
//         printList(head); 

//         System.out.println();
//         System.out.println("\nafter inserting a new node at middele ");
//         insertAtMiddle(999 , head );
//         printList(head);
//     }

    
// }









public class SingleLinkedList1
{
 public static void main(String[] args)
 {
    
    Node head = null;


        printList(head);
        System.out.println();

    //  insert at start calling

        head = insertAtStart(100,head);
        printList(head);

        System.out.println();
        head = insertAtStart(100,head);
        head = insertAtStart(101,head);
        head = insertAtStart(102,head);
        printList(head);


    //  insert at end calling
    
        System.out.println();
        head = inserAtEnd(1000 , head);
        printList(head);

    //  insert at middle calling

        System.out.println();
        inserAtMiddle(3,head,100);
        printList(head);

         // insert at middle but previous key calling

        System.out.println();
        insertBeforeKey(2000 , 3 , head);
        printList(head);

       // delete at start

        System.out.println();
        head = deleteAtStart(head);
        printList(head);

        // delete at end
        System.out.println();
        head = deleteAtEnd(head);
        printList(head);

        //delete at middle
        System.out.println();
        head = deletAtMiddle(head , 3);
        printList(head);
 }   

   
    // static void testInsertATStart()
    // {
    //     Node head = null;
    
    //     printList(head);
    //     System.out.println();

    
    //     head = insertAtStart(100,head);
    //     printList(head);

    //     System.out.println();
    //     head = insertAtStart(100,head);
    //     head = insertAtStart(101,head);
    //     head = insertAtStart(102,head);
    //     printList(head);

    // } 

    // static void testInsertAtEnd()
    // {
    //     Node head = null;

    //     System.out.println();
    //     head = inserAtEnd(1000 , head);
    //     printList(head);
    // }

    // static void testInsertAMiddle()
    // {
    //     Node head = null;

    //     System.out.println();
    //     inserAtMiddle(3,head,100);
    //     printList(head);
    // }

    // function defination
    
    // insert at start
    static Node insertAtStart(int value , Node currentHead)
    {
        Node newNode = new Node(); // creation of a new node and set the  values
        newNode.data = value;
        newNode.next = null;

        //test case 1 head is null or list is empty
        if (currentHead != null)
            newNode.next = currentHead;
        
        // list is not empty or there are one or more node
        return newNode;

    }

   
    // insert at end
    static Node inserAtEnd(int value,Node head)
    {
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        if(head == null)
        {
            return lastNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = lastNode;
        }
        return head;

    }

    // insert at middel
    static void  inserAtMiddle(int data , Node head , int key)
    {
        Node newMiddleNode = new Node();
        newMiddleNode.data = data;
        newMiddleNode.next = null;

        Node temp = head;

        if(temp == null)
        {
            return ;
        }
        else if(temp.data == key)
        {
            temp.next = newMiddleNode;
        }
        else
        {
            while(temp != null && temp.data != key)
            {
                temp = temp.next;
            }
          
        newMiddleNode.next = temp.next;
        temp.next = newMiddleNode;
        }
        
    }


    // printing list
    static void printList(Node head)
    {
        Node monkey = head;

        System.out.print("head -> ");
        while(monkey != null)
        {
            System.out.print(monkey.data +" -> ");
            monkey = monkey.next;
        }
        System.out.print("null");
    }

    // insert before key
    static void insertBeforeKey(int data , int key , Node head)
    {

        Node newMiddlepreNode = new Node();
        newMiddlepreNode.data = data;
        newMiddlepreNode.next = null;
        if(head == null)
        {
            return ;
        }
        else{
            Node temp = head;
            while(temp.next.data != key)
            {
                temp = temp.next;
            }
            newMiddlepreNode.next = temp.next;
            temp.next = newMiddlepreNode;
        }

    }
    // delete at start
    static  Node deleteAtStart(Node head)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            return head.next;
        }
    }

    // delete at end
    static  Node deleteAtEnd(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        else
        {
            Node lastButOne = head;
            while(lastButOne.next.next != null)
            {
                lastButOne = lastButOne.next;
            }
             lastButOne.next = null;
        }
        return head;
    }

    static Node deletAtMiddle(Node head , int data)
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            Node lastButOne = head;
            while(lastButOne.next.data != data)
            {
                lastButOne = lastButOne.next;
            }
            lastButOne.next = lastButOne.next.next;
        }
        return head;
    }


}