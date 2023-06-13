import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Implicit casting
        //byte > short > int > long > float > double
        short x = 3;
        int y =  x + 2;
        //Explicit Casting
        double a = 1.2;
        int b = (int)a + 2;
        //non-compatible casting
        //Use wrapper class
        String num1 = "1";
        Integer num2 = Integer.parseInt(num1);
    }
}