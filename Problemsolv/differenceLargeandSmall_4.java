public class differenceLargeandSmall_4 
{
    static int getDiffrenecebwLargeAndSmall(int[] arr)
    {
        if(arr == null || arr.length == 0 || arr.length == 1)
        {
            return -1;
        }
        int maxelement = arr[0];
        int minelement = arr[0];
        for(int i : arr)
        {
            if(i > maxelement)
            {
                maxelement = i;
            }
            else if(i < minelement)
            {
                minelement = i;
            }
        }
        int result = maxelement - minelement;
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = { 4,3,27,9};
       System.out.println( getDiffrenecebwLargeAndSmall(arr));
    }

}
