package Week12;

/**
 * Created by David Chenette on 4/6/2016.
 */
import java.util.Scanner;

public class HW528 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's average:");
        int average = input.nextInt();


        System.out.printf("The returned value is %d", qualityPoints(average));
    }
    public static int qualityPoints(int average) {
        if (average >= 90)
        {
            return 4;
        }
        if (average >= 80)
        {
            return 3;
        }
        if (average >= 70)
        {
            return 2;
        }
        if (average >= 60)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

