public class SinglyLinkedListClass 
{
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
        
        printElements(head);


        getMiddleELement(head);
    }
}
