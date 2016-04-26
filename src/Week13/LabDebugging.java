package Week13;

/**
 * Created by David Chenette on 4/6/2016.
 */

import java.util.Scanner;

public class LabDebugging
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter the number of students you wish to average");
        int students2 = input.nextInt();

        int NumOfStudents = students2;
        int counter = 1;
        double total = 0;
        double previousNumber = 0;
        double newMaximum = 0;
        double newMinumum = 0;

        while (students2 != 0)
        {
            System.out.println("Please enter a greade");
            double givenNum = input.nextDouble();
            total += givenNum;

            if( counter == 1)
            {
                previousNumber = givenNum;
                newMinumum = givenNum;
            }
            if (newMaximum < givenNum)
            {
                newMaximum = maximum(previousNumber, givenNum);
            }
            if (newMinumum > givenNum)
            {
                newMaximum = minimum(previousNumber, givenNum);
            }

            students2--;
            counter++;
            previousNumber = givenNum;
        }
        double average1 = average (total, NumOfStudents);

        System.out.printf("The maxium:%.2f\nThe average:%.2f\nThe minimus:%.2f\n", newMaximum, average1, newMinumum);
    }

    public static double average (double x, double y)
    {
        double z = x/y;
        return z;
    }
    public static double maximum (double x, double y)
    {
        double q = Math.max(x,y);
        return q;
    }
    public static double minimum (double x, double y)
    {
        double m = Math.min(x,y);
        return m;
    }



}
