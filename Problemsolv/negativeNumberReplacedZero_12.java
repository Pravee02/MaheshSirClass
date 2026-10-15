public class negativeNumberReplacedZero_12
{
    static int[] negativeReplacedWithZero(int[] arr)
    {
        if(arr == null)
        {
            return null;
        }
        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                newArray[i] = 0;
            }
            else
            {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args)
    {
    int[] arr = {5,-3,8,-1,0};
    int[] newArray = negativeReplacedWithZero(arr);
    for(int i : newArray)
    {
        System.out.print(i+ " ");
    }

        
    }
}
