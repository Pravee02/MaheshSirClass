public class isIncreasingOrder_13 
{
    static boolean isIncreasingOrder(int[] arr)
    {
        if(arr == null)
        {
            System.out.println("array is null");
        }
        boolean result = true;

        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                result = true;
            }
            else
            {
                return false;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,5,20,14};
        boolean res = isIncreasingOrder(arr);
        System.out.println(res);
    }
}
