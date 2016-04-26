package Week6;

/**
 * Created by David Chenette on 2/17/2016.
 */
import java.util.Scanner;

public class MovieTicket2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);         //create Scanner to obtain input

        int age;


        System.out.println("What is your age?");
        age = input.nextInt();
            if (age < 12 || age > 65)
            {
                System.out.print("The price is $7.00\n");
            }
            if (age < 0 || age > 100)
            {
                System.out.print("You are either unborn or very very old\n");
            }
            else
            {
                System.out.print("The price is $12.50");
            }

    }
}
