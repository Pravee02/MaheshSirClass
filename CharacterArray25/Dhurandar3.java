package CharacterArray25;

public class Dhurandar3
{
    static void printChar(char[] arr)
    {
        if(arr == null || arr.length == 0)
            System.out.println("array is empty");
    
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i] );
        }
}
    public static void main(String[] args) 
    {
        String arr1 = " Hi Hamza, How Are You";
        char[] arr = arr1.toCharArray();
        printChar(arr);

    }
}
