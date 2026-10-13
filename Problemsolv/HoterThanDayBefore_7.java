public class HoterThanDayBefore_7
{
    static int countHoterdayThanBefore(int[] arr)
    {
        int count = 0 ;
        for(int i = 0 ; i < arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                count++;
            }
        }
        return count;   
    }
    public static void main(String[] args)
    {
        int[] arr =  {30, 32, 31, 35, 36, 34, 37};
        System.out.println(countHoterdayThanBefore(arr));
    }
}
