public class LinearSearch
{
    static boolean isKeyPresent(int[] nums, int key)
    {
        if(nums == null || nums.length == 0)
        {
            return false;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == key)
                return true; 
        }

        return false;
    }
    public static void main(String[] args)
    {

        int[] arr = {5,1,8,9,10};
        boolean result = isKeyPresent(arr, 10);
        System.out.println(result);
    }
}
