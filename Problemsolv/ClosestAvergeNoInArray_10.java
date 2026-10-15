public class ClosestAvergeNoInArray_10
{
    static int findClosestNumberToAverege(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        int diference = average - arr[0];
        int closest = arr[0];

        for(int i = 0; i < arr.length ; i++)
        {
            int currentDiffrent = 0;
            if(arr[i] > average)
            {
                currentDiffrent = arr[i] - average;
            }
            else
            {
               currentDiffrent = average - arr[i];
            }
            

            if(currentDiffrent < diference)
            {
                diference = currentDiffrent;
                closest = arr[i];
            }

        }
        return closest;
    }
    public static void main(String[] args)
    {
    
        int[] arr = {2, 9, 4, 15};
        System.out.println(findClosestNumberToAverege( arr));

    }
}
