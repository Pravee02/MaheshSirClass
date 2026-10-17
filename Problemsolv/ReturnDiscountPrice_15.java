public class ReturnDiscountPrice_15
{
    static int returnDiscountPrice(int[] arr)
    {
        if(arr == null)
        {
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        int discount = 20;
        if(sum > 1000)
        {
            int discountAmount = sum * discount / 100;
            return sum - discountAmount;       
        }
        return sum;

    }
    public static void main(String[] args)
    {
    int[] arr = {400,350,450};
    System.out.println(returnDiscountPrice(arr));
        
    }
}
