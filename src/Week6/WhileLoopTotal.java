package Week6;

import java.util.Scanner;

/**
 * Created by David Chenette on 2/17/2016.
 */
public class WhileLoopTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int numberOfStudents = 0;
        int age;
        int average;


        System.out.println("endter age");
        age = input.nextInt();

        while (age > 0)
        {
            total = total + age;
            numberOfStudents =  numberOfStudents + 1;

            System.out.println("endter next age");
            age = input.nextInt();
        }

        average = total/numberOfStudents;
        System.out.println("The average is "+ average);
    }
}