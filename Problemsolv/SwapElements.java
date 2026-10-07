public class SwapElements
{
    static void swapElements(int[] arr)
    {
    if(arr == null || arr.length == 0 || arr.length == 1)
        return ;
    
    int left = 0;
    int right = arr.length-1;
    
    while(left < right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6};
        swapElements(nums);

        for(int i : nums)
        {
            System.out.println(i);
        }
    }
}
