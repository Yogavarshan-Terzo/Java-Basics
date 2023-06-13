import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age :");
        byte x = scanner.nextByte();
        System.out.println(x);
        System.out.print("Name :");
        String name = scanner.nextLine().trim();
        System.out.println(name);
    }
}