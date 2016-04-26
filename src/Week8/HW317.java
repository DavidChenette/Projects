package Week8;


import java.util.Scanner;

public class HW317 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int j = 1;
        int miles = 1;
        int gallons;
        int average = 0;
        int averageTotal = 0;
        int averageCounter = 0;


        System.out.print("Enter number of miles for this trip (or -1 to quit):");
        miles = input.nextInt();

        while (miles != -1) {


            System.out.print("Enter number of gallons for this trip");
            gallons = input.nextInt();

            average = miles/gallons;
            averageCounter = averageCounter + average;

            averageTotal = averageCounter/j;
            j++;
            System.out.printf("the average miles per gallon for this trip is %d\n", average);

            System.out.print("Enter number of miles for this trip (or -1 to quit):");
            miles = input.nextInt();
        }

        System.out.printf("the average for all trips is %d", averageTotal);
    }
}