import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = x;
        x = 3;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
    }
}