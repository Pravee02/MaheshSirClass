package CharacterArray25;

public class HtmlEncode 
{
    static int calculateRightIndex(char[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '\u0000')
            {
                return count-1;
            }
            if(arr[i] == ' ')
            {
                count = count+3;
            }
            else
            {
                count++;
            }
            
        }
        return count - 1;
    }

    static int calReadIndex(char[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++ )
        {
            if(arr[i] == '\u0000' )
            {
                break;
            }
            else
            {
                count++;
            }
        }
        return count-1;
    } 
    static char[] inplaceEncode(char[] arr)
    {
        int writeIndex = calculateRightIndex(arr);
        int readIndex = calReadIndex(arr);

        char[] a = { '0','2','%'};
        
        while(writeIndex >= 0 && readIndex >=0 )
        {
            if(arr[readIndex] == ' ')
            {
                for(int i = 0; i < a.length; i++)
                {
                    arr[writeIndex] = a[i];
                    writeIndex--;
                }
                readIndex--;
            }
            else
            {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
                readIndex--;
            }
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        String value = "http://a.com/b form/ submit";
        char[] arr = new char[50];

        for(int i = 0; i < value.length();i++)
        {
            arr[i] = value.charAt(i);
        }

        char[] result = inplaceEncode(arr);
        for(int i = 0; i < result.length;i++)
        {
            System.out.print(result[i]);
        }

    }
}
