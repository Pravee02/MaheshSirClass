public class PasswordCheck 
{
    static void isPasswordCorrect(char[] arr)
    {
        if(arr == null || arr.length < 8)
        {
            System.out.println("please enter utleast 8 characters password");
        }
        
        boolean isCaptialPressent = false;
        boolean issmallLettersPresent = false;
        boolean isDigitPresent = false;
        boolean isspecialCharacter = false;
        boolean islength = false;
        if(arr.length >= 8)
        {
            islength = true;
        }

        for(int i = 0; i < arr.length; i++)
        {
            
            if(arr[i]>='A' && arr[i] <= 'Z')
            {
                isCaptialPressent = true;
                continue;
            }
            if(arr[i] >='a' && arr[i] <='z')
            {
                issmallLettersPresent = true;
                continue;
            }
            if(arr[i] >= '0' && arr[i] <= '9')
            {
                isDigitPresent = true;
                continue;
            }
            if(arr[i] == '@' || arr[i] == '$' || arr[i] == '*')
            {
                isspecialCharacter = true;
                continue;
            }
        
        }

       
        if(!isCaptialPressent)
        {
            System.out.println("password must contain utleast one capital letter character : A - Z");
        }
        if(!isDigitPresent)
        {
            System.out.println("password must contain utleast one digit : 0 - 9");
        }
        if(!issmallLettersPresent)
        {
            System.out.println("password must contain utleast one lower case character : a - z");

        }
        if(!isspecialCharacter)
        {
            System.out.println("password must contain utleast one special case character : * , @ ,$ ");
        }
        if(isCaptialPressent  && isDigitPresent && issmallLettersPresent && isspecialCharacter && islength )
        {
            System.out.println("valid password");
        }
        
        else
        {
            System.out.println("password invalid ");
        }
    
    }
    public static void main(String[] args)
    {
        //char[] arr = { 'A' ,'r' , '8' , 'f' , 'b' , 'f' ,'@' };
        char[] arr = { 'a' ,'a' , 'a' , 'a' , 'a' , 'a' ,'a' };

        //char[] arr = {  'g' , '*' ,'h' ,'p'};
        isPasswordCorrect(arr);
    }
}
