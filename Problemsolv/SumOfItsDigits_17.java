public class SumOfItsDigits_17
{

    static int[] sumOfItsDigit(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return arr;
        }
        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            int num = arr[i];

            while (num > 0)
            {
            
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            newArray[i] = sum;
        }
        return newArray;
    }
    public static void main(String[] args)
    {
    int[] arr = { 123,45,9};
    int[] result = sumOfItsDigit(arr);
    for(int i : result)
    {
        System.out.print(i + " ");
    }
        
    }
}
