package Week12;

import java.util.Scanner;

/**
 * Created by David Chenette on 3/30/2016.
 */
public class Calculator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        System.out.println("Welcome to Calculator");
        while (choice != 0) {
            System.out.println("choose 1 to add");
            System.out.println("choose 2 to subtract");
            System.out.println("choose 3 to multiply");
            System.out.println("choose 4 to divide");
            System.out.println("choose 0 to exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers to add");
                    double a = input.nextInt();
                    double b = input.nextInt();
                    System.out.println("the answer is " + add(a,b));
                    break;
                case 2:
                    System.out.print("Enter two numbers to subtract");
                    double c = input.nextInt();
                    double d = input.nextInt();
                    System.out.println("the answer is " + subtract(c,d));
                    break;
                case 3:
                    System.out.print("Enter two numbers to multiply");
                    double e = input.nextInt();
                    double f = input.nextInt();
                    System.out.println("the answer is " + multiply(e,f));
                    break;
                case 4:
                    System.out.print("Enter two numbers to divide");
                    double g = input.nextInt();
                    double h = input.nextInt();
                    System.out.println("the answer is " + divide(g,h));
                    break;
                default:
                    break;
            }

        }
    }
    static double add(double a, double b)
    {
        double z = a + b;
        return z;
    }
    static double subtract(double c, double d)
    {
        double z = c - d;
        return z;
    }static double multiply(double e, double f)
    {
        double z = e * f;
        return z;
    }static double divide(double g, double h)
    {
        double z = g / h;
        return z;
    }

}
