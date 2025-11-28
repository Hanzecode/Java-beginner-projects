import java.util.Scanner;
import java.util.Random;

public class compound_intest_calculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double interest = scanner.nextDouble()/100;

        System.out.print("How many times you invest in a year?: ");
        int times = scanner.nextInt();

        System.out.print("How many years that you invest?: ");
        int years = scanner.nextInt();

        scanner.close();

        double total_profit = amount* (Math.pow(1 + interest/times, times * years) -1) / (interest / times) - amount*times*years;
        System.out.printf("Total return of %,.1f$ for %d times/year after %d years is %,.1f$", amount,times, years, total_profit);

    }
}
