package Week12;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by David Chenette on 3/30/2016.
 */
public class HW529 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1, Toss coin\n2. Exit: ");
        int choice = input.nextInt();
        int heads = 0;
        int tails = 0;

        while (choice != 2) {
            int coin = flip();


            if (coin == 1) {
                System.out.println("You flipped Heads!");

                heads += 1;
            }
            else {
                System.out.println("You flipped Tails!");

                tails += 1;
            }
            System.out.printf("%d heads,%d tails\n", heads, tails);

            System.out.println("1. Toss coin\n2. Exit:");
            choice = input.nextInt();
        }

    }
    static int flip()
    {
        Random randomNumber = new Random();
        int result = 1 + randomNumber.nextInt(2);

        return result;
    }
}
