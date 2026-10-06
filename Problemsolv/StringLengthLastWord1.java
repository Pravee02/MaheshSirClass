public class StringLengthLastWord1
{

    static int countLastWord(String sentence)
    {
        int count = 0;
        if(sentence.length() == 0)
        {
            return 0;
        }
        else
        {
           
            for(int i = sentence.length()-1; i >= 0 ; i--)
            {
                if(sentence.charAt(i) ==  ' ')
                {
                    if(count > 0)
                    {
                        return count;
                    }
                }
                
                else
                {
                     
                    count++;
                    
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
    
            String name = " rohanthfg  ";
            System.out.println(countLastWord(name));
    }
}
