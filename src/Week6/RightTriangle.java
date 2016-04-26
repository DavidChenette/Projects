package Week6;

/**
 * Created by David Chenette on 2/17/2016.
 */

import java.util.Scanner;

public class RightTriangle {
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

        if (a*a + b*b == c*c || c*c + b*b == a*a || b*b + c*c == a*a )
        {
            System.out.print("It is a right triangle");
        }
        else
        {
            System.out.print("It is not a right trianle");
        }
    }
}
