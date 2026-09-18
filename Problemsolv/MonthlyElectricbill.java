import java.util.*;

public class MonthlyElectricbill {

    double toFindTotalAmount(int units, float amount) {

        double result = units * amount;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of units used");
        int units = sc.nextInt();

        System.out.println("enter the amount per unit");
        float amount = sc.nextFloat();

        MonthlyElectricbill obj = new MonthlyElectricbill();
        double result = obj.toFindTotalAmount(units, amount);
        System.out.println("the total amount need to pay is " + result);
    }
}
