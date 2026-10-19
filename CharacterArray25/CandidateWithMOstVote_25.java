package CharacterArray25;

public class CandidateWithMOstVote_25 
{

    static char getCandidateWithMostVote(char[] arr1, char[] arr2 , char[] arr3)
    {

        if(arr1 == null && arr2 == null && arr3 == null)
        {
            return 'n';
        }
        int greatestLength = 0;
        if(arr1.length > arr2.length && arr1.length > arr3.length)
        {
            greatestLength = arr1.length;
        }
        else if(arr2.length > arr3.length)
        {
            greatestLength = arr2.length;
        }
        else
        {
            greatestLength = arr3.length;
        }

        int aCount = 0;
        int bCount = 0;
        for(int i = 0; i < greatestLength; i++)
        {
            if(i < arr1.length)
            {
                if(arr1[i] == 'A' || arr1[i] == 'a')
                {
                    aCount++;
                }
                else
                {
                    bCount++;
                }
            }

            if(i < arr2.length)
            {
                if(arr2[i] == 'A' || arr2[i] == 'a')
                {
                    aCount++;
                }
                else
                {
                    bCount++;
                }
            }

            if(i < arr3.length)
            {
                if(arr3[i] == 'A' || arr3[i] == 'a')
                {
                    aCount++;
                }
                else
                {
                    bCount++;
                }
            }
        }

        if(aCount > bCount)
        {
            return 'A';
        }
        return 'B';
    }

    public static void main(String[] args)
    {
        char[] arr1 = {'a','a','b','b','b'};
        char[] arr2 = {'a','a','a','a','a','a'};
        char[] arr3 = {'a','b','b'};

        System.out.println(getCandidateWithMostVote(arr1,arr2,arr3));
    }
}
