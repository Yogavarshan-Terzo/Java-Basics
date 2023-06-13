import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message);
        //concatenation
        message = message + "!!";
        System.out.println(message);
        //length
        System.out.println(message.length());
        //endswith,startswith
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith(("H")));
        //uppercase,lowercase
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        //remove space
        System.out.println(message.trim());
        //find index of strings
        System.out.println(message.indexOf("!!"));
        //replace
        System.out.println(message.replace("!","#"));
    }
}