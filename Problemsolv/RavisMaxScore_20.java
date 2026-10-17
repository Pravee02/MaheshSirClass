public class RavisMaxScore_20 
{
    static int hoManySubjectsRavisScoredMaximumThanSitas(int[] arr1 ,int[] arr2)
    {
        if(arr1 == null)
        {
            return -1;
        }
        if(arr1.length != arr2.length)
        {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] > arr2[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
    
        int[] arr1 = {78,65,90,55,82};
        int[] arr2 = {70,80,85,60,82};

        System.out.println(hoManySubjectsRavisScoredMaximumThanSitas(arr1,arr2));
    }
}
