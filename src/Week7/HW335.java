package Week7;

/**
 * Created by David Chenette on 2/17/2016.
 */

import java.util.Scanner;

public class HW335 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("What is the first side length?");
        a = input.nextInt();
        System.out.println("What is the second side length?");
        b = input.nextInt();
        System.out.println("What is the third side length?");
        c = input.nextInt();

        if (a + b > c && c + b > a && b + c > a )
        {
            System.out.print("It is a triangle");
        }
        else
        {
            System.out.print("It is not a trianle");
        }
    }
}
