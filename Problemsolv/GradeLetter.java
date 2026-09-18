import java.util.*;
public class GradeLetter {

    char toFindStudentGrade(float percentage) {

        if (percentage >= 90 && percentage < 100) 
        {
            return 'A';
        } else if (percentage >= 75 && percentage < 90) 
        {
            return 'B';
        }

        else if (percentage >= 60 && percentage < 75)
         {
            return 'C';
        }

        else if (percentage >= 40 && percentage < 60) 
        {
            return 'D';
        }

        else if (percentage <= 40)
        {
            return 'F';

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the percentage to your grade");
        float perc = sc.nextFloat();
        
        GradeLetter obj = new GradeLetter();
        char result = obj.toFindStudentGrade(perc);
        System.out.println("your grade is " +result);
    }
}
