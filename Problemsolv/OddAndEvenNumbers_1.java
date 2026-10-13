public class OddAndEvenNumbers_1
{

    static int[] oddEvenCount(int[] arr)
    {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] % 2 ==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        return new int[] { oddCount,evenCount};
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 8, 5, 12, 7};
        int[] result = oddEvenCount(arr);
        for(int i : result)
        {
            System.out.println(i);
        }
        
    }
}
