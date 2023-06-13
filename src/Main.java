import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //avoid quotation
        String message = "Hello \"World\"";
        System.out.println(message);
        //avoid \
        String dir = "c:\\Windows\\..";
        System.out.println(dir);
        //tab space
        message = "Hello\tWorld";
        System.out.println(message);
        //new line
        message = "Hello\nWorld";
        System.out.println(message);

    }
}