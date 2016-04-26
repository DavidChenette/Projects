package Week12;

/**
 * Created by David Chenette on 4/6/2016.
 */
import java.util.Scanner;

public class HW522 {
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

            celsius1 = calculateCelsius(degree1);
            System.out.printf("The temp in Celsius is %.0f\n", celsius1);

            System.out.printf("%s\n%s\n%s\n", "1 for Fahrenheit to Celsius",
                    "2 for Celsius to Fahrenheit", "3 to quit:");
            option = input.nextInt();

            if (option == 2) ;

            System.out.println("Eneter the degrees in Celsius:");
            degree1 = input.nextDouble();

            fahrenheit1 = calculateFahrenheit( degree1);
            System.out.printf("The temp in Fahrenheit is %.0f\n", fahrenheit1);

            System.out.printf("%s\n%s\n%s\n", "1 for Fahrenheit to Celsius",
                    "2 for Celsius to Fahrenheit", "3 to quit:");
            option = input.nextInt();

        }
    }
    static double calculateFahrenheit(double degree1)
    {
        double q = (degree1 * (9.0 / 5.0)) + 32;
        return q;
    }
    static double calculateCelsius(double degree1)
    {
        double z = (degree1 - 32) * (5.0 / 9.0);
        return z;
    }
}

