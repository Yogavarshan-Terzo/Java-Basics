import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String price = currency.format(89342.32);
        System.out.println(price);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.1);
        System.out.println(percentage);
    }
}