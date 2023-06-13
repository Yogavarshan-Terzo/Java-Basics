import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers1 = new int[5];
        numbers1[0] = 1;
        numbers1[1] = 2;
        System.out.println(Arrays.toString(numbers1));
        int [] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));

        int [][] array1 = new int [2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        System.out.println(Arrays.deepToString(array1));
        int [][] array2 = {{ 1, 2, 3},{ 4, 5, 6}};
        System.out.println(Arrays.deepToString(array2));
    }
}