package CharacterArray25;

public class CheckIsSameElements_24 
{
    static boolean isElementsAresameInBothArray(char[] arr1 , char[] arr2)
    {
        if(arr1 == null || arr2 == null )
        {
            System.out.println("the array is null");
            return false;
        }
        
        if(arr1.length != arr2.length)
        {
            return false;
        }

        boolean[] arr3 = new boolean[arr1.length];
        // for(int i = 0; i < arr3.length;i++)
        // {
        //     arr3[i] = false;
        // }

        boolean result = true;
        
        for(int i = 0; i <arr1.length; i++)
        {
            result = false;
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])  // if it is 
                {
                    if(arr3[j] == false)
                    {
                        result = true;
                        arr3[j] = true;
                        break;
                    }                
                }
            }
            if(result == false)
            {
                return false;
            }
           
        }
        return true;
    }
    public static void main(String[] args) 
    {
        char[] arr1 = { 'a','a','b'};
        char[] arr2 = {'a','b','b'};
        System.out.println(isElementsAresameInBothArray(arr1, arr2));
    }
}
