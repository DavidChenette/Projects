package Week13;

/**
 * Created by David Chenette on 4/6/2016.
 */

import java.util.Scanner;

public class LabGarage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;
        double fee = 0;
        double hours;

        System.out.print("Enter number of hours (a negative to quit):");
        hours = input.nextDouble();

        while (hours >= 0.0)
        {


            totalReceipts += calculateCharges(hours);
            System.out.printf("Current charge: %.2f, Total receipts:%.2f\n", calculateCharges(hours), totalReceipts);
            System.out.printf("Enter number of hours (a negative to quit): ");
            hours = input.nextDouble();
        }

    }
    static double calculateCharges(double hours)
    {
        double fee = 0;

        if (hours <= 3.0) {
            fee = 2.00;
        }
        if (hours > 3.0 && hours <= 17) {
            fee = 2.00 + ((hours - 3) * .50);
        }
        if (hours > 17) {
            fee = 10.0;
        }
        return fee;
    }
}
