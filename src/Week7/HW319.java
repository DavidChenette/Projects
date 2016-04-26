package Week7;

/**
 * Created by David Chenette on 2/23/2016.
 */
import java.util.Scanner;

public class HW319 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        double commission = 0;
        int value;
        int average;

        System.out.println("enter item value or enter '-1' if done");
        value = input.nextInt();

        while (value>0){
            total = total + value;
            commission = 200 + (total/100.)*9;

            System.out.println("endter next item value");
            value = input.nextInt();
        }
        System.out.printf("Your commission is $%.2f", commission);
    }
}