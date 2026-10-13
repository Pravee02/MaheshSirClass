public class OddDoubleEvenHalved_8
{

    static int[] oddDoubleEveneHalf(int[] arr)
    {
        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] %2 != 0)
            {
                newArray[i] = arr[i] * 2;
            }
            else
            {
                newArray[i] = arr[i] / 2;
            }
        }
        return newArray;
    }
    public static void main(String[] args)
    {
        int[] arr = {4, 7, 10, 3};       
        int[] result = oddDoubleEveneHalf(arr);
        for(int i : result)
        {
            System.out.println(i);
        }
    }
}
