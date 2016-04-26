package Week8;

/**
 * Created by David Chenette on 2/24/2016.
 */

        import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;

        while (a > 0 ){
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println("sum of digits is " + sum);
    }
}
