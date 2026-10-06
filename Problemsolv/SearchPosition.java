public class SearchPosition
{
    static int searchInsertPosition(int[] arr , int target)
    {

        if(arr == null)
        {
            return -1;
        }
        else if(arr.length == 0)
        {
            return 0; 
        }
        for(int i = 0 ; i < arr.length; i++)
        {

            
            if(target == arr[i])
            {
                return i;
            }
            else if(target < arr[i])
            {
                return i;
            }
            
            else if(i == arr.length-1 && target != arr[i])
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {

        int[] arr = {};
        int target = 6;

       System.out.println( searchInsertPosition(arr,target));
    }
}
