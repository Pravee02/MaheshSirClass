public class HappyNumber

{
    static boolean isHappy(int n) {
        
        if(n == 1)
        {
            return true;
        }
        
        do{
            int sum = 0;
            while(n > 0)
            {
                int digit = n % 10;
                int square = digit * digit;
                sum = sum + square;
                n = n / 10;
            }
            if(sum == 1)
            {
                return true;
            }
            else
            {
                n = sum;
            }
        }
        while(n > 1);
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
    boolean res = (isHappy(n));
    System.out.println(res);
    }
}

