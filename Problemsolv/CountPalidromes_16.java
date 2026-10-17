public class CountPalidromes_16 
{
    static int countPalindromes(int[] arr)
    {
        if(arr == null)
        {
            return -1;
        }

        int count = 0;
        for(int i = 0; i < arr.length;i++)
        {
            int num = arr[i];
            int reverse = 0;
            
            while(num > 0)
            {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if(reverse == arr[i])
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] arr = {121,45,7,131,8 , 5449 , 19991};
        System.out.println(countPalindromes(arr));
    }
}
