import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal :");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest rate :");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTH_IN_YEAR;

        System.out.print("Period in Years :");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal * (monthlyInterest * (Math.pow((monthlyInterest + 1),numberOfPayments))/(Math.pow((monthlyInterest + 1),numberOfPayments)-1));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));
    }
}