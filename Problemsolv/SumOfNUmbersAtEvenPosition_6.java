public class SumOfNUmbersAtEvenPosition_6 
{

    static int sumOfEvenPosition(int[] arr)
    {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i+=2)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int[] arr = {10, 3, 20, 7, 30};
        System.out.println(sumOfEvenPosition(arr));
    }
}
