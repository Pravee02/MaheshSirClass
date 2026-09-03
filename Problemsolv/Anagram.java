
public class Anagram 
{
    public static void main(String[] args)
    {
        String value1 = "aba";
        String value2 = "bba";
        boolean result = true;

        if(value1.length() != value2.length())
        {
           result =false;
        }   

        else
        {
            boolean[] used = new boolean[value2.length()];


        for(int i = 0; i<value1.length();i++)
        {
            char c = value1.charAt(i);
            boolean found = false;
            
            for(int j = 0; j<value2.length(); j++)
            {
                char c1 =  value2.charAt(j);
                
                if(c == c1 && used[j] == false)  
                {
                  
                  used[j] = true;
                  found = true; 
                  break;
                }
                
            }
             if(found == false)
              {
                    result = false;
                    break;
                }
        }
       
    }
    System.out.println(result);

    }
}
