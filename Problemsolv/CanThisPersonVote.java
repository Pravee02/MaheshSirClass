import java.util.*;

class CanThisPersonVote {

    boolean isPersonElegibeleToVote(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you age");
        int age = sc.nextInt();

        CanThisPersonVote obj = new CanThisPersonVote();

        boolean result = obj.isPersonElegibeleToVote(age);
        System.out.println(result);
    }
}