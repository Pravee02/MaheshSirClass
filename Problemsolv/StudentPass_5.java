import java.util.*;

public class StudentPass_5
{

    static int stundentsPassCount(int[] marks)
    {
        int count = 0;
        for(int i = 0 ; i < marks.length; i++)
        {
            if (marks[i] < 0 || marks[i] > 100)
            {
                return -1;
            }

            else if (marks[i] >= 35 && marks[i] <= 100) 
            {
                count++;
            }
        
        }
            return count;
    }
    public static void main(String[] args)
    {
        int[] marks = {40, 22, 35, 90, 18};

        System.out.println(stundentsPassCount(marks));
        

    }
}
