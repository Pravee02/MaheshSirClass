public class TestStack
{

    public static void main(String[] args)
    {
        Stack obj = new Stack(5);
        
        System.out.println("after pushing one value");
        obj.push(10);
        obj.print();

        System.out.println("peek function call");
        System.out.println(obj.peek());

        obj.pop();
        System.out.println("after pop one value");
        
        obj.print();

    }
}
