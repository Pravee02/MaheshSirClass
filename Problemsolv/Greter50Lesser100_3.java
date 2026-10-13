import java.util.ArrayList;
import java.util.Collection;

public class Greter50Lesser100_3 
{

    static Collection findGreaterAndLesser(int[] arr)
    {
        Collection nums = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 50 && arr[i] < 100)
            {
                nums.add(arr[i]);
            }
        }
        return nums;

        
        
    }
    public static void main(String[] args) {
        
    int[] arr = {45, 67, 100, 52, 99, 120, 50};

    Collection nums = findGreaterAndLesser(arr);

    System.out.println(nums);

    }
}
