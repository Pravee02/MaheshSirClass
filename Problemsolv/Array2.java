public class Array2
{
    static void printLeftToRight(int[] arr)
    {

        for(int i = 0 ; i < arr.length ; i++)
        {
            
            System.out.print(arr[i]+"  -> ");
        }
    }
    

    static void printRightToLeft(int[] arr)
     {

        for(int i = arr.length-1 ; i >= 0 ; i--)
        {
            
            System.out.print(arr[i]+"  -> ");
        }
     }

    static void printFromBothSides(int[] nums)
    {

        int left = 0;
        int right = nums.length - 1;

        while(left<=right)
        {
            System.out.print(nums[left] + " -> ");
            System.out.print(nums[right]);
            left++;
            right--;
            System.out.println();

        }
    }

    static void printFromMiddeltoBotheSide(int[] nums)
        {
            int left = 0;
            int right = 0;

            if(nums.length % 2 == 0)
            {
             left = nums.length/2-1;
             right =nums.length/2;
            }
            else{
            
            left = nums.length/2;
            right = nums.length/2;
            }
            
            while(left>=0 && right<=nums.length-1)
            {
                
                if(right == left)
                {
                      System.out.print(nums[left] );
                     
                }   
                else{      
                System.out.println();
                System.out.print(nums[left] + " -> ");
                System.out.print(nums[right]);
                
                System.out.println();
             
                }
                left--; 
                right++;
                
            }
        }
        
    
    

public static void main(String[] args)
    {
    
        
        int arr[] = { 1,2,3,4,5,6,7,8,9,10,11};

        // System.out.println("printing left to right");
        // printLeftToRight(arr); // calling method left to right

        // System.out.println();
        // System.out.println();

        // System.out.println("printing rigt to left");
        // printRightToLeft(arr); // callinf method right to left

        // System.out.println();
        // System.out.println();

        // System.out.println("printing two pointers");
        // printFromBothSides(arr);

        // System.out.println();
        // System.out.println();

        System.out.println("printing two pointers from middle");
        printFromMiddeltoBotheSide(arr);
    }
}
