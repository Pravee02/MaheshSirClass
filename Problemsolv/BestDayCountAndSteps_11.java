public class BestDayCountAndSteps_11
{
    static int[] bestDayCount(int[] arr)
    {
        if(arr == null)
        return null;

        int count = 0;
        int bestDaySteps = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 10_000)
            {
                count++;
                if(arr[i] > bestDaySteps)
                {
                    bestDaySteps = arr[i];
                }
            }
            
        }
        if(count != 0 && bestDaySteps!= 0){
            return new int[] {count , bestDaySteps};
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args)
    {
        //int[] arr = {8_000,12_000,10_500,9_000,15_000};
        int[] arr = {0,0,0,0,0};
        int[] result = bestDayCount(arr);
        for(int i : result)
        {
            System.out.print(i + " ");
        }
    }
}
