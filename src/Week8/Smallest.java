package Week8;

/**
 * Created by David Chenette on 3/23/2016.
 */
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double smallest;
        smallest = 2147483647;
        double number;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter Number:");
            number = input.nextInt();
            if (smallest > number) {
                smallest = number;
            }
            counter++;
        }
        System.out.printf("Smallest number is %.4f", smallest);
    }
}

