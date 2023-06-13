import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1K to $1000K):");
        int principal = scanner.nextInt();
        while (!(principal >= 1_000 && principal <= 1_000_000)){
            System.out.println("Enter amount between 1000 and 1000000");
            System.out.print("Principal ($1K to $1000K):");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest rate :");
        float annualInterest = scanner.nextFloat();
        while (!(annualInterest > 0 && annualInterest <= 30)){
            System.out.println("Enter percentage between 1 and 30");
            System.out.print("Annual Interest rate :");
            annualInterest = scanner.nextFloat();
        }
        float monthlyInterest = annualInterest/PERCENT/MONTH_IN_YEAR;

        System.out.print("Period in Years :");
        byte years = scanner.nextByte();
        while (!(years >= 0 && years <= 30)){
            System.out.println("Enter years between 1 and 30");
            System.out.print("Period in Years :");
            years = scanner.nextByte();
        }
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal * (monthlyInterest * (Math.pow((monthlyInterest + 1),numberOfPayments))/(Math.pow((monthlyInterest + 1),numberOfPayments)-1));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));
    }
}