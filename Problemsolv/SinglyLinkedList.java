public class SinglyLinkedList {


    public static void printList(Node node)
    {
        System.out.print(" head -> ");
        while (node != null)
        {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print(" null ");
    }

    public static Node insertAtStart(int data, Node head)
    {
        Node dBoss = new Node();
        dBoss.data = data;
        dBoss.next = null;

       dBoss.next = head;
       return dBoss;
    }

    public static void insdertAtEnd(int data, Node head)
    {
        Node dBoss = new Node();
        dBoss.data = data;
        dBoss.next = null;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = dBoss;
    }




    public static void main(String[] args) {
        // Create a new node and assigned the values
        Node firstNode = new Node();
        firstNode.data = 101;
        firstNode.next = null;

        // created a second node
        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;

        // Third node
        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        
        Node head = firstNode;
        printList(head);

        System.out.println("\nAfter inserting at start \n");
        head = insertAtStart(500, head);
        printList(head);

        System.out.println("\nAfter inserting at end \n");
        insdertAtEnd(1000, head);
        printList(head);
    }

    

}