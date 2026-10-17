public class CountSignChanges_18
{
    static int countSignChnages(int[] arr)
    {
        int count = 0;
        for(int i = 0 ; i < arr.length-1; i++)
        {
            if(arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = {3,5,8,4,6};
        System.out.println(countSignChnages( arr));

    }
}