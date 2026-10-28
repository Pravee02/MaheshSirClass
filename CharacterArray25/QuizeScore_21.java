package CharacterArray25;

//Given a student's quiz answers and the answer key, 
//return the score (1 mark per correct answer).
// Input to the function: 
// ['A','C','B','D','A'] and ['A','B','B','D','C'] Return from the function:  3
public class QuizeScore_21 
{
    static int quizeMarksScore(char[] arr1,char[] arr2)
    {
        int correctAnswer = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] == arr2[i])
            {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }
   

    public static void main(String[] args) 
    {
        char[] arr1 = {'A','C','B','D','A' };
        char[] arr2 = {'A','B','B','D','C'};
        System.out.println(quizeMarksScore(arr1 , arr2));
    }
}
