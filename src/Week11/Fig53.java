package Week11;

/**
 * Created by David Chenette on 3/23/2016.
 */

import java.util.Scanner;
public class Fig53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = minimum(number1, number2, number3);
        System.out.println("Maximus is : " + result);



    }

    public static double minimum(double x, double y, double z) {
        double minimumValue = x;

        if (y < minimumValue) {
            minimumValue = y;
        }
        if (z < minimumValue) {
            minimumValue = z;
        }
        return minimumValue;
    }
}
