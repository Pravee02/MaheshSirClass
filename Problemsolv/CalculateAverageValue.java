public class CalculateAverageValue
{
    static double CalcAverageValue(int[] nums)
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
        double average = (double)sum / nums.length;
        return average;   
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,2};     // 30 / 6 = 5
        double result = CalcAverageValue(arr);
        System.out.println("the average value is " + result);
    }
    
}
