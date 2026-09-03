import java.util.*;
public class FindMaxMin
{
    static int maxfirst = Integer.MIN_VALUE    ;
    static int maxsecond = Integer.MIN_VALUE ;
    static int minfirst = Integer.MAX_VALUE ;
    static int minsecond = Integer.MAX_VALUE;

     static void CheckFirstmaxSecondmax(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]> maxfirst)
            {
                maxsecond = maxfirst;
                maxfirst = arr[i];
            }
            else if(arr[i]>maxsecond && arr[i]<maxfirst)
            {
                maxsecond = arr[i];
            }
        }
        System.out.println("the maxfirst value is "+maxfirst);
         System.out.println("the maxsecond value is "+maxsecond);
    }


    
     static void CheckFirstminSecondmin(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]< minfirst)
            {
                minsecond = minfirst;
                minfirst = arr[i];
            }
            else if(arr[i]<minsecond && arr[i]>minfirst)
            {
                minsecond = arr[i];
            }
        }
        System.out.println("the maxfirst value is "+minfirst);
         System.out.println("the maxsecond value is "+minsecond);
    }
    


    public static void main(Strings[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("enter the array element");
        for(int i = 0; i<arr.length;i++)
        {
           arr[i] = sc.nextInt();
        }

        CheckFirstmaxSecondmax(arr);
        CheckFirstminSecondmin(arr);
    }


    }


