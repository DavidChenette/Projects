package Week8;

/**
 * Created by David Chenette on 2/24/2016.
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        int option;
        double degree1;
        double celsius1;
        double fahrenheit1;

        option = 0;




        while (option != 3) {
            System.out.printf("%s\n%s\n%s\n", "1 for Fahrenheit to Celsius",
                    "2 for Celsius to Fahrenheit", "3 to quit:");
            option = input.nextInt();

            System.out.println("Eneter the degrees in Fahrenheit:");
            degree1 = input.nextDouble();

            celsius1 = (degree1 - 32) * (5.0 / 9.0);
            System.out.printf("The temp in Celsius is %.0f\n", celsius1);

            System.out.printf("%s\n%s\n%s\n", "1 for Fahrenheit to Celsius",
                    "2 for Celsius to Fahrenheit", "3 to quit:");
            option = input.nextInt();

            if (option == 2) ;

            System.out.println("Eneter the degrees in Celsius:");
            degree1 = input.nextDouble();

            fahrenheit1 = (degree1 * (9.0 / 5.0)) + 32;
            System.out.printf("The temp in Fahrenheit is %.0f\n", fahrenheit1);

            System.out.printf("%s\n%s\n%s\n", "1 for Fahrenheit to Celsius",
                    "2 for Celsius to Fahrenheit", "3 to quit:");
            option = input.nextInt();

            }
        }
    }

