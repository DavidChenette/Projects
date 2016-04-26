package Week7;

import java.util.Scanner;

/**
 * Created by David Chenette on 2/17/2016.
 */
public class HW329 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         //create Scanner to obtain input
        System.out.println("Enter a number for the side of square");
        int side = input.nextInt();

        for (int row = 1; row <= side; row++){
            if (row == 1 || row == side) {
                for (int i = 1; i <= side; i++) {
                    System.out.print("*");
                }
            }

            else {
                for (int j = 1; j <= side; j++)
                    {
                        if (j == 1 || j == side) {
                            System.out.print("*");
                        }

                        else {
                            System.out.print(" ");
                        }
                    }
            }
            System.out.println();
        }
    }
}