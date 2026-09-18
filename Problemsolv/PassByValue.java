public class PassByValue {
    
    public static int makeItHalf(int num )
    {
        num = num/2;
        return num;
    }


public static void main(String[] args) {
    
    
    int number = 10;

    number = makeItHalf(number);  // pass by value

    System.out.println(number);
}
}