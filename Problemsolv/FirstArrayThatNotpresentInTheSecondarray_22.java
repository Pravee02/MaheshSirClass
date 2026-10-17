public class FirstArrayThatNotpresentInTheSecondarray_22 
{
    static int[] firstArrayElementsThatAreNotPresentInSecondArray(int[] arr1, int[] arr2)
    {
        if(arr1 == null || arr1.length == 0 )
        {
            return arr1;
        }
        if(arr2.length == 0)
        {
            return arr1;
        }
        int count = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            boolean flag = false;
            for(int j = 0; j < arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                count++;
            }
        }
        int[] newArray = new int[count];
        int ni = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            boolean flag = false;

            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    flag = true;
                }
            }
            
            if(!flag)
            {
                newArray[ni] = arr1[i];
                ni++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) 
    {
    
        int[] arr1 = {1,4,6,8,10};
        int[] arr2 = {4,8,12};

        int[] result = firstArrayElementsThatAreNotPresentInSecondArray(arr1, arr2);

        for(int i : result)
        {
            System.out.print(i +  " ");
        }

        
    }
}
