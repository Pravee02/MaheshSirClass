public class SinglyLinkedList
{

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
        
        Node bignode = new Node();
        bignode.data = 104;
        bignode.next = null;


         bignode.next = head;
         head = bignode;

        
        




       

       
    }
}
