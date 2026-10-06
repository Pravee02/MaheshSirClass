public class MovesZeroes
{
    static void movesZeroes(int[] arr)
    {
        int j = 1;
        for(int i = 0 ; i < arr.length-1 && j < arr.length;)
        {
            
                if(arr[i] == 0 && arr[j] ==0)
                {
                    j++;
                }
                else if(arr[i] == 0 && arr[j] != 0)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
                else if(arr[i] != 0 && arr[j] == 0)
                {
                    i++;
                }
                else if(arr[i] != 0 && arr[j] != 0)
                {
                    i++;
                    j++;
                
            }
        }
    }
    public static void main(String[] args)
    {

        int arr[] = {0,0,0,5,0,9,0 ,1, 0};

        movesZeroes(arr);

        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
