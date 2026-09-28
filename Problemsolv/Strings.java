import java.util.*;
public class Strings
{

    static void stringOperations(String name)
    {

        int count = 0 ;
        try{
        for(int i = 0 ; ; i++)
        {
             name.charAt(i);
            count++;
        }
    }
    catch(StringIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
         System.out.println(count);
    }
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.nextLine();
        stringOperations(name);
    }    
}