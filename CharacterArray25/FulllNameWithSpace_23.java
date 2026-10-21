package CharacterArray25;

public class FulllNameWithSpace_23 
{

    static char[] spaceBetweenCharArray(char[] arr1 , char[] arr2)
    {
        if(arr1 == null || arr2 == null)
        {
            System.out.println("array is null");
            return null;
        }
        if(arr1.length == 0|| arr2.length ==0)
        {
            System.out.println("array is empty");
            return null;
        }

        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = length1+length2+1;

        char[] newArray = new char[length3];
        // for(int i = 0; i < arr1.length; i++)
        // {
        //     newArray[i] = arr1[i];
        // }
        int i = 0;
        for(int j = 0; j < newArray.length; j++)
        {
           
            if(j < arr1.length)
            {
                newArray[j] = arr1[j];
            }
            else if(j == arr1.length && i == 0)
            {
                newArray[j] = ' ';
                
            }
            else if(i < arr2.length)
            {
                
                newArray[j] = arr2[i];
                i++;
            }
        }

        // newArray[length1] = ' ';

        // int i =0;
        // for(int j = length1+1; j < length3; j++)
        // {
        //     newArray[j] = arr2[i];
        //     i++;
        // }
        return newArray;
        
    }
    public static void main(String[] args) 
    {
        char[] arr1 = {'r','a','m'};
        char[] arr2 = {'k','u','m','a','r'};

        
        char[] result = spaceBetweenCharArray(arr1,arr2);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
        }
        
    }
}
