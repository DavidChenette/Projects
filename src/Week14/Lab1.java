package Week14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by David Chenette on 4/13/2016.
 */
public class Lab1 {
    public static void main(String[] args)
    {
            int[] numbers = new int[5];
            Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 grades");

        for (int i = 0; i < 5; i++)
        {
            numbers[i] = input.nextInt();
        }
        int sum = IntStream.of(numbers).sum();
        System.out.println("Numbers Generated: " + Arrays.toString(numbers));
        System.out.println("The sum is " + sum);
    }
}
