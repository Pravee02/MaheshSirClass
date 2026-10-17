public class MostRunOvers_19
{
    static int mostRunOver(int[] arr)
    {
        if(arr == null || arr.length == 0)
            return -1;

    
       int mostRuns = arr[0];
       int mostrunover = 0;
       for(int i = 0; i < arr.length; i++)
       {
            if(arr[i] > mostRuns)
            {
                mostRuns = arr[i];
                mostrunover = i;
            }
       }
       return mostrunover + 1;


    }
    public static void main(String[] args) {
        int[] arr = {100, 12, 4, 15, 90 };
        System.out.println(mostRunOver(arr));
    }
}
