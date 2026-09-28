import java.util.*;
public class BubbleSort
{
    static void bubbleSort(int[] nums)
    {
        boolean flag = true;
        int n = nums.length;
        while(flag == true)
        {
            flag = false;   
            for(int i = 0; i < n-1; i++){
                
                if(nums[i] > nums[i+1])
                {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    flag = true;
                }
            }
            
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+ " ");
        }

        

    }


    public  static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the "+n+" number of array elements ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        
    }
}
