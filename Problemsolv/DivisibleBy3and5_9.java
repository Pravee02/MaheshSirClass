public class DivisibleBy3and5_9
{
    static int countDivisibleBy3and5(int[] arr)
    {
        int count = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] %3 == 0 && arr[i] %5 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        
        int[] arr = {15, 9, 30, 10, 45, 7};
        System.out.println(countDivisibleBy3and5(arr));

    }
}
