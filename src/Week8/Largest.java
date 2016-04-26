package Week8;

/**
 * Created by David Chenette on 2/24/2016.
 */

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = -2147483648;
        int number;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter Number:");
            number = input.nextInt();
            if (largest < number) {
                largest = number;
            }
            counter++;
        }
        System.out.printf("Largest number is %d", largest);
    }
}
