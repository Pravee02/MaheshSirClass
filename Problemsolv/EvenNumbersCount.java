public class EvenNumbersCount
{
    static int countEvenNumber(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return -1;
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            count++;
        }
        return count;
    }
public static void main(String[] args)
{
    int[] arr = {10,2,5,6,9,8,7,4,55,8,9,4,5,9,5,2,8};
    int result = countEvenNumber(arr);
    System.out.println("the total even numbers in the given array was " +result);
}    
}
