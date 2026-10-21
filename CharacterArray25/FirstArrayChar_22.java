package CharacterArray25;
public class FirstArrayChar_22
{
    static char[] printingFirstCharThatAreNotInSecond(char[] arr1,char[] arr2)
    {
        if(arr1 == null || arr1.length == 0)
        {
            return new char[]{'n','u','l','l'};
        }

        int index = 0;
        char[] result = new char[arr1.length];
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
                result[index] = arr1[i]; 
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        
        char[] arr1 = {'a','b','c','d' };
        //char[] arr1 = null;
        char[] arr2 = { 'b' , 'd'};

       char[] result = printingFirstCharThatAreNotInSecond(arr1 , arr2);
       for(char i : result)
       {
        System.out.print(i);
       }
    }
}