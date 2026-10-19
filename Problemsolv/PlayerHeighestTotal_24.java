public class PlayerHeighestTotal_24 
{
    static int highestRunScoredplayer(int[] arr1, int[] arr2, int[] arr3)
    {
        if(arr1 == null && arr2 == null && arr3 == null)
        {
            return -1;
        }
        int greatestLength = 0;
        int playerFirst = 0;
        int playerSecond = 0;
        int playerThird = 0;
        
        if(arr1.length > arr2.length && arr1.length > arr3.length)
        {
            greatestLength = arr1.length;
        }
        else if (arr2.length > arr3.length)
        {
            greatestLength = arr2.length;
        }
        else
        {
            greatestLength = arr3.length;
        }

        for(int i = 0; i < greatestLength; i++)
        {
            if(i < arr1.length)
            {
                playerFirst = playerFirst + arr1[i];
                
            }
            if(i < arr2.length)
            {
                playerSecond = playerSecond + arr2[i];
                
            }
            if(i < arr3.length)
            {
                playerThird = playerThird + arr3[i];
            }
        }
        if(playerFirst > playerSecond && playerFirst > playerThird)
        {
            return 1;
        }
        if(playerSecond > playerThird)
        {
            return 2;
        }
        return 3;
    } 
    public static void main(String[] args) 
    {
        
        int[] arr1 = {30,45,20,100};
        int[] arr2 = {50,10,40};
        int[] arr3 = {25,35,30,9000};
        System.out.println(highestRunScoredplayer(arr1, arr2, arr3));
    }

}
