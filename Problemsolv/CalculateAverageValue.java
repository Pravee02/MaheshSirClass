public class CalculateAverageValue
{
    static int CalcAverageValue(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        int average = sum / nums.length;
        return average;   
    }
    public static void main(String[] args)
    {
        int[] arr = {55,9,9,5,1,7,2,9};     // 30 / 6 = 5
        int result = CalcAverageValue(arr);
        System.out.println("the average value is " + result);
    }
    
}
