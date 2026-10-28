public class SinglyLinkedListClass 
{

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

    static void printElements(Node head)
    {
        if(head == null)
        {
            System.out.println("node  is  empty");
            return;
        }

        Node currentHead = head;
        System.out.print("head -> ");
        while(currentHead != null)
        {
            System.out.print(currentHead.data+ " ->");
            currentHead = currentHead.next;
        }
        System.out.print("null");

    }

    static void getMiddleELement(Node head)
    {
        System.out.println();
        if(head == null)
        {
            System.out.println("node is empty");
            return;
        }
        
        if(head.next.next == null)
        {

            System.out.println(head.data); 
            return;
        }
        Node slow = head;
        Node fast = head; 
        while( fast.next != null && fast.next.next!=null )
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    static Node getFifthEvenNumber(Node head)
    {
        if (head == null || head.next == null) 
        {
            return null;
        }
        Node currentHead = head.next;
        int count = 1;
        while(currentHead != null)
        {
            if(count == 5)
            {
                return currentHead;
            }
            if( currentHead.next == null ||currentHead.next.next == null)
            {
                return null;
            }
            count++;
            currentHead = currentHead.next.next;
            
        }
        
        return null;

    }
    public static void main(String[] args)
    {
        Node obj = new Node();
        obj.data = 10;

        obj.next = new Node();
        obj.next.data = 20;

        obj.next.next = new Node();
        obj.next.next.data = 30;
        
        Node head = obj;

        Node obj2 = new Node();
        obj2.data = 40;
        obj.next.next.next = obj2;
        obj2.next = null;
        
        obj2.next = new Node();
        obj2.next.data = 50;
        obj2.next.next = null; 

        inserAtEnd(60 , head);
        inserAtEnd(70 , head);
        inserAtEnd(80 , head);
        //inserAtEnd(90 , head);
        //inserAtEnd(100 , head);
    
        // print all elements in the list
        printElements(head);

        // getting middle element in the list
        getMiddleELement(head);

        //printing the 5th even number 
        Node fifthEvenNode = getFifthEvenNumber(head);
        if(!(fifthEvenNode == null))
        System.out.println("the fifth even node is "+ fifthEvenNode.data);
        else
        System.out.println("the 5th even number not exist");

    }
}
