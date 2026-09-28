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
            System.out.println(" first string count is "+ count);
        }


    static void compareStrings(String name , String name1)
    {
        boolean result = true;
        for(int i = 0 ; i <= name.length() ; i++)
        {
            if(name.charAt(i) != name1.charAt(i))
            result = false;
            break;
        }
        System.out.println(" is strings are equal ? " +result);
    }

    static void concatinateString(String name , String name1)
    {
        char name3[] = new char[name.length() + name1.length()];

        for(int i = 0 ; i < name.length() ; i++)
        {
            name3[i] = name.charAt(i);
            System.out.print(name3[i]);
        }
        for(int i = 0 ; i < name1.length() ; i++)
        {
            name3[i] = name1.charAt(i);
        }
        for(int i = 0 ; i < name3.length ; i ++){
        System.out.print(name3[i]);
        }



    }
        public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.nextLine();

        System.out.println("enter the second  string");
        String name1 = sc.nextLine();

        stringOperations(name);
        compareStrings(name,name1);
        concatinateString(name,name1);

    }    
}