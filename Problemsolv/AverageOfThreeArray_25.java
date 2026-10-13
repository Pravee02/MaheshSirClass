public class AverageOfThreeArray_25
{
    static int[] AverageOfThreeArray(int[] arr1 , int[] arr2, int[] arr3)
    {
        int sum1 = 0;
        int sum2 = 0; 
        int sum3 = 0;
        int[] avgarr = new int[3];
        for(int i = 0; i < arr3.length; i++)
        {
            if(i < arr1.length)
            {
                sum1 = sum1+ arr1[i];
            }

            if(i < arr2.length)
            {
                sum2 = sum2+ arr2[i];
            }
            
            if(i < arr3.length)
            {
                sum3 = sum3+ arr3[i];
            }
        }

        int average1 = sum1 / arr1.length;
        int average2 = sum2 / arr2.length;
        int average3 = sum3 / arr3.length;

        avgarr[0] = average1;
        avgarr[1] = average2;
        avgarr[2] = average3;

        return avgarr;


    }
    public static void main(String[] args)
    {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {5,15};
        int[] arr3 = {8, 8, 8, 8};


        int[] result = ( AverageOfThreeArray(arr1 , arr2 , arr3));
        for(int i : result)
        {
            System.out.println(i);
        }
    }
}
