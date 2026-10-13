public class CharArrayInplaceUpdate
{

    static int calculateWriteIndex(char[] str,int length)
    {
        int count = 0;
        for(int i = 0; i < length;i++)
        {
            if(str[i] > '2' && str[i] <= '9')
            {
                count = count + (str[i] - '0') - 1;
            }
            else if(str[i] != '0')
            {
                count = count+1;
            }
        }
        return count - 1;
    }

    static int copyCharFromRtoL(char[] str, char ch, int count, int writeIndex)
    {
        while(count > 0)
        {
            str[writeIndex] = ch;
            writeIndex--;
            count--;
        }
        return writeIndex;
    }

    static void expandString(char[] str,int length)
    {
        int writeIndex = calculateWriteIndex(str,length);
        int readIndex =length-1;

        while(writeIndex >= 0)
        {
            if(str[readIndex] >= '2' && str[readIndex] <= '9')
            {
                int count = str[readIndex] - '0';
                writeIndex = copyCharFromRtoL(str , str[readIndex-1], count, writeIndex);
                readIndex -= 2;
            }
            else
            {
                str[writeIndex] = str[readIndex];
                writeIndex--;
                readIndex--;
            }
           
        }
    }
    public static void main(String[] aStrings)
    {
        char[] arr = new char[10];
        arr[0] = 'a';
        arr[1] = '3';
        arr[2] = 'b';
        arr[3] = '3';
        arr[4] = 'c';
        arr[5] = '3';

        expandString(arr,6);

        for(char i : arr)
        {
            System.out.println(i);
        }

    }
}
