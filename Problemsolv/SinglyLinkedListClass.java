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


    static int printDecimalValue(Node head)
    {
        if(head == null)
        {
            return 0;
        }
        int decimal = 0;
        while(head != null)
        {
            int num = head.data ;
            decimal = decimal * 10 + num;
            head = head.next;
        }
        int revDecimal = 0;
        while(decimal > 0)
        {
            int digit = decimal % 10;
            revDecimal = revDecimal * 10 + digit;
            decimal = decimal / 10;
        }
        return revDecimal;

    }

    static boolean isPalindrome(Node head)
    {
        if(head == null )
        {
            return false;
        }
        Node currentHead = head;
        int count = 0;
        while(currentHead != null)
        {
            count++;
            currentHead = currentHead.next;
        }

        int[] arr = new int[count];
        int i = 0;
        while(head != null)
        {
            arr[i] = head.data;
            head = head.next;
            i++;
        }

       int start = 0;
       int end = arr.length-1;

       while(start < end )
       {
        if(arr[start] != arr[end])
        {
            return false;
        }
        start++;
        end--;
       }
       return true;

        
    }


    static boolean isValuesSameInTwoList(Node head1 , Node head2)
    {
        if(head1 == null || head2 == null)
        {
            System.out.println("list is null");
            return false;
        }
        boolean result = true;
        while(head1 !=null || head2 != null)
        {
            if(head1 == null  || head2 == null)
            {
                return false;
            }
            else{
                if(head1.data != head2.data)
                {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Node obj = new Node();
        obj.data = 1;

        obj.next = new Node();
        obj.next.data = 2;

        obj.next.next = new Node();
        obj.next.next.data = 2;
        
        Node head = obj;

        Node obj2 = new Node();
        obj2.data = 1;
        obj.next.next.next = obj2;
        obj2.next = null;
        
        // obj2.next = new Node();
        // obj2.next.data = 50;
        // obj2.next.next = null; 

        //inserAtEnd(60 , head);
        //inserAtEnd(70 , head);
        //inserAtEnd(80 , head);
        //inserAtEnd(90 , head);
        //inserAtEnd(100 , head);

        // creating second list
        Node newHead = new Node();
        newHead.data = 1;
        Node head2 = newHead;

        inserAtEnd(2 , head2);
        inserAtEnd(2 , head2);
        inserAtEnd(1 , head2);
        inserAtEnd(1 , head2);
    
        // print all elements in the list
        System.out.println("priniting all elements in the list ");
        printElements(head);

        
        // getting middle element in the list
        System.out.println();
        System.out.println("printing middle elemet in the list ");
        getMiddleELement(head);

        //printing the 5th even number 
        System.out.println();
        System.out.println("printing fifth even element in list");
        Node fifthEvenNode = getFifthEvenNumber(head);
        if(!(fifthEvenNode == null))
        System.out.println("the fifth even node is "+ fifthEvenNode.data);
        else
        System.out.println("the 5th even number not exist");

        //decimal value of list
        System.out.println();
        System.out.println("printing decimal value of the list");
        System.out.println(printDecimalValue(head));

        // ispalindrome list 
        System.out.println();
        System.out.println("is palindrome or not ");
        System.out.println(isPalindrome(head));

        // check valuesare same between 2 lists
        System.out.println();
        System.out.println("is 2 list are equal  elemets in same order ");
        System.out.println(isValuesSameInTwoList(head , head2));

    }
}
